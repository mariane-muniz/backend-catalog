FROM openjdk:8-jdk
ADD target/catalog.war catalog.war
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "catalog.war" ]