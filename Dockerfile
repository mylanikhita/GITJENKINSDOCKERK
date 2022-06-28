FROM openJdk:8
EXPOSE 8080
ADD target/DockerExample-0.0.1-SNAPSHOT.jar DockerExample-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/DockerExample-0.0.1-SNAPSHOT.jar"]