package com.mohamed.app;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;


@WebServlet(name="my-first-servlet", urlPatterns={"/example-3","/*"})
public class AppServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.write("<h1>Hellow Servlet with 'web.xml configuration'</h1>");
		out.write("<h2>Enter yout name</h2>");
		out.write("<FORM METHOD=GET ACTION='./hello-you-3'> ");
		out.println("<input type='text' name='your_name'/>");
		out.println("<input type='submit' value='ENTER'/>");
		out.write("</FORM> ");
		out.close();
    }

}
