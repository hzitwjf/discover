package com.hzit.Servlet;

import com.hzit.core.biz.CheckBiz;
import com.hzit.core.impl.CheckBizImpl;
import com.hzit.dao.entity.Check;
import com.hzit.dao.vo.CheckVo;

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
@WebServlet(name ="studentLoginServlet",urlPatterns = "/login.do")
public class studentLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String stuName=request.getParameter("stuName");
            String stuPwd=request.getParameter("stuPwd");
            PrintWriter printWriter=response.getWriter();
            //printWriter.print("昵称是："+stuName+"\t密码是："+stuPwd);
            CheckBiz checkBiz=new CheckBizImpl();
            CheckVo checkVo=checkBiz.findCheckByCheckPwd(stuPwd);
            if (checkVo!=null){
                checkVo.setStuName(stuName);
                request.getSession().setAttribute("checkVo",checkVo);
                response.sendRedirect("findAllProblemAndAnswer?hzitxx="+stuPwd+checkVo.getCheckModule()+stuPwd+checkVo.getCheckModule()+"&&proModule=??.com");
            }else {
                printWriter.print("<h1>密码错误！请向班主任核对密码后再来</h1>");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
