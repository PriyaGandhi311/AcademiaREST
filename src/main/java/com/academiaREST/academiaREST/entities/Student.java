package com.academiaREST.academiaREST.entities;

public class Student {
    private long id;
    private String name;
    private String email;
    private String courseEnrolled;

    public Student(){
        super();
    }

    public Student(long id, String name, String email, String courseEnrolled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courseEnrolled = courseEnrolled;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", courseEnrolled=").append(courseEnrolled);
        sb.append('}');
        return sb.toString();
    }
}
