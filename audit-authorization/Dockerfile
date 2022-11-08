FROM openjdk:8u131-jdk-alpine
EXPOSE 80
COPY ./target/auth-ms.jar auth-ms.jar 
ENTRYPOINT ["java","-jar","/auth-ms.jar"]