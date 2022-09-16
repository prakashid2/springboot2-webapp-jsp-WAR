FROM tomcat:jdk11-temurin-jammy
COPY ./springboot2-webapp-jsp-WAR.war /usr/local/tomcat/webapps
RUN cp -r /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps