package com.anusha.student.service;

import com.anusha.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;


public interface StudentService {
    public Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
