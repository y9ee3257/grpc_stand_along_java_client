1. Install maven and make sure $JAVA_HOME is pointing to a JDK
2. Run the below commands (defaults to insecure channel)
    ```
    mvn clean install 
    java -jar target/signal-service-grpc-1.0-SNAPSHOT-jar-with-dependencies.jar
    ```
   1. The first command installs all maven dependencies and creates an executable jar in "target" directory.\
   2. The second command run the executable jar file and prints the below output\
      Signal from Zeus - 1 \
      Signal from Athena - 0 
3. If you see the above output, it means the insecure channel is working. 
4. Go to src/main/com/tradery/grpc/SignalServiceClient.java and make necessary changes
   1. update the "hostname" and "port" if needed
   2. edit the cert here src/main/resources/signalserveraws.crt
   3. to switch to secure channel edit line "21:22" from "insecureCall" to "secureCall"
      ```
      int zeusRes = signalServiceClient.insecureCall("Zeus", "BTC", "BidirectionalTrend");
      int athenaRes = signalServiceClient.insecureCall("Athena1_4", "ETH", "Momentum");
      ```
5. For any code change, please do mvn clean install
6. Upon running on secure channel, you should see the below error, which is where I am stuck
   ```
   Caused by: io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine$OpenSslHandshakeException: error:1000012e:SSL routines:OPENSSL_internal:KEY_USAGE_BIT_INCORRECT
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.newSSLExceptionForError(ReferenceCountedOpenSslEngine.java:1393)
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.needWrapAgain(ReferenceCountedOpenSslEngine.java:1379)
        at io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslEngine.sslReadErrorResult(ReferenceCountedOpenSslEngine.java:1410)
   ```



