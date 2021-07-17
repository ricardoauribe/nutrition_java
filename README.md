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
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-boot-starter</artifactId>
  <version>3.0.0</version>
</dependency>
```
