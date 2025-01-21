package com.nijamrit.SpringBootWebPlay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebPlayApplication {

	public static void main(String[] args) {
		// Note: Starter Console Project - No dependencies
		// Note: Web Starter Project - Spring Web, Spring Boot Dev Tools
		// Note: for DB Layer - Spring Boot Starter Data JPA, H2 Database Engine (for quick setup DB)
				// Update pom and application.properties and u r good to go
		// Then create a Repository layer by creating an interface that extends JpaRepository<Product, Integer>, Product is th Class used for schema and second arg is Primary key
		// Then in Product add @Entity and @Id, This would create a table in h2 DB
		SpringApplication.run(SpringBootWebPlayApplication.class, args);
	}

}
