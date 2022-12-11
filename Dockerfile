FROM maven:3.5.2-jdk-8-alpine AS MAVEN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM tomcat:9-jre8-alpine
COPY --from=MAVEN /tmp/target/*.war $CATALINA_HOME/webapps/