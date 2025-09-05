package com.academiaREST.academiaREST.services;
import java.util.List;
import com.academiaREST.academiaREST.entities.Student;
public interface StudentService {
    public void addStudent(Student student);
    public void deleteStudent(Long id);
    public void updateStudent(Student student);
    public Student getStudentById(Long id);
    public void enrollStudentInCourse(Long studentId, Long courseId);
}
