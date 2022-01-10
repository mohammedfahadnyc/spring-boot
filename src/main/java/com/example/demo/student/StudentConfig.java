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
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {

        return args->
        {
            Student mariam = new Student("Mariam",
                    LocalDate.of(2020, Month.JANUARY, 5), 20, "m@gmail.com");
            Student alex = new Student("alex",
                    LocalDate.of(2020, Month.JANUARY, 5), 20, "m@gmail.com");
            Student rova = new Student("rova",
                    LocalDate.of(2020, Month.JANUARY, 5), 20, "m@gmail.com");

            repository.saveAll(List.of(mariam,alex,rova));



        };
    }
}
