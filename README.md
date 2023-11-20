1. Install maven and make sure $JAVA_HOME is pointing to a JDK
2. Go to src/main/com/tradery/grpc/SignalServiceClient.java and modify necessary changes
   1. update the "hostname" and "port" if needed
   2. edit the cert here src/main/resources/signalserveraws.crt
   3. to switch between secure/insecure channels edit line "21:22" from "insecureCall" to "secureCall"
      ```
      int zeusRes = signalServiceClient.insecureCall("Zeus", "BTC", "BidirectionalTrend");
      int athenaRes = signalServiceClient.insecureCall("Athena1_4", "ETH", "Momentum");
      ```
3. Run the below commands (defaults to insecure channel)
    ```
    mvn clean install 
    java -jar target/signal-service-grpc-1.0-SNAPSHOT-jar-with-dependencies.jar
    ```
4. The first command installs all maven dependencies and creates an executable jar in "target" directory.\
5. The second command run the executable jar file and prints the below output\
   Signal from Zeus - 1 \
   Signal from Athena - 0 \
6. If you see the above output, it means the insecure channel is working. 
7. Upon switching to secure channel, you will see the below error
   ```
   Caused by: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine$OpenSslHandshakeException: error:1000012e:SSL routines:OPENSSL_internal:KEY_USAGE_BIT_INCORRECT
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.newSSLExceptionForError(ReferenceCountedOpenSslEngine.java:1393)
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.needWrapAgain(ReferenceCountedOpenSslEngine.java:1379)
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.sslReadErrorResult(ReferenceCountedOpenSslEngine.java:1410)
   ```
8. For any code change, please do mvn clean install



