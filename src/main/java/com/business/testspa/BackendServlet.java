package com.business.testspa;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BackendServlet", value = "/backend")
public class BackendServlet extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        /*
        //JSON
        response.setContentType("application/json");

        String username = request.getParameter("username");

        PrintWriter out = response.getWriter();
        out.print("{\"message\":\"Welcome! " + username + "\"}");
        out.close();
        */

        //XML
        response.setContentType("application/xml");

        String username = request.getParameter("username");
        PrintWriter out = response.getWriter();
        out.print("<message>Welcome " + username + "</message>");
        out.close();

        System.out.println("in doGet()");

    }


}