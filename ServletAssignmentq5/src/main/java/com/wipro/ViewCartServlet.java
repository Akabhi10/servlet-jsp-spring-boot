package com.wipro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/viewCart")
public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.getWriter().println("<h2>Your Shopping Cart</h2>");

        boolean found = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().startsWith("item_")) {
                    response.getWriter().println("<p>" + c.getValue() + "</p>");
                    found = true;
                }
            }
        }

        if (!found) {
            response.getWriter().println("<p>Your cart is empty.</p>");
        }

        response.getWriter().println("<br><a href='shop.html'>Back to Shop</a>");
    }
}

