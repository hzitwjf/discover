package com.hzit.Servlet;

import com.hzit.core.biz.CheckBiz;
import com.hzit.core.impl.CheckBizImpl;
import com.hzit.dao.entity.Check;
import com.hzit.dao.vo.CheckVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/1/3.
 */
@WebServlet(name ="studentLoginServlet",urlPatterns = "/login.do")
public class studentLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String stuName=request.getParameter("stuName");
            String stuPwd=request.getParameter("stuPwd");
            PrintWriter printWriter=response.getWriter();
            //printWriter.print("昵称是："+stuName+"\t密码是："+stuPwd);
            CheckBiz checkBiz=new CheckBizImpl();
            CheckVo checkVo=checkBiz.findCheckByCheckPwd(stuPwd);
            if (checkVo!=null){
                checkVo.setStuName(stuName);
                request.getSession().setAttribute("checkVo",checkVo);
                response.sendRedirect("findAllProblemAndAnswer?hzitxx="+stuPwd+checkVo.getCheckModule()+stuPwd+checkVo.getCheckModule()+"&&proModule=??.com");
            }else {
                printWriter.print("<html>\n" +
                        "<head>\n" +
                        "  <meta charset=\"utf-8\">\n" +
                        "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "  <title>登录失败</title>\n" +
                        "  <meta name=\"description\" content=\"这是一个 index 页面\">\n" +
                        "  <meta name=\"keywords\" content=\"index\">\n" +
                        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "  <meta name=\"renderer\" content=\"webkit\">\n" +
                        "  <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n" +
                        "  <link rel=\"icon\" type=\"image/png\" href=\"assets/i/favicon.png\">\n" +
                        "  <link rel=\"apple-touch-icon-precomposed\" href=\"assets/i/app-icon72x72@2x.png\">\n" +
                        "  <meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\n" +
                        "  <script src=\"assets/js/echarts.min.js\"></script>\n" +
                        "  <link rel=\"stylesheet\" href=\"assets/css/amazeui.min.css\" />\n" +
                        "  <link rel=\"stylesheet\" href=\"assets/css/amazeui.datatables.min.css\" />\n" +
                        "  <link rel=\"stylesheet\" href=\"assets/css/app.css\">\n" +
                        "  <script src=\"assets/js/jquery.min.js\"></script>\n" +
                        "\n" +
                        "</head>\n" +
                        "\n" +
                        "<body data-type=\"widgets\" style=\"background: #e9ecf3; \">\n" +
                        "<script src=\"assets/js/theme.js\"></script>\n" +
                        "<div class=\"row-content am-cf\" >\n" +
                        "  <div class=\"widget am-cf\" style=\"background-color: #ffffff;border: 0px solid #ffffff\">\n" +
                        "    <div class=\"widget-body\" >\n" +
                        "      <div class=\"tpl-page-state\">\n" +
                        "        <div class=\"tpl-page-state-title am-text-center tpl-error-title\">PasswordError</div>\n" +
                        "        <div class=\"tpl-error-title-info\">Comment password is incorrect, please check whether the password is entered correctly</div>\n" +
                        "        <div class=\"tpl-page-state-content tpl-error-content\">\n" +
                        "\n" +
                        "          <p>密码错误或者密码已失效，请向班主任核对密码后再来！</p>\n" +
                        "          <p style=\"color:red;\">注释：密码一天之内有效，超时无效！请联系班主任重新申请密码</p>\n" +
                        "          <a class=\"am-btn am-btn-secondary am-radius tpl-error-btn\" href=\"/index.jsp\">Back Home</a>\n" +
                        "        </div>\n" +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>\n" +
                        "<script src=\"/assets/js/amazeui.min.js\"></script>\n" +
                        "<script src=\"/assets/js/amazeui.datatables.min.js\"></script>\n" +
                        "<script src=\"/assets/js/dataTables.responsive.min.js\"></script>\n" +
                        "<script src=\"/assets/js/app.js\"></script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
