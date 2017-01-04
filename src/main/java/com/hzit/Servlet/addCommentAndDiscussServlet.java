package com.hzit.Servlet;

import com.alibaba.fastjson.JSON;
import com.hzit.core.biz.CommentBiz;
import com.hzit.core.impl.CommentBizImpl;
import com.hzit.dao.entity.Comment;
import com.hzit.dao.entity.Discuss;
import com.hzit.dao.entity.Problem;
import com.hzit.dao.vo.AnswerVo;
import com.hzit.dao.vo.CheckVo;
import com.hzit.dao.vo.CommentVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/1/4.
 */
@WebServlet(name = "addCommentAndDiscussServlet",urlPatterns = "/addCommentAndDiscuss")
public class addCommentAndDiscussServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String question=request.getParameter("question");
        List<AnswerVo> answerVos=JSON.parseArray(question, AnswerVo.class);
        /*for (AnswerVo answerVo : answerVos){
            System.out.println(answerVo.toString());
        }*/
        PrintWriter out=response.getWriter();
        if (question!=null && answerVos.size()!=0){
            request.getSession().setAttribute("answerVos",answerVos);
            out.print(1);
        }else {
            out.print(-1);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session=request.getSession();
        List<AnswerVo> answerVos= (List<AnswerVo>) session.getAttribute("answerVos");
        CheckVo checkVo= (CheckVo) session.getAttribute("checkVo");
        CommentVo commentVo=new CommentVo();
        int score=0;
        List<Discuss> discussList=new ArrayList<>();
        commentVo.setCodPeople(checkVo.getCheckTeacher());
        commentVo.setComPeople(checkVo.getStuName());
        commentVo.setComuuId(UUID.randomUUID().toString());
        switch (checkVo.getCheckModule()){
            case 0:
                commentVo.setComModule("餐饮");
                break;
            case 1:
                commentVo.setComModule("教员");
                break;
            case 2:
                commentVo.setComModule("教务");
                break;
            default:
                commentVo.setComModule("未知");
                break;
        }
        commentVo.setComClass(checkVo.getCheckClass());
        for (AnswerVo answerVo : answerVos){
            Discuss discuss=new Discuss();
            discuss.setProId(Integer.parseInt(answerVo.getProId()));
            discuss.setDisResult(answerVo.getAnsContent());
            discuss.setComUuid(commentVo.getComuuId());
            try{
                score=score+Integer.parseInt(answerVo.getAnsSc());
            }catch (Exception ex){
                score=score+0;
            }
            discuss.setDisScore(answerVo.getAnsSc());
            discussList.add(discuss);
        }
        commentVo.setComScore(score);
        commentVo.setDiscusses(discussList);
        CommentBiz commentBiz=new CommentBizImpl();
        try {
            commentBiz.addComment(commentVo);
            response.sendRedirect("/toSucess");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("/500.jsp");
        }
    }
}
