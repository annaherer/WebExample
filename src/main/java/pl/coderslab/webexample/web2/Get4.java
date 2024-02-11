package pl.coderslab.webexample.web2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "Get4", value = "/Get4")
public class Get4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving parameters from a request
        Map<String, String[]> parameters = request.getParameterMap();

        // Set the response content type as HTML
        response.setContentType("text/html");

        // Creating a PrintWriter object to write the response
        PrintWriter out = response.getWriter();

        // Displaying information in a list
        out.println("<html><head><title>Parameters</title></head><body>");
        out.println("<h2>Parameters</h2>");

        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            out.println("<strong>" + entry.getKey() + ":</strong>");
            out.println("<ul>");
            for (String value : entry.getValue()) {
                out.println("<li>" + value + "</li>");
            }
            out.println("</ul>");
        }

        out.println("</body></html>");
    }
}