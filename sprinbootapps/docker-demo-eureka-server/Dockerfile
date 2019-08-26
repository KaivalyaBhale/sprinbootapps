FROM java:8
EXPOSE 8761
ADD /target/docker-demo-eureka-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
