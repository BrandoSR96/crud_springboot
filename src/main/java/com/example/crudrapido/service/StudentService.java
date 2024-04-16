package com.example.crudrapido.service;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRespository studentRespository;

    public List<Student> getStudents(){
        return studentRespository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRespository.findById(id);
    }

    public void saveOrUpdate(Student student){
        studentRespository.save(student);
    }

    public void delete(Long id){
        studentRespository.deleteById(id);
    }
}
