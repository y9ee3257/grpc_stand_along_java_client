package com.tradery.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Define the SignalService service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: signal.proto")
public final class SignalGrpc {

  private SignalGrpc() {}

  public static final String SERVICE_NAME = "signalservice.Signal";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tradery.grpc.stubs.SignalOuterClass.SignalRequest,
      com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> getGetSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignal",
      requestType = com.tradery.grpc.stubs.SignalOuterClass.SignalRequest.class,
      responseType = com.tradery.grpc.stubs.SignalOuterClass.SignalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tradery.grpc.stubs.SignalOuterClass.SignalRequest,
      com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> getGetSignalMethod() {
    io.grpc.MethodDescriptor<com.tradery.grpc.stubs.SignalOuterClass.SignalRequest, com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> getGetSignalMethod;
    if ((getGetSignalMethod = SignalGrpc.getGetSignalMethod) == null) {
      synchronized (SignalGrpc.class) {
        if ((getGetSignalMethod = SignalGrpc.getGetSignalMethod) == null) {
          SignalGrpc.getGetSignalMethod = getGetSignalMethod = 
              io.grpc.MethodDescriptor.<com.tradery.grpc.stubs.SignalOuterClass.SignalRequest, com.tradery.grpc.stubs.SignalOuterClass.SignalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "signalservice.Signal", "GetSignal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tradery.grpc.stubs.SignalOuterClass.SignalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tradery.grpc.stubs.SignalOuterClass.SignalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SignalMethodDescriptorSupplier("GetSignal"))
                  .build();
          }
        }
     }
     return getGetSignalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignalStub newStub(io.grpc.Channel channel) {
    return new SignalStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignalBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SignalBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignalFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SignalFutureStub(channel);
  }

  /**
   * <pre>
   * Define the SignalService service.
   * </pre>
   */
  public static abstract class SignalImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to get a numeric signal.
     * </pre>
     */
    public void getSignal(com.tradery.grpc.stubs.SignalOuterClass.SignalRequest request,
        io.grpc.stub.StreamObserver<com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSignalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSignalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tradery.grpc.stubs.SignalOuterClass.SignalRequest,
                com.tradery.grpc.stubs.SignalOuterClass.SignalResponse>(
                  this, METHODID_GET_SIGNAL)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the SignalService service.
   * </pre>
   */
  public static final class SignalStub extends io.grpc.stub.AbstractStub<SignalStub> {
    private SignalStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get a numeric signal.
     * </pre>
     */
    public void getSignal(com.tradery.grpc.stubs.SignalOuterClass.SignalRequest request,
        io.grpc.stub.StreamObserver<com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSignalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the SignalService service.
   * </pre>
   */
  public static final class SignalBlockingStub extends io.grpc.stub.AbstractStub<SignalBlockingStub> {
    private SignalBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get a numeric signal.
     * </pre>
     */
    public com.tradery.grpc.stubs.SignalOuterClass.SignalResponse getSignal(com.tradery.grpc.stubs.SignalOuterClass.SignalRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSignalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the SignalService service.
   * </pre>
   */
  public static final class SignalFutureStub extends io.grpc.stub.AbstractStub<SignalFutureStub> {
    private SignalFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignalFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignalFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get a numeric signal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tradery.grpc.stubs.SignalOuterClass.SignalResponse> getSignal(
        com.tradery.grpc.stubs.SignalOuterClass.SignalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSignalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SIGNAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SignalImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SignalImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SIGNAL:
          serviceImpl.getSignal((com.tradery.grpc.stubs.SignalOuterClass.SignalRequest) request,
              (io.grpc.stub.StreamObserver<com.tradery.grpc.stubs.SignalOuterClass.SignalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SignalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignalBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tradery.grpc.stubs.SignalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Signal");
    }
  }

  private static final class SignalFileDescriptorSupplier
      extends SignalBaseDescriptorSupplier {
    SignalFileDescriptorSupplier() {}
  }

  private static final class SignalMethodDescriptorSupplier
      extends SignalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SignalMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SignalGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignalFileDescriptorSupplier())
              .addMethod(getGetSignalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
