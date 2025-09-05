package com.academiaREST.academiaREST.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.academiaREST.academiaREST.entities.Student;
import com.academiaREST.academiaREST.services.StudentService;
@RestController
public class StudentController {
@Autowired
    private StudentService studentService;

    public StudentController(){
        super();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id){
        return this.studentService.getStudentById(Long.parseLong(id));
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
        return "Student added";
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        this.studentService.updateStudent(student);
        return "Student updated";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id){
        this.studentService.deleteStudent(Long.parseLong(id));
        return "Student deleted";
    }

    @PostMapping("/students/{studentId}/{courseId}")
    public String enrollStudentInCourse(@PathVariable String studentId, @PathVariable String courseId){
        this.studentService.enrollStudentInCourse(Long.parseLong(studentId), Long.parseLong(courseId));
        return "Student enrolled in course";
    }
}
