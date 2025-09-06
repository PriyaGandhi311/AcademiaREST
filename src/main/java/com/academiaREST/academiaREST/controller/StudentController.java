package com.academiaREST.academiaREST.controller;

import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;

// import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.academiaREST.academiaREST.entities.Student;
import com.academiaREST.academiaREST.services.StudentService;

@Tag(name = "Student Management", description = "CRUD operations for student management")
public class StudentController {
@Autowired
    private StudentService studentService;

    public StudentController(){
        super();
    }

    @Operation(summary = "Get student by ID")
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return this.studentService.getStudentById(Long.parseLong(id));
    }
    @Operation(summary = "Add student")
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
        return "Student added";
    }
    @Operation(summary = "Update student")
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        this.studentService.updateStudent(student);
        return "Student updated";
    }

    @Operation(summary = "Delete student")
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id){
        this.studentService.deleteStudent(Long.parseLong(id));
        return "Student deleted";
    }

    @Operation(summary = "Enroll student in course")
    @PostMapping("/students/{studentId}/{courseId}")
    public String enrollStudentInCourse(@PathVariable String studentId, @PathVariable String courseId){
        this.studentService.enrollStudentInCourse(Long.parseLong(studentId), Long.parseLong(courseId));
        return "Student enrolled in course";
    }
}
