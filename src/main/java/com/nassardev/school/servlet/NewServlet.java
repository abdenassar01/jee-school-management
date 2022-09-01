package com.nassardev.school.servlet;



import com.nassardev.school.dto.StudentDtoImp;
import com.nassardev.school.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "NewServlet", value = "/add")
public class NewServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Student student = new Student();
        StudentDtoImp service = new StudentDtoImp();
        
        student.setCin(request.getParameter("cin"));
        student.setFirstname(request.getParameter("fn"));
        student.setLastname(request.getParameter("ln"));
        student.setAddress(request.getParameter("adr"));

        PrintWriter out = response.getWriter();
        service.saveStudent(student);

        List<Student> students = service.getStudents();
        out.println(students);
    }   
    
    
}
