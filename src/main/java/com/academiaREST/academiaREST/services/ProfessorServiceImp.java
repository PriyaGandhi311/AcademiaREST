package com.academiaREST.academiaREST.services;

import java.util.ArrayList;
import java.util.List;

import com.academiaREST.academiaREST.entities.Course;
import com.academiaREST.academiaREST.entities.Professor;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImp implements ProfessorService {

    List<Professor> professors;

    private final CourseService courseService;
    public ProfessorServiceImp(CourseService courseService){
        this.courseService = courseService;
        professors = new ArrayList<>();
        professors.add( new Professor(001, "John Doe", "Computer Science", "john@gmail.com", "SADD"));
    }

    @Override
    public List<Professor> getProfessor() {
        return professors;
    }

    @Override
    public void addProfessor(Professor professor) {
        Professor newProfessor = new Professor();
        newProfessor = professor;
        professors.add(newProfessor);
    }

    @Override
    public void updateProfessor(Professor professor) {
        for(Professor p : professors){
            p.setId(professor.getId());
            p.setName(professor.getName());
            p.setDepartment(professor.getDepartment());
            p.setEmail(professor.getEmail());
            p.setCoursesTaught(professor.getCoursesTaught());
        }
    }

    @Override
    public void deleteProfessor(Long id) {
       for(Professor p : professors){
            if(p.getId() == id){
                professors.remove(p);
                break;
            }
       }
    }

    @Override
    public Professor getProfessorById(Long id) {
        for(Professor p : professors){
            if(p.getId() == id){
                return p;
            }
        
        }
        return null;
    }

    @Override
    public void assignCourseToProfessor(Long professorId, Long courseId) {
        Professor professor = getProfessorById(professorId);
        Course course = courseService.getCourseById(courseId);
        if(professor != null && course != null){
            String updatedCourses = course.getName();
            professor.setCoursesTaught(updatedCourses);
            course.setProfessor(professor.getName());
            courseService.updateCourse(course);
        }
        
    }

}

