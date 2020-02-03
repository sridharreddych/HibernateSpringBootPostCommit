package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    
    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }            

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            bookstoreService.updateAuthor();
        };
    }
}


/*
 * 
 * 
 * Why You Should Avoid Time-Consuming Tasks In Spring Boot Post-Commit Hooks

Description: This application is a proof of concept for using Spring post-commit hooks and how they may affect the persistence layer performance.

Key points:

avoid time-consuming tasks in Spring post-commit hooks since the database connection will remain open until this code finshes

 * 
 * 
 */
