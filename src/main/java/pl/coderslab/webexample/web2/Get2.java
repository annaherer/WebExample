package pl.coderslab.webexample.web2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Get2", value = "/Get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        for(Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            response.getWriter().println(
                    String.format("%s: %s<br>\r\n",
                            entry.getKey(),
                            Arrays.toString(entry.getValue())
                    )
            );
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }
}