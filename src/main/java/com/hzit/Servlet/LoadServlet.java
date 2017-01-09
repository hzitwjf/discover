package com.hzit.Servlet;

import com.hzit.dao.vo.DiscussVo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by Administrator on 2017/1/7.
 */
@WebServlet(name = "LoadServlet",urlPatterns = "/load.do")
public class LoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<DiscussVo> discussVoList= (List<DiscussVo>) request.getSession().getAttribute("discussVoList");
             //定义一个新的工作簿
            Workbook workbook=new HSSFWorkbook();
            String teaName="";
            for (DiscussVo discussVo : discussVoList){
                teaName=discussVo.getCodPeople();
            }
            Sheet sheet=workbook.createSheet("学生给"+teaName+"老师的建议");
            Row row=sheet.createRow(0);
            row.createCell(0).setCellValue("被评论人");
            row.createCell(1).setCellValue("评论时间");
            row.createCell(2).setCellValue("题目名称");
            row.createCell(3).setCellValue("所提出的建议");
            int i=1;
            for (DiscussVo discussVo : discussVoList){
                Row rowNum=sheet.createRow(i);
                rowNum.createCell(0).setCellValue(discussVo.getCodPeople());
                rowNum.createCell(1).setCellValue(discussVo.getComTime());
                rowNum.createCell(2).setCellValue(discussVo.getProContent());
                rowNum.createCell(3).setCellValue(discussVo.getDisResult());
                i++;
            }
            //使用文件输出流输出文件
            FileOutputStream fileOutputStream = new FileOutputStream("C:/"+teaName+".xls");
            //response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(teaName, "UTF-8")+".xls");
            workbook.write(fileOutputStream);
            //关闭文件输出流
            fileOutputStream.close();
            response.setCharacterEncoding("UTF-8");
            PrintWriter out=response.getWriter();
            out.println("<html>\n" +
                    "<head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "  <title>导入成功</title>\n" +
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
                    "        <div class=\"tpl-page-state-title am-text-center tpl-error-title\">LoadExcelSuccessful</div>\n" +
                    "        <div class=\"tpl-error-title-info\">Data has  been properly increased so you are seeing this as a fallback.</div>\n" +
                    "        <div class=\"tpl-page-state-content tpl-error-content\">\n" +
                    "\n" +
                    "          <p>恭喜你,数据导入到excel成功！</p>\n" +
                    "          <a class=\"am-btn am-btn-secondary am-radius tpl-error-btn\" href=\"javascript:history.go(-2)\">Back Home</a>\n" +
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
        }catch (Exception ex) {
            response.setCharacterEncoding("UTF-8");
            PrintWriter out=response.getWriter();
            out.println("<html>\n" +
                    "<head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "  <title>导入失败</title>\n" +
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
                    "        <div class=\"tpl-page-state-title am-text-center tpl-error-title\">LoadExcelDefeat</div>\n" +
                    "        <div class=\"tpl-error-title-info\">Data has not been properly increased so you are seeing this as a fallback.</div>\n" +
                    "        <div class=\"tpl-page-state-content tpl-error-content\">\n" +
                    "\n" +
                    "          <p>恭喜你,数据导入到excel失败！</p>\n" +
                    "          <a class=\"am-btn am-btn-secondary am-radius tpl-error-btn\" href=\"/pageUrl?url=WEB-INF/view/XiaoHui.jsp\">Back Home</a>\n" +
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
}
