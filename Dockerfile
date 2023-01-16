FROM openjdk:17-jdk-slim-buster

EXPOSE 8080
WORKDIR ECSTestApplication

#RUN chmod 700 mvnw

CMD ["./mvnw", "clean", "package"]

#RUN mvn clean package

ARG JAR_FILE_PATH=target/*.jar

COPY ${JAR_FILE_PATH} app.jar
   

ENTRYPOINT ["java", "-jar", "app.jar"]
