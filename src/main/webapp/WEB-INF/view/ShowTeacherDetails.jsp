<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>评价结果</title>
  <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
                  <div class="text-info" style="margin-left: auto;margin-right: auto;width: 200px">
                    关于<strong class="text-danger" >${sessionScope.checkVo.checkTeacher}</strong>的评价
                  </div>
                  <%--<form method="post" action="/showCommentDetails">--%>
                    <table class="table table-hover">
                      <thead>
                      <tr>
                        <th>问题名称</th>
                        <th>对该问题提出的意见</th>
                        <th>分数</th>
                      </tr>
                      </thead>
                    <tbody>
                    <c:forEach items="${sessionScope.answerVos}" var="a">
                      <tr>
                        <td >
                          <%--<input type="hidden" name="proId" value="${a.proId}"> --%>${a.proContent}
                        </td>
                        <td>
                          <%--<input type="hidden" name="ansContent" value="${a.ansContent}">--%>${a.ansContent}
                        </td>
                        <td>
                          <%--<input type="hidden" name="ansSc" value="${a.ansSc}">--%>${a.ansSc}
                        </td>
                      </tr>
                    </c:forEach>
                    </tbody>
                   </table>
                    <a href="addCommentAndDiscuss" class="btn btn-primary" style="margin-left: 560px;">确认评价</a>
                    <a href="/findAllProblemAndAnswer?hzitxx=6666${sessionScope.checkVo.checkModule}6666${sessionScope.checkVo.checkModule}&&proModule=??.com"
                    class="btn btn-info" style="">返回重新评论</a>
                 <%--</form>--%>
</body>
</html>
