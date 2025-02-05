FROM openjdk:17-alpine
ENV SPRING_PROFILES_ACTIVE=default
ENV SERVER_PORT=7071
COPY target/income.jar  income.jar
EXPOSE $SERVER_PORT
ENTRYPOINT ["java","-jar","income.jar"]