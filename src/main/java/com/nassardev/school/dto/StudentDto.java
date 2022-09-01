package com.nassardev.school.dto;

import com.nassardev.school.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDto {
    
    List<Student> getStudents();
    Optional<Student> getStudentByCIN(String cin);
    void saveStudent(Student student);
    
}
