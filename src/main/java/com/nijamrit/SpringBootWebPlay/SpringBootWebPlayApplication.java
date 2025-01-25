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
		// Note: for Security login - Spring Boot Starter Security, user + generated security password on console
			// can also set in properties file spring.security.user.name/password
			// /logout is the page to logout
			// can also send Autherization (Basic Auth) in Postman
			// CSRF (Cross Site Resourse Forgery) - third party gaining access using ur session
			// either create a new session everytime, or create CSRF token that can be used multiple times
			// name=_csrf type="hidden" value=<token> (Note: it is required when sending update add delete type of request)
			// create config class (@Configuration + @EnableWebSecurity) and define @Bean in it to inject object, to create your own filter chain of security
		// JWT (JSON (Javascript Object Notation) Web Token) for accountability (not secrecy). at login a token is generated, and then each subsequent request can use that token to validate user
		// Add JJWT API and Impl dependency
		// Add OAuth2 Client (other one is to create your own OAuth) dependency for implementing Authorization from third party like Google, Github etc..
		// Then create a Repository layer by creating an interface that extends JpaRepository<Product, Integer>, Product is th Class used for schema and second arg is Primary key
		// Then in Product add @Entity and @Id, This would create a table in h2 DB
		SpringApplication.run(SpringBootWebPlayApplication.class, args);
	}

}
