FROM openjdk:8-jdk
ADD target/catalog.jar catalog.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "catalog.jar" ]
