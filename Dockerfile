FROM java8
VOLUME /tmp
ARG hello-jenkins
COPY target/hello-jenkins.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app.jar"]