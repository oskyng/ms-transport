FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
RUN ./mvnw dependency:go-offline

COPY src src
COPY Wallet_LaboratoryManagement Wallet_LaboratoryManagement

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/target/*.jar app-ms.jar
COPY --from=build /app/Wallet_LaboratoryManagement /app/Wallet_LaboratoryManagement

ENV TNS_ADMIN=/app/Wallet_LaboratoryManagement

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app-ms.jar"]