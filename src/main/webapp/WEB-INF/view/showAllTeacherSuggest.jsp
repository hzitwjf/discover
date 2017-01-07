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
        <div class="widget-title  am-cf">建议列表</div>


      </div>
      <div class="widget-body  am-fr">
        <div class="am-u-sm-12">
          <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
            <thead>
            <tr>
              <th>被评论人</th>
              <th>评论时间</th>
              <th>题目名称</th>
              <th>所提出的建议</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${sessionScope.discussVoList}" var="d">
              <tr class="gradeX">
                <td>${d.codPeople}</td>
                <td>${d.comTime}</td>
                <td>
                  <input type="hidden" value="${d.disId}">
                  ${d.proContent}
                  <input type="hidden" value="${d.comUuid}">
                  <input type="hidden" value="${d.proId}">
                </td>
                <td>${d.disResult}<input type="hidden" value="${d.disScore}"></td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
        <span style="margin-left: 525px;">
          <a href="javascript:history.go(-1)" class="am-btn am-btn-default am-btn-warning">返回</a>
          <a href="/load.do" class="am-btn am-btn-default am-btn-primary">导出到excel</a>
        </span>
    </div>
  </div>
</div>
</div>
</div>
<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/app.js"></script>

</body>
</html>
