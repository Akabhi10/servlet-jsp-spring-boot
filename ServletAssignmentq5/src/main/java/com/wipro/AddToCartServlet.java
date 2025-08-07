package com.wipro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
    private static final int COOKIE_MAX_AGE = 60 * 60; // 1 hour

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String item = request.getParameter("item");

        if (item != null && !item.isEmpty()) {
            Cookie cookie = new Cookie("item_" + item, item);
            cookie.setMaxAge(COOKIE_MAX_AGE); // optional
            response.addCookie(cookie);
        }

        response.setContentType("text/html");
        response.getWriter().println("<h3>" + item + " added to cart!</h3>");
        response.getWriter().println("<a href='shop.html'>Back to Shop</a><br>");
        response.getWriter().println("<a href='viewCart'>View Cart</a>");
    }
}
