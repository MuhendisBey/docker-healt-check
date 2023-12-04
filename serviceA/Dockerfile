FROM maven:3-jdk-11 as BUILDER
WORKDIR /build
COPY . .
RUN mvn package && \
    ls -la /build

FROM azul/zulu-openjdk-alpine:11-jre
COPY --from=BUILDER /build/target/serviceA-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
