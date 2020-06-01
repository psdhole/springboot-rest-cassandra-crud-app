FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim
ENV PORT 8080
COPY target/*.jar /opt/isom-service.jar
WORKDIR /opt
ENTRYPOINT exec java $JAVA_OPTS -jar isom-service.jar
