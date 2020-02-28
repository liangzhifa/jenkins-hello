FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG hello-jenkins
ADD target/hello-jenkins.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app.jar"]