package pl.coderslab.webexample.web2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1", value = "/Get1")
public class Get1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");

        if (startStr == null || endStr == null) {
            response.getWriter().println("BRAK");
            return;
        }

        int start = Integer.parseInt(startStr);
        int end = Integer.parseInt(endStr);

        for (int i = start; i<=end; i++) {
            response.getWriter().println(i + "<br>\r\n");
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }
}