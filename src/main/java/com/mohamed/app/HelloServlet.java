package com.mohamed.app;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;


@WebServlet(name="hellow-you", urlPatterns={"/hello-you-3"})
public class HelloServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
		String yourName = req.getParameter("your_name"); 
        out.write("<h1>Hi " + yourName + "!</h1>");

		out.close();
    }

}
