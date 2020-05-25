FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim

ARG SPRING_PROFILES_ACTIVE=dev-gcp
ENV SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}

ARG LogAppender=CONSOLE
ENV LogAppender=${LogAppender}

ARG LogSeverity=INFO
ENV LogSeverity=${LogSeverity}

ARG ARTIFACT_NAME
COPY ./target/${ARTIFACT_NAME} /app/isom-service.jar

EXPOSE 8080

CMD ["java", "-Xmx512m", "-jar", "/app/isom-service.jar"]