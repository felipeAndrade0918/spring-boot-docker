FROM openjdk:8-jdk-alpine

EXPOSE 8082
ENV PORT 8082

COPY ./target/*.jar ./

ENTRYPOINT java -jar $(find . -name *.jar) --server.port=$PORT