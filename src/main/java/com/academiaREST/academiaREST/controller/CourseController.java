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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.academiaREST.academiaREST.entities.Course;
import com.academiaREST.academiaREST.services.CourseService;

@RestController
@Tag(name = "Course Management", description = "CRUD operations for course management")
public class CourseController {

    @Autowired
    private CourseService courseService;
    
    @Operation(summary = "Home endpoint")
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @Operation(summary = "Get all courses")
    @GetMapping ("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @Operation(summary = "Get course by ID")
    @GetMapping("/course/{courseId}")
    public Course getCourseByID(@PathVariable String courseId){
        return this.courseService.getCourseById(Long.parseLong(courseId));
    }

    @Operation(summary = "Add course")
    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course){
        this.courseService.addCourse(course);
        return "Course added";
    }

    @Operation(summary = "Update course")
    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course){
        this.courseService.updateCourse(course);
        return "Course updated";
    }
    
    @Operation(summary = "Delete course")
    @DeleteMapping("/course/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        this.courseService.deleteCourse(Long.parseLong(courseId));
        return "Course deleted";
    }

}
