package com.wipro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accno = request.getParameter("accno");
        String password = request.getParameter("password");

        // Dummy validation (use DB in real case)
        if (accno.equals("12345") && password.equals("pass123")) {
            HttpSession session = request.getSession();
            session.setAttribute("name", "Ravi Kumar");
            session.setAttribute("balance", 25000.00);

            response.sendRedirect("balance");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Invalid credentials!</h3>");
        }
    }
}

