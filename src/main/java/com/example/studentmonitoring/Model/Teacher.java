package com.example.studentmonitoring.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.List;

import java.util.ArrayList;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String teacherName;
    String subject;
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    List<Student> studentList=new ArrayList<>();

}
