FROM maven:3-jdk-11 as BUILDER
WORKDIR /opt/app
COPY . .
RUN mvn package
RUN ls  /opt/app/target/

FROM azul/zulu-openjdk-alpine:11-jre
COPY --from=BUILDER /opt/app/target/serviceA-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
