FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} create-service.jar
ENTRYPOINT ["java","-jar","/create-service.jar"]
EXPOSE 9020