# Use OpenJDK base image
FROM openjdk:23-jdk-slim
# Set working directory
WORKDIR /app
# Copy JAR file to container
COPY target/userservice-0.0.1-SNAPSHOT.jar /app/demo.jar
# Expose port 8081
EXPOSE 8081
# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]