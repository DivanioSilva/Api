FROM bellsoft/liberica-openjdk-alpine:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8095
ENTRYPOINT ["java", "-Dspring.profiles.active=qua", "-jar","/app.jar"]
