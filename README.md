# Microservice communication with service discovery, fault tolerance & resilience 
This demo Microservice project contains 3 microservices namely 
1. Movie-Catalog-Service
2. Movie-Rating-Service
3. Movie-Info-Service

It has one client side discovery service with name 
1. eureka-service

## Scope
Current scope of this project is just to demonstrate
1. How Microservices communicate with earch other using eureka client side service discovery API.
2. All apis used in this project is children of Spring eco-system.

## Known facts & limitations 
1. No DB is used
2. H2 dependency has been added to use it future if required

## Future Scope & enhancement
1. Integrate current hard-coded responses to 3rd party APIs i.e. Rapid API
2. Add generic validation code
3. Add generic SQL & XSS injection prevention code
4. Add Open API specification

## Credits 
Microservice course 1 & 2 from JavaBrains

## Author
Hiren Savalia
