package com.wipro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/balance")
public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false); // don't create new session
        response.setContentType("text/html");

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            double balance = (Double) session.getAttribute("balance");

            response.getWriter().println("<h2>Welcome, " + name + "</h2>");
            response.getWriter().println("<p>Your balance is ₹" + balance + "</p>");
            response.getWriter().println("<a href='logout'>Logout</a>");
        } else {
            response.getWriter().println("<h3>Session expired or not logged in!</h3>");
        }
    }
}

