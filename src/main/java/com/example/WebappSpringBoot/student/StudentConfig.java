package com.example.WebappSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "Alex.Brown@gmail.com",
                    LocalDate.of(2004, JANUARY, 5)
            );

            Student asel = new Student(
                    "Asel",
                    "Asel.aiyzberk@gmail.com",
                    LocalDate.of(2001, JANUARY, 18)
            );

            Student tilek = new Student(
                    "Tilek",
                    "Tilek.Brutus@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 8)
            );

            repository.saveAll(
                    List.of(mariam, alex, asel, tilek)
            );
        };
    }
}
