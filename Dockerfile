FROM backend-portfolio:1.8

MAINTAINER FireDust97

COPY target/firedust-0.0.1-SNAPSHOT.jar firedust-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/firedust-0.0.1-SNAPSHOT.jar"]
