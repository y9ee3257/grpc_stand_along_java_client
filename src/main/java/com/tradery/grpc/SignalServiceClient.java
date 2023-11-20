package com.tradery.grpc;

import com.tradery.grpc.stubs.SignalGrpc;
import com.tradery.grpc.stubs.SignalOuterClass;
import io.grpc.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author ravi teja thummala
 */
public class SignalServiceClient {

    public static void main(String[] args) {
        try {
            SignalServiceClient signalServiceClient = new SignalServiceClient();
            int zeusRes = signalServiceClient.secureCall("Zeus", "BTC", "BidirectionalTrend");
            int athenaRes = signalServiceClient.insecureCall("Athena1_4", "ETH", "Momentum");

            System.out.println("Signal from Zeus - " + zeusRes);
            System.out.println("Signal from Athena - " + athenaRes);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private int insecureCall(String modalName, String tickerSymbol, String strategy) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("ibsignal", 50051).usePlaintext().build();
        return grpcCall(channel, modalName, tickerSymbol, strategy);
    }

    private int secureCall(String modalName, String tickerSymbol, String strategy) throws IOException, URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("signalserveraws.crt");
        ChannelCredentials credentials = TlsChannelCredentials.newBuilder().trustManager(inputStream).build();
        ManagedChannel channel = Grpc.newChannelBuilderForAddress("ibsignal", 50052, credentials).build();
        return grpcCall(channel, modalName, tickerSymbol, strategy);
    }

    private int grpcCall(ManagedChannel channel, String modalName, String tickerSymbol, String strategy) {
        SignalOuterClass.SignalRequest req = SignalOuterClass.SignalRequest.newBuilder()
                .setModelName(modalName)
                .setTickerSymbol(tickerSymbol)
                .setStrategy(strategy).build();
        SignalGrpc.SignalBlockingStub stub = SignalGrpc.newBlockingStub(channel);
        int response = stub.getSignal(req).getSignal();
        channel.shutdown();
        return response;
    }

}
