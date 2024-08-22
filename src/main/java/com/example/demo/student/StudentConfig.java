package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

    return args -> {
        Student mariam = new Student(1L,
                "Mariam",
                "mariamjamal@gmai.com",

                LocalDate.of(1955, Month.APRIL, 24));
        Student alex = new Student(
                "Alex",
                "alex@gmai.com",

                LocalDate.of(2004, Month.APRIL, 24));

        repository.saveAll(List.of(mariam, alex)); //kako da dodamo
    };
    }
}
