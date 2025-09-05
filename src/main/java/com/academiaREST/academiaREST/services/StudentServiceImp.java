package com.academiaREST.academiaREST.services;

import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import com.academiaREST.academiaREST.entities.Student;
import com.academiaREST.academiaREST.entities.Course;
import com.academiaREST.academiaREST.services.CourseService;
import java.util.ArrayList;

@Service
public class StudentServiceImp implements StudentService {
    List <Student> students;
    private final CourseService courseService;
    
    public StudentServiceImp(CourseService courseService) {
        this.courseService = courseService;
        students = new ArrayList<>();
        students.add(new Student(001, "Student One", "studentone@gmail.com", "SADD"));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
    @Override
    public void deleteStudent(Long id) {
        students.removeIf(s -> s.getId() == id);
    }

    @Override
    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                s.setEmail(student.getEmail());
                s.setCourseEnrolled(student.getCourseEnrolled());
            }
        }
    }

    @Override
    public Student getStudentById(Long id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void enrollStudentInCourse(Long studentId, Long courseId) {
    
        Student student = getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);
        if (student != null && course != null) {
            // For simplicity, we are just setting the courseEnrolled field to the courseId as a string.
            student.setCourseEnrolled(course.getName());
            courseService.incrementStudent(courseId); // Increment the number of students in the course
        }
    }
}
