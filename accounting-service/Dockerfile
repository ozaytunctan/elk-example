FROM openjdk:17-alpine
ENV SPRING_PROFILES_ACTIVE=default
ENV SERVER_PORT=7070
COPY target/accounting.jar  accounting.jar

EXPOSE $SERVER_PORT
ENTRYPOINT ["java","-jar","accounting.jar"]