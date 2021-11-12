package com.business.testspa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidationServlet", value = "/validation")
public class ValidationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String description = request.getParameter("description");
        int amount = Integer.parseInt(request.getParameter("amount"));

        response.setContentType("application/xml");
        PrintWriter out = response.getWriter();

        StringBuffer sb = new StringBuffer();

        sb.append("<response>");

        if (id <100)
            sb.append("<msg1>id &gt; 100</msg1>");

        if ("".equals(description))
            sb.append("<msg2>description mandatory</msg2>");

        if (amount<=1000 || amount>=2000)
            sb.append("<msg3>amount &gt; 1000 and amount &lt; 2000</msg3>");

        sb.append("</response>");

        out.println(sb.toString());

        out.close();
        System.out.println("version final today");
    }
}

