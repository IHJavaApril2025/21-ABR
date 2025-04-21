package com.ironhack.__ABR.models;

import jakarta.persistence.*;

@Entity
@Table(name="students_courses")
public class StudentsCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int grade;

    @Column(name= "student_name")
    private String name;

    @Column(name= "course_id")
    private String courseId;

    public StudentsCourses() {
    }

    public StudentsCourses(int id, int grade, String name, String courseId) {
        this.id = id;
        this.grade = grade;
        this.name = name;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "StudentsCourses{" +
                "id=" + id +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
