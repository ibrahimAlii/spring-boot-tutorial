package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeDaoImp implements StudentDao {

    private final Map<UUID, Student> database;

    public FakeDaoImp() {
        database = new HashMap<>();
        UUID uuid = UUID.randomUUID();
        database.put(uuid, new Student(24, "Ibrahim", "Ali", "Computer Science"));
    }

    @Override
    public boolean insertStudent(Student student) {
        database.put(student.getStudentId(), student);
        return true;
    }

    @Override
    public Student getStudentById(UUID id) {
        return database.get(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public boolean updateStudent(UUID id, Student student) {
        student.setStudentId(id);
        database.put(id, student);
        return true;
    }

    @Override
    public boolean deleteStudentById(UUID id) {
        database.remove(id);
        return true;
    }
}
