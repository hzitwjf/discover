<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/28
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%
    String realIP = request.getHeader("x-forwarded-for");
    if (realIP != null && realIP.length() != 0) {
      out.print("你的IP地址是：" + realIP);
    } else {
      String ip = request.getRemoteAddr();
      out.print("你的IP地址是：" + ip);
    }
  %>
<form action="/checkLogin" method="post">
  <span>用户名</span><input type="text" name="userName" placeholder="请输入用户名！"><br/>
  <span>密码</span><input type="password" name="userPwd" placeholder="请输入密码！"><br/>
  <input type="submit" value="登录"> <input type="reset" value="重置">
</form>
  </body>
</html>
