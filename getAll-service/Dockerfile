FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} getall-service.jar
ENTRYPOINT ["java","-jar","/getall-service.jar"]
EXPOSE 9022