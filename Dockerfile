FROM openjdk:11
EXPOSE 8080
ADD target/spring-rest-image.jar spring-rest-image.jar
ENTRYPOINT ["java","-jar","/spring-rest-image.jar"]