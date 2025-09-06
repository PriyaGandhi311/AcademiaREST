package com.academiaREST.academiaREST.controller;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import com.academiaREST.academiaREST.services.ProfessorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import com.academiaREST.academiaREST.entities.Professor;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@Tag(name = "Professor Management", description = "CRUD operations for professor management")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Operation(summary = "Show all professors")
    @GetMapping("/professors")
    public List<Professor> getProfessors(){
        return this.professorService.getProfessor();
    }

    @Operation(summary = "Assign course to professor")
    @PutMapping("/professors/{professorId}/{courseId}")
    public String assignCourseToProfessor(@PathVariable String professorId, @PathVariable String courseId){
        this.professorService.assignCourseToProfessor(Long.parseLong(professorId), Long.parseLong(courseId));
        return "Course assigned to professor";
    }

    @Operation(summary = "Get professor by ID")
    @GetMapping("/professors/{id}")
    public Professor getProfessorById(@PathVariable String id){
        return this.professorService.getProfessorById(Long.parseLong(id));
    }   

    @Operation(summary = "Add a new professor")
    @PostMapping("/professors")
    public String addProfessor(@RequestBody Professor professor){
        this.professorService.addProfessor(professor);
        return "Professor added";
    }

    @Operation(summary = "Update professor details")
    @PutMapping("/professors/update")
    public String updateProfessor(@RequestBody Professor professor){
        this.professorService.updateProfessor(professor);
        return "Professor updated";
    }

    @Operation(summary = "Delete professor by ID")
    @DeleteMapping("/professors/delete/{id}")
    public String deleteProfessor(@PathVariable String id){
        this.professorService.deleteProfessor(Long.parseLong(id));
        return "Professor deleted";
    }


}
