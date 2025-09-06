package com.academiaREST.academiaREST.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import nonapi.io.github.classgraph.json.Id;

@Schema(description = "Professor entity representing course instructors")
public class Professor {

    @Id
    @Schema(description = "Professor ID", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private long id;

    @Schema(description = "Professor's name", example = "Alice", required = true)
    private String name;

    @Schema(description = "Professor's department", example = "Computer Science", required = true)
    private String department;

    @Schema(description = "Professor's email address", example = "prof1@gmail.com", required = true)
    private String email;

    @Schema(description = "Courses taught by the professor", example = "Data Structures, Algorithms")
    private String coursesTaught;

    public Professor(){
        super();
    }
    public Professor(long id, String name, String department, String email, String coursesTaught) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.coursesTaught = coursesTaught;
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCoursesTaught() {
        return coursesTaught;
    }
    public void setCoursesTaught(String coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor [id=").append(id)
        .append(", name=").append(name)
        .append(", department=").append(department)
        .append(", email=").append(email)
        .append(", coursesTaught=").append(coursesTaught)
        .append("]");
        return sb.toString();
    }

}
