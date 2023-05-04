FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} get-service.jar
ENTRYPOINT ["java","-jar","/get-service.jar"]
EXPOSE 9021