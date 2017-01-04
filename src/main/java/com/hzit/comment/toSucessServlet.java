package com.hzit.comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/1/4.
 */
@WebServlet(name = "toSucessServlet",urlPatterns = "/toSucess")
public class toSucessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "  <title>增加成功</title>\n" +
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
                "        <div class=\"tpl-page-state-title am-text-center tpl-error-title\">AddCommentSuccessful</div>\n" +
                "        <div class=\"tpl-error-title-info\">Data has  been properly increased so you are seeing this as a fallback.</div>\n" +
                "        <div class=\"tpl-page-state-content tpl-error-content\">\n" +
                "\n" +
                "          <p>恭喜你,数据增加成功,谢谢合作！</p>\n" +
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
