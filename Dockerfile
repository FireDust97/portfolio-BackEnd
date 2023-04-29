FROM backend-portfolio:18

COPY target/firedust-0.0.1-SNAPSHOT.jar firedust-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/firedust-0.0.1-SNAPSHOT.jar"]
