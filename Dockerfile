FROM backend-portfolioargprog:8

COPY target/firedust-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]