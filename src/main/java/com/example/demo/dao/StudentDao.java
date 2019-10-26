package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    boolean insertStudent(Student student);

    Student getStudentById(UUID id);

    List<Student> getAllStudents();

    boolean updateStudent(UUID id, Student student);

    boolean deleteStudentById(UUID id);
}
