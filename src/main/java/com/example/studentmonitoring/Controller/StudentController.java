package com.example.studentmonitoring.Controller;

import com.example.studentmonitoring.Model.Student;
import com.example.studentmonitoring.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent
    }
}
