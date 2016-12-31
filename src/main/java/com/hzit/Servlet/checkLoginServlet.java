package com.hzit.Servlet;

import com.hzit.core.biz.UserBiz;
import com.hzit.core.impl.UserBizImpl;
import com.hzit.dao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/31.
 */
@WebServlet("/checkLogin")
public class checkLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name=request.getParameter("userName");
        String pwd=request.getParameter("userPwd");
        UserBiz userBiz=new UserBizImpl();
        User user=new User();
        user.setUserName(name);
        user.setUserPwd(pwd);
        User u=userBiz.checkLogin(user);
        String url="";
        if (u!=null){
            url="/toBeginComment";
        }else {
            url="/index.jsp";
        }
        response.sendRedirect(url);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
