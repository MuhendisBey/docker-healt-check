FROM maven:3-jdk-11 as BUILDER
WORKDIR /build
COPY . .
RUN mvn package

FROM azul/zulu-openjdk-alpine:11-jre
COPY --from=BUILDER /build/target/serviceB-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
