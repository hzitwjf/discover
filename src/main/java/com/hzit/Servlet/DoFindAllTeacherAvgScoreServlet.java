package com.hzit.Servlet;

import com.hzit.core.biz.DiscussBiz;
import com.hzit.core.impl.DiscussBizImpl;
import com.hzit.dao.vo.CommentVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
@WebServlet(name = "DoFindAllTeacherAvgScoreServlet",urlPatterns = "/doFindAllTeacherAvgScore")
public class DoFindAllTeacherAvgScoreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try{
            String moduleName=request.getParameter("moduleName");
            if (moduleName==null || moduleName.equals("")){
                moduleName= (String) request.getSession().getAttribute("moduleName");
            }
            DiscussBiz discussBiz=new DiscussBizImpl();
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String time=request.getParameter("time");
            if (time==null || time.equals("")){
                time=simpleDateFormat.format(date);
            }
            List<CommentVo> commentVoList=discussBiz.findAllTeacherScore(moduleName, time);
            for (CommentVo commentVo : commentVoList){
                request.setAttribute("year",commentVo.getComId());
                request.setAttribute("month", commentVo.getComTime());
            }
            request.setAttribute("commentVoList",commentVoList);
            request.setAttribute("moduleName",moduleName);
            request.getRequestDispatcher("/WEB-INF/view/showAllTeacherAvgScore.jsp").forward(request,response);
        }catch (Exception ex){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
