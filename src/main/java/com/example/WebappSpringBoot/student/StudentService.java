package com.example.WebappSpringBoot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        25
                )
        );
    }
}
