// javac -cp ".;javax.servlet-api-3.1.0.jar" HelloServlet.java

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Welcome to Java Servlet</h1>");
        out.println("<p>Hello, World!</p>");
    }
}
