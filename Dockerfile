FROM openjdk:21

ARG APP_JAR=target/*.jar

COPY ${APP_JAR} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080