package com.business.testspa;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidationServlet", value = "/validation")
public class ValidationServlet extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        response.setContentType("application/xml");

        int id = Integer.parseInt(request.getParameter("id"));
        String description = request.getParameter("description");
        int amount = Integer.parseInt(request.getParameter("amount"));

        response.setContentType("application/xml");
        PrintWriter out = response.getWriter();
        StringBuffer sb = new StringBuffer();
        sb.append("<response>");

        if(id<100)
            sb.append("<msg1>id &gt; 100</msg1>");

        if("".equals(description))
            sb.append("<msg2>description mandatory</smg2>");

        if(amount>=1000 || amount>=2000)
            sb.append("<msg3>import &gt; 1000 and import &lt; 2000</msg3>");



        sb.append("</response>");

        out.println(sb.toString());


        System.out.println("in doGet()");

        out.close();
        System.out.println("Version final today");




    }


}
