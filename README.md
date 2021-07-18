# Nutrition Project

## Setup

This project uses spring boot as a frame work

Please ensure to have Java 11+ installed and Maven configured at your local machine

## Overview

This project will work with the following modules of Spring:

- Spring Web
- JPA
- Spring Security

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

Log was configured using Log4j library, current configured appender logs events to the application console

- TODO: Explain how it was configured

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
