package com.nassardev.school;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hey")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 102831973239L;

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        request.setAttribute("msg", message);
        RequestDispatcher rd = request.getRequestDispatcher("/new");
        rd.forward(request, response);
    }

    public void destroy() {
    }
}