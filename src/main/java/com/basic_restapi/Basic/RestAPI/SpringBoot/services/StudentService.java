package com.basic_restapi.Basic.RestAPI.SpringBoot.services;

import com.basic_restapi.Basic.RestAPI.SpringBoot.model.Student;
import com.basic_restapi.Basic.RestAPI.SpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    //Create a new Student
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    //Get all Students
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    //Get a Student by ID
    public Optional<Student> getStudentByID(Long id){
            return studentRepository.findById(id);
    }
    //Update a Student
    public Student updateStudent(Long id, Student student){
        if(studentRepository.existsById(id)){
            student.setId(id);
            return studentRepository.save(student);
        }
        return null;
    }
    //Delete a Student by ID
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
