package com.hzit.Servlet;

import com.hzit.core.biz.CheckBiz;
import com.hzit.core.impl.CheckBizImpl;
import com.hzit.dao.entity.Check;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/1/3.
 */
@WebServlet(name = "GetRandomPwdServlet",urlPatterns = "/GetRandomPwd")
public class GetRandomPwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String className=request.getParameter("checkClass");
            String teacherName=request.getParameter("checkTeacher");
            String moduleId=request.getParameter("checkModule");
            PrintWriter out=response.getWriter();
            Integer pwd=(int)(Math.random()*9000+1000);
            CheckBiz checkBiz=new CheckBizImpl();
            Check check=new Check();
            check.setCheckClass(className);
            check.setCheckTeacher(teacherName);
            check.setCheckPwd(pwd);
            check.setCheckModule(Integer.parseInt(moduleId));
            int i=checkBiz.addCheck(check);
            if(i==1){
                out.print("生成的密码是："+pwd);
            }else {
                out.print("生成失败！");
            }
        }catch (Exception ex){

        }
        //out.print("className："+className+"teacherName："+teacherName+"生成的随机密码："+pwd+"评论的模块Id："+moduleId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
