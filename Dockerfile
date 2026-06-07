FROM FROM eclipse-temurin:17-jdk
EXPOSE 5000
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]