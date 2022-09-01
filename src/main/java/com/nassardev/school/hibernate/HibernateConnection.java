package com.nassardev.school.hibernate;


import com.nassardev.school.model.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConnection {
    
    private static SessionFactory sf;
    
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            sf = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
        }
        return sf;
    }
}
