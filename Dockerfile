FROM openjdk:11-jdk
#ADD target/spring-security-jwt-0.0.1.jar  springSecurity.jar
COPY target/spring-security-jwt-0.0.1.jar  springSecurity.jar
ENTRYPOINT ["java", "-jar", "spring-security-jwt-0.0.1.jar"]