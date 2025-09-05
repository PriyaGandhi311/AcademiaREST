package com.academiaREST.academiaREST.services;

import java.util.List;

import com.academiaREST.academiaREST.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseById(Long id);

    public void addCourse(Course course);

    public void updateCourse(Course course);

    public void incrementStudent(Long courseId);

    public void deleteCourse(Long id);

}
