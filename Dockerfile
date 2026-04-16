FROM openjdk:8

WORKDIR /app
COPY target/*.jar app.jar

USER root

ENTRYPOINT ["java","-jar","app.jar"]
