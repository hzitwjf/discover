package com.hzit.comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/5.
 */
@WebServlet(name = "toAdminIndexServlet",urlPatterns = "/toAdminIndex")
public class toAdminIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try{
           request.getRequestDispatcher("WEB-INF/view/adminIndex.jsp").forward(request,response);
       }catch (Exception ex){

       }
    }
}
