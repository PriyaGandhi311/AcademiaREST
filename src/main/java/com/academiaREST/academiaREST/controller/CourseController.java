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

import com.academiaREST.academiaREST.entities.Course;
import com.academiaREST.academiaREST.services.CourseService;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping ("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourseByID(@PathVariable String courseId){
        return this.courseService.getCourseById(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course){
        this.courseService.addCourse(course);
        return "Course added";
    }

    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course){
        this.courseService.updateCourse(course);
        return "Course updated";
    }
    
    @DeleteMapping("/course/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        this.courseService.deleteCourse(Long.parseLong(courseId));
        return "Course deleted";
    }

}
