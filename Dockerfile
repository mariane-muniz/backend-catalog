FROM openjdk:8-jdk
ADD target/catalog.war catalog.war
RUN sh -c "touch catalog.war"
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar catalog.war" ]