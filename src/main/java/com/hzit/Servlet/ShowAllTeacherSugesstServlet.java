package com.hzit.Servlet;


import com.hzit.core.biz.DiscussBiz;
import com.hzit.core.impl.DiscussBizImpl;
import com.hzit.dao.vo.DiscussVo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
@WebServlet(name = "ShowAllTeacherSugesstServlet",urlPatterns = "/ShowAllTeacherSugesst")
public class ShowAllTeacherSugesstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String comUuid=request.getParameter("comUuid");
            DiscussBiz discussBiz=new DiscussBizImpl();
            List<DiscussVo> discussVoList=discussBiz.findDiscussByComUuid(comUuid);
            request.setAttribute("discussVoList",discussVoList);
            request.getRequestDispatcher("/WEB-INF/view/showSomeOneDiscussDetai.jsp").forward(request,response);
        }catch (Exception ex){

        }
    }
}
