FROM openjdk:11

COPY target/Springboot-App.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "Springboot-App.jar"]
