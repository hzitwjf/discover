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
 * Created by Administrator on 2017/1/6.
 */
@WebServlet(name = "doShowAllCommentServlet",urlPatterns = "/doShowAllComment")
public class doShowAllCommentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try {
            String moduleName= (String) req.getSession().getAttribute("moduleName");
            String p=req.getParameter("page");
            String teaName=req.getParameter("likeName");
            if (p==null || p.equals("") ){
                p="0";
            }
            Integer page=Integer.parseInt(p);
            if (page<0){
                page=0;
            }
            CommentBiz commentBiz=new CommentBizImpl();
            Integer count=commentBiz.getCountByModule(moduleName);
            List<Comment> comments=commentBiz.findAllTeacherName(moduleName);
            int totalPages=0;
            //将总行数转换成页数
            if(count%30==0){
                totalPages=count/30;
            }else {
                totalPages=count/30+1;
            }
            //将页数转换成起始行
            int startRow=(page)*30;
            List<Comment> commentList=null;
            if (teaName==null || teaName.equals("")){
                commentList=commentBiz.searchCommentByPage(moduleName, startRow);
            }else {
                commentList=commentBiz.searchCommentByPage(moduleName,teaName,startRow);
                count=commentList.size();
            }
            req.setAttribute("teaName",comments);
            req.setAttribute("commentList",commentList);
            req.setAttribute("totalPages",totalPages);
            req.setAttribute("totalElements",count);
            req.setAttribute("currentPage",page);
            req.getRequestDispatcher("/WEB-INF/view/showAllComment.jsp").forward(req,resp);

        }catch (Exception ex){

        }
    }
}
