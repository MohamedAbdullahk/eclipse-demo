FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the built jar (run: mvn package first)
# COPY target/my-api-0.0.1-SNAPSHOT.jar app.jar
COPY target/springboot-docker-kubernate-0.0.1-SNAPSHOT.jar my-docker.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "my-docker.jar"]