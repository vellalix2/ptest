FROM maven:3.6.3-jdk-11

WORKDIR /app/
COPY ./pom.xml ./pom.xml

WORKDIR /app/hello-world
COPY ./hello-world/pom.xml ./pom.xml

RUN mvn dependency:go-offline

COPY ./hello-world/src ./src/

RUN mvn test

CMD ["mvn","spring-boot:run"]