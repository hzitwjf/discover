package com.hzit.Servlet;


import com.hzit.core.biz.CommentBiz;
import com.hzit.core.impl.CommentBizImpl;
import com.hzit.dao.entity.Comment;

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
            if (teaName!=null){
                req.getSession().setAttribute("name",teaName);
            }
            if (p==null || p.equals("") ){
                p="0";
            }
            Integer page=Integer.parseInt(p);
            if (page<0){
                page=0;
            }
            String name= (String) req.getSession().getAttribute("name");
            Integer count=0;
            CommentBiz commentBiz=new CommentBizImpl();
            if (name==null || name.equals("")){
                count=commentBiz.getCountByModule(moduleName);
            }else {
                count=commentBiz.getCountByCodPeople(name);
            }

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
            //System.out.println(name);
            if (name==null || name.equals("")){
                commentList=commentBiz.searchCommentByPage(moduleName, startRow);
            }else {
                commentList=commentBiz.searchCommentByPage(moduleName,name,startRow);
                count=commentList.size();
                //System.out.println(count);
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
