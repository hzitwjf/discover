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
@WebServlet(name = "UrlServlet",urlPatterns = "/pageUrl")
public class UrlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String url=request.getParameter("url");
            if (url==null || url.equals(" ")){
                url="/WEB-INF/view/table.jsp";
            }
            request.getRequestDispatcher(url).forward(request,response);
        }catch (Exception ex){

        }
    }
}
