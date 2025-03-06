# First stage: Build the application using Maven
FROM --platform=linux/arm64 maven:3.8.7-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy only pom.xml first (for dependency caching optimization)
COPY pom.xml /app/
RUN mvn dependency:go-offline

# Copy the entire project
COPY . /app/

# Package the application using Maven
RUN mvn clean package

# Second stage: Use a lightweight JDK runtime for running the app
FROM --platform=linux/arm64 eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy only the built JAR from the previous stage
COPY --from=build /app/target/tripcost.jar /app/tripcost.jar

# Run the application
CMD ["java", "-jar", "/app/tripcost.jar"]