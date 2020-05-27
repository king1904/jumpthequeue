FROM openjdk:8
WORKDIR /app


ADD server/target/jtqj-server-bootified.jar /app
ENTRYPOINT ["java","-jar","jtqj-server-bootified.jar -Dserver.port=$PORT"]

 