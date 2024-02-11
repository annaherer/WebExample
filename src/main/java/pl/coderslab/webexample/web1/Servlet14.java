package pl.coderslab.webexample.web1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet14", value = "/Servlet14")
public class Servlet14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(request.getRemoteAddr());
        response.getWriter().println(request.getHeader("User-Agent"));
    }
}