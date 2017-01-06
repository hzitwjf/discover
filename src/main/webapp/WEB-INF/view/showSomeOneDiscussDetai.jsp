<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="/assets/css/app.css">
  <script src="/assets/js/jquery.min.js"></script>
</head>
<body>
<script src="/assets/js/theme.js"></script>
<div class="row-content am-cf">
  <div class="row">
  <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
    <div class="widget am-cf">
      <div class="widget-head am-cf">
        <div class="widget-title  am-cf">评论详情</div>


      </div>
      <div class="widget-body  am-fr">
        <div class="am-u-sm-12">
          <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
            <thead>
            <tr>
              <th>评论Id</th>
              <th>问题内容</th>
              <th>答案内容</th>
              <th>所得分数</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.discussVoList}" var="d">
              <tr class="gradeX">
                <td>${d.disId}<input type="hidden" value="${d.comUuid}"></td>
                <td><input type="hidden" value="${d.proId}">${d.proContent}</td>
                <td>${d.disResult}</td>
                <td>${d.disScore}</td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
        <span style="margin-left: 525px;"><a href="javascript:history.go(-1)" class="am-btn am-btn-default am-btn-warning">返回</a></span>
    </div>
  </div>
</div>
</div>
</div>
<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/app.js"></script>

</body>
</html>
