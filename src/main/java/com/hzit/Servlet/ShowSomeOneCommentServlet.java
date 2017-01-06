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
@WebServlet(name = "ShowSomeOneCommentServlet",urlPatterns = "/showSomeOneComment")
public class ShowSomeOneCommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String moduleName= request.getParameter("moduleName");
            String p=request.getParameter("page");
            String teaName=request.getParameter("teaName");
            if (p==null || p.equals("") ){
                p="0";
            }
            Integer page=Integer.parseInt(p);
            if (page<0){
                page=0;
            }

            Integer count=0;
            CommentBiz commentBiz=new CommentBizImpl();
                count=commentBiz.getCountByCodPeople(teaName);

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
                commentList=commentBiz.searchCommentByPage(moduleName,teaName,startRow);
                count=commentList.size();
                //System.out.println(count);
            request.setAttribute("teaName",comments);
            request.setAttribute("commentList",commentList);
            request.setAttribute("totalPages",totalPages);
            request.setAttribute("totalElements",count);
            request.setAttribute("currentPage",page);
            request.getRequestDispatcher("/WEB-INF/view/showAllComment.jsp").forward(request,response);
        }catch (Exception ex){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
