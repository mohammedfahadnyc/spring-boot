package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student")        //Path created to accees server at localhost:8080/api/...
public class StudentController {

    private final StudentService studentService;

    @Autowired      //Dependency Injection by defining the @Service Bean
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();

    }
    @PostMapping
    public void registerNewStudent (@RequestBody Student student)
    {
        studentService.addNewStudent (student);
    }
}