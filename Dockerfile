FROM openjdk:8-jdk
VOLUME [ "/tmp" ]
COPY target/catalog.war /usr/local/tomcat/webapp/catalog.war
RUN sh -c "touch /usr/local/tomcat/webapp/catalog.war"
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapp/catalog.war" ]
