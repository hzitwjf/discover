<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/31
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>hello</h1>
<c:forEach items="${requestScope.problem}" var="p">
  <h4>${p.proContent}</h4>
  <c:forEach items="${requestScope.answerList}" var="list">
    <c:forEach items="${list}" var="a">
      <c:if test="${p.proId==a.proId}">
        <span style="margin-left: 100px">${a.ansContent}</span>
      </c:if>
    </c:forEach>
  </c:forEach>
</c:forEach>
</body>
</html>
