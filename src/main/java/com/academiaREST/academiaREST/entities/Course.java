package com.academiaREST.academiaREST.entities;
import io.swagger.v3.oas.annotations.media.Schema;
import nonapi.io.github.classgraph.json.Id;

public class Course {
    
    @Id
    @Schema(description = "Course ID", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private long id;

    @Schema(description = "Course name", example = "Mathematics", required = true)
    private String name;

    @Schema(description = "Course description", example = "An introductory course to Mathematics", required = true)
    private String description;

    @Schema(description = "Professor's name", example = "Dr. Smith", required = true)
    private String professor;

    @Schema(description = "Number of students enrolled", example = "30", accessMode = Schema.AccessMode.READ_ONLY)
    private long numberOfStudents;
    
    public Course(){
        super();
    }
    public Course(long id, String name, String description, String professor, long numberOfStudents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.professor = professor;
        this.numberOfStudents = numberOfStudents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public long getnumberOfStudents() {
        return numberOfStudents;
    }
    public void setnumberOfStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", professor=").append(professor);
        sb.append(", numberOfStudents=").append(numberOfStudents);
        sb.append('}');
        return sb.toString();
    }

    

    
}
