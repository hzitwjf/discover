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
            String p=request.getParameter("page");
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
            int startRow=(page-1)*30;
            List<Comment> commentList=commentBiz.searchCommentByPage(moduleName, page);
            HttpSession session=request.getSession();
            session.setAttribute("teaName",comments);
            session.setAttribute("commentList",commentList);
            session.setAttribute("totalPages",totalPages);
            session.setAttribute("totalElements",count);
            PrintWriter out=response.getWriter();
            out.write("/pageUrl?url=/WEB-INF/view/showAllComment.jsp");
        }catch (Exception ex){

        }
    }
}
