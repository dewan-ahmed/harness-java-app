FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -DskipTests package

# Minimal, non-root, distroless runtime to reduce CVEs
FROM gcr.io/distroless/java17-debian12:nonroot
WORKDIR /app
COPY --from=build /workspace/target/harness-java-app-1.0.0.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]


