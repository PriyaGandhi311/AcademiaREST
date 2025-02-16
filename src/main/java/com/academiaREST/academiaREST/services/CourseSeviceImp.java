package com.academiaREST.academiaREST.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.academiaREST.academiaREST.entities.Course;

@Service
public class CourseSeviceImp implements CourseService {
    
    List <Course> courses;

    public CourseSeviceImp (){
        courses = new ArrayList<>();
        courses.add( new Course(001, "Spring Boot Course", 
        "Detail Course on Spring Boot using REST API", "ExpertLearn"));
    }
    

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Course getCourseById(Long id) {
        Course c = null;
        for (Course course : courses) {
            if(course.getId() == id){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {

        for(Course c : courses){
            if(c.getId() == course.getId()){
                c.setName(course.getName());
                c.setDescription(course.getDescription());
                c.setProfessor(course.getProfessor());
            }
        }
    }

    @Override
    public void deleteCourse(Long courseId){
        for(Course c : courses){
            if(c.getId() == courseId){
                courses.remove(c);
            }
        }
    }

}
