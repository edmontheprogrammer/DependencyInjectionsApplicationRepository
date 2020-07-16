package com.edmontheprogrammer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Dependency Injection; dependency injection is when we create two or more objects and where an object(s) provides a
 * a set of requirements for another object(s) to be created or fully created.
 * @SpringBootApplication; the @SpringBootApplication annotation makes or defines this application as a Spring Boot
 * application
 */
@SpringBootApplication
public class DependencyInjectionsApplication {

	public static void main(String[] args) {

		/**
		 * SpringApplication.run() is how we run a Spring Boot application. run() is the method that starts the Spring
		 * Boot app.
		 */
	    ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionsApplication.class, args);
	    Students studentsObject = context.getBean(Students.class);
	    studentsObject.display();
	}
}
