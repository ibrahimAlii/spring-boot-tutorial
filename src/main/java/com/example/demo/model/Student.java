package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    @JsonProperty private UUID studentId;
    @JsonProperty private final int age;
    @JsonProperty private final String firstName;
    @JsonProperty private final String lastName;
    @JsonProperty private final String course;

    public Student(int age, String firstName, String lastName, String course) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
