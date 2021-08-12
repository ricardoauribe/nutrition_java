# Nutrition Project

## Setup

This project uses spring boot 2.6 as a framework

Please ensure to have Java 11+ installed and Maven configured at your local machine

- https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html
- https://maven.apache.org/

## Overview

This projects intends to provide a backend REST API to interact with a DB focus on nutrition patients and the records they generate through the different appointments they  have as a follow up with a nutritionist

The project works with the following Spring modules:

- Spring Web
- JPA (not enabled yet)
- Spring Security (not enabled yet)

It's intended to create a REST API to be consumend by a separate web front end project

## How to run

To build execute:

```
mvn clean build
```

To run:

```
mvn spring-boot:run
```

## Testing

Testing is configured with Junit 5 and Mockito

To configure it, include he following dependencies at the pom.xml file

```
  <!-- junit 5 -->
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>${junit-jupiter.version}</version>
    <scope>test</scope>
  </dependency>

  <!-- Mockito -->
  <dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>3.2.4</version>
    <scope>test</scope>
  </dependency>
```

To run the test suite execute:

```
mvn test
```
- TODO: Configure coverage xml file
- TODO: Explain how it was configured

## Logging

Logging was configured using Log4j library, current configured appender logs events to the application console

Below you can find dependencies added at the pom.xml file

```
  <!-- Log4j -->
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.7</version>
  </dependency>
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.7</version>
    <type>test-jar</type>
    <scope>test</scope>
  </dependency>
```

## API

Swagger dependency is added through the pom file as

```
  <!-- Spring Fox for Swagger 2 -->
  <dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
  </dependency>
```
Since the project is using Spring >= 2.2, it can use Springfox 3.0 which only requires one dependency

The full API can be reviewed at:

http://localhost:8085/swagger-ui/index.html

## GitHub Actions & Templates

This project uses a template for Pull Requests. It got defined at the settings menu, additionally the template got stored at the .github folder

Additionally a workflow was defined to take the Dockerfile at the root directory build an image and push into Github Packages. 
This workflow can be find at /.github/workflows

Further actions may include pushing this image into an ECR instance or into an artifact at AWS like ECS or Elastic Beanstalk

## How to Contribute

## Docker

You can use the following commands to run the project locally. 

```
docker build --tag java-docker .
docker run -d -p 8080:8080 java-docker
```

Additionally there is a github action that will use the same Dockerfile to build an image and push it into github packages
