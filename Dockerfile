FROM docker.io/maven:3.5.2-jdk-8-alpine AS MAVEN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM docker.io/tomcat:9-jre8
COPY --from=MAVEN /tmp/target/*.war $CATALINA_HOME/webapps/