Spring Integration Example
=============

## How to Run 

This application is a standalone java program.

*  Clone this repository 
*  Make sure you are using JDK 1.7 or later and Maven 3.x
*  You can build the project and run the tests by running ```mvn clean package```
*  Once successfully built, you can run the service by typing:
```
        mvn clean spring-boot:run
```
*  Check the stdout to make sure no exceptions are thrown

Once the application runs you should see something like this

```
2016-01-18 10:10:35.498  INFO 9268 --- [           main] o.s.i.e.SourcePollingChannelAdapter      : started usersPoller
2016-01-18 10:10:35.506  INFO 9268 --- [           main] com.khoubyari.example.Application        : Started Application in 1.124 seconds (JVM running for 4.98
```

*  You can ```tail -f /tmp/ulist.txt``` to see the data being appended
*  The app will stop running after 30 seconds.

## About the Example

This project is a _very simplistic_ demo of Spring Integration running as part of a Spring Boot project. 
The app runs for 30 seconds and every 10 seconds it polls a dummy external REST service and appends the 
response of the call to a file. There is very little code (which is what I wanted to demonstrate) and
most of the magic happens in src/main/resources/integration.xml

Other features to be explored. All of these (and more) are possible with Spring Integration:
*  Use java annotations instead of integrstion XML
*  Use the {} annotation to change the user ID dynamically on the polled URL 
*  Bind the response to a java DTO object instead of just String
*  Persist the resulting response object to a database instead of a file
*  Currrently ir dumps the output to "/tmp" which might be a problem on non-*nix systems.
