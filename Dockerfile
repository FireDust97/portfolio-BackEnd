FROM amazoncorretto:11-alpine-jdk

MAINTAINER FireDust97

COPY target/firedust-0.0.1-SNAPSHOT.jar backend-portfolioargprog.jar

entrypoint ["java","-jar","/backend-portfolioargprog.jar"]