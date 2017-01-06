package com.hzit.Servlet;

import com.hzit.core.biz.CommentBiz;
import com.hzit.core.impl.CommentBizImpl;
import com.hzit.dao.entity.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/1/5.
 */
@WebServlet(name = "toShowAllCommentServlet",urlPatterns = "/toShowAllComment")
public class toShowAllCommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try{
            String comModule=request.getParameter("comModule");
            String moduleName=null;
            if(comModule.equals("0")){
                moduleName="餐饮";
            }else if (comModule.equals("1")){
                moduleName="教员";
            }else if (comModule.equals("2")){
                moduleName="教务";
            }else {
                moduleName="未知";
            }
            HttpSession session=request.getSession();
            session.setAttribute("moduleName",moduleName);
            PrintWriter out=response.getWriter();
            out.write("/doShowAllComment");
        }catch (Exception ex){

        }
    }
}
