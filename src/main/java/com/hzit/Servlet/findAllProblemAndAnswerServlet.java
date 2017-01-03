package com.hzit.Servlet;

import com.hzit.core.biz.AnswerBiz;
import com.hzit.core.biz.ProblemBiz;
import com.hzit.core.impl.AnswerBizImpl;
import com.hzit.core.impl.ProblemBizImpl;
import com.hzit.dao.entity.Answer;
import com.hzit.dao.entity.Problem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */
@WebServlet(name = "findAllProblemAndAnswerServlet",urlPatterns = "/findAllProblemAndAnswer")
public class findAllProblemAndAnswerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ProblemBiz problemBiz=new ProblemBizImpl();
        AnswerBiz answerBiz=new AnswerBizImpl();
        Collection<List<Answer>> listCollection=new ArrayList<List<Answer>>();
        String proModule=request.getParameter("proModule");
        List<Problem> problemList= problemBiz.findAllProblemByModuleId(proModule);
        for (Problem problem : problemList) {
            List<Answer> answerList=answerBiz.findAllAnswerByProId(problem.getProId());
            listCollection.add(answerList);
        }
        request.setAttribute("problem",problemList);
        request.setAttribute("answerList",listCollection);
        request.getRequestDispatcher("/WEB-INF/view/AllProblemAndAnswer.jsp").forward(request,response);
    }
}
