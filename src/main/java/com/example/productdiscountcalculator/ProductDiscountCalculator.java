package com.example.productdiscountcalculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculate")
public class ProductDiscountCalculator extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("Price"));
        float percent = Float.parseFloat(request.getParameter("DiscountPercent"));
        String description = String.copyValueOf(request.getParameter("Description").toCharArray());

        float discountAmount = (float) (price * percent * 0.01);
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Description: " +description + "</h2>");
        writer.println("<h2>Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2>Discount Price: " + discountPrice + "</h2>");
    }

    public void destroy() {
    }
}