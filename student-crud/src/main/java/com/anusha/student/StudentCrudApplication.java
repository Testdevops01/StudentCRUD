package com.anusha.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class StudentCrudApplication {


    public static void main(String[] args) {
        SpringApplication.run(StudentCrudApplication.class, args);
    }

}
