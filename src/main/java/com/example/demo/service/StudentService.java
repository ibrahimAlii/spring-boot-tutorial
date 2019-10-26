package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public boolean insertStudent(Student student){
        return studentDao.insertStudent(student);
    }

   public Student getStudentById(UUID id){
        return studentDao.getStudentById(id);
   }

   public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
   }

   public boolean updateStudent(UUID id, Student student){
        return studentDao.updateStudent(id, student);
   }

   public boolean deleteStudentById(UUID id){
        return studentDao.deleteStudentById(id);
   }
}
