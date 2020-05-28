FROM openjdk:8
VOLUME /tmp
ADD ./target/microservicio-bank-0.0.1-SNAPSHOT.jar microservicio-bank.jar
ENTRYPOINT ["java","-jar","/microservicio-bank.jar"]
