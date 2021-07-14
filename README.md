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

## Logging

TODO: Configure Logging using log4j or a similar library