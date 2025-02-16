package com.academiaREST.academiaREST.entities;

public class Course {
    private long id;
    private String name;
    private String description;
    private String professor;
    
    public Course(){
        super();
    }
    public Course(long id, String name, String description, String professor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.professor = professor;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", professor=").append(professor);
        sb.append('}');
        return sb.toString();
    }

    

    
}
