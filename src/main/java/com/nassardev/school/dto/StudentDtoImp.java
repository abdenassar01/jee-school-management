package com.nassardev.school.dto;

import com.nassardev.school.hibernate.HibernateConnection;
import com.nassardev.school.model.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class StudentDtoImp implements StudentDto{
    
    @Override
    public List<Student> getStudents() {

        Session session = HibernateConnection.getSessionFactory().openSession();
        session.beginTransaction();
        Query<Student> query = session.createQuery("from student", Student.class);
        List<Student> students = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
        
    }

    @Override
    public Optional<Student> getStudentByCIN(String cin) {
        return Optional.empty();
    }

    @Override
    public void saveStudent(Student student) {
        Session session = HibernateConnection.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(student);       
        session.getTransaction().commit();
        session.close();
    }
}
