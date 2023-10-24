FROM openjdk:8
EXPOSE 8099
ADD target/docker-jenkins-integration1.jar docker-jenkins-integration1.jar
ENTRYPOINT [ "java","-jar","/docker-jenkins-integration1.jar" ]