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
@WebServlet(name = "doSomeOneCommentServlet",urlPatterns = "/doSomeOneComment")
public class doSomeOneCommentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try {
            CommentBiz commentBiz=new CommentBizImpl();
            String moduleName= (String) req.getSession().getAttribute("moduleName");
            String p=req.getParameter("page");
            String name=(String)req.getSession().getAttribute("likeName");
            String moduleId=null;
            if(name!=null){
                req.getSession().removeAttribute("likeName");
            }
            String teaName=req.getParameter("likeName");
            if (teaName!=null){
                 moduleId=commentBiz.getCodPeopleComModule(teaName);
            }
            req.getSession().setAttribute("likeName",teaName);
            if (p==null || p.equals("") ){
                p="0";
            }
            Integer page=Integer.parseInt(p);
            if (page<0){
                page=0;
            }
            Integer count=0;

            if (moduleName.equals(moduleId)) {
                count = commentBiz.getCountByCodPeople(teaName);
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
                commentList=commentBiz.searchCommentByPage(moduleName,teaName,startRow);
                //count=commentList.size();
                //System.out.println(count);

            req.setAttribute("teaName",comments);
            req.setAttribute("commentList",commentList);
            req.setAttribute("totalPages",totalPages);
            req.setAttribute("totalElements",count);
            req.setAttribute("currentPage",page);
            req.getRequestDispatcher("/WEB-INF/view/showAllComment.jsp").forward(req,resp);

        }catch (Exception ex){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
