
FROM openjdk:11
RUN mkdir -p /home/app
COPY . /home/app
ENTRYPOINT ["java", "-jar", "/home/app/target/micronaut-app-demo.jar"]

