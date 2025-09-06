package com.academiaREST.academiaREST.services;
import com.academiaREST.academiaREST.entities.Professor;
import java.util.List;

public interface ProfessorService {

    public List<Professor> getProfessor();
    public void addProfessor(Professor professor);
    public void updateProfessor(Professor professor);
    public void deleteProfessor(Long id);
    public Professor getProfessorById(Long id);
    public void assignCourseToProfessor(Long professorId, Long courseId);

}
