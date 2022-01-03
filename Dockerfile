FROM openjdk:11-jdk

ENTRYPOINT ["java", "-jar", "/spring-security-jwt-0.0.1.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
ADD target/spring-security-jwt-0.0.1.jar  springSecurity.jar