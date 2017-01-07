package com.hzit.Servlet;

import com.hzit.core.biz.CommentBiz;
import com.hzit.core.impl.CommentBizImpl;
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
@WebServlet(name = "OneCommentServlet",urlPatterns = "/OneComment")
public class OneCommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String teaName=request.getParameter("teaName");
            CommentBiz commentBiz=new CommentBizImpl();
            List<DiscussVo> discussVoList=commentBiz.searchDiscussByTeaName(teaName);
            //request.setAttribute("discussVoList",discussVoList);
            request.getSession().setAttribute("discussVoList",discussVoList);
            request.getRequestDispatcher("/WEB-INF/view/showAllTeacherSuggest.jsp").forward(request,response);
        }catch (Exception ex){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
