# Stage 1: Build the app
FROM maven:3.9.9-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/student-management-system-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/student-management-system-0.0.1-SNAPSHOT.jar"]
