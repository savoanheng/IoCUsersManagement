package com.example.userManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserManagementApplication {
        @GetMapping("/")
        public String hello(){
            return "Hello Spring Boot";
        }
	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
