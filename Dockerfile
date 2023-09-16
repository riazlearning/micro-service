FROM eclipse-temurin
COPY target/micro-service-0.0.1-SNAPSHOT.war micro-service-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-jar", "/micro-service-0.0.1-SNAPSHOT.war"]