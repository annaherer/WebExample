package pl.coderslab.webexample.web2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Get3", value = "/Get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving the width and height values from the request parameters
        int width = getParameterOrDefault(request.getParameter("width"), 5);
        int height = getParameterOrDefault(request.getParameter("height"), 10);

        // Setting the response content type as HTML
        response.setContentType("text/html");

        // Creating a PrintWriter object to write the response
        PrintWriter out = response.getWriter();

        // Generating a multiplication table and displaying it in the browser
        out.println("<html><head><title>Multiplication Table</title></head><body>");
        out.println("<h2>Multiplication Table</h2>");
        out.println("<table border='1'>");

        for (int i = 1; i <= height; i++) {
            out.println("<tr>");
            for (int j = 1; j <= width; j++) {
                out.println("<td>" + (i * j) + "</td>");
            }
            out.println("</tr>");
        }

        out.println("</table></body></html>");
    }

    private int getParameterOrDefault(String parameter, int defaultValue) {
        // Check whether a parameter is null or empty
        if (parameter == null || parameter.isEmpty()) {
            return defaultValue;
        }

        // Convert a parameter to a number
        try {
            return Integer.parseInt(parameter);
        } catch (NumberFormatException e) {
            // Error handling in case of invalid number format
            return defaultValue;
        }
    }
}