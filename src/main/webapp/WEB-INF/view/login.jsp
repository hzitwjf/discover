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
<%--  <%
    String realIP = request.getHeader("x-forwarded-for");
    if (realIP != null && realIP.length() != 0) {
      out.print("你的IP地址是：" + realIP);
    } else {
      String ip = request.getRemoteAddr();
      out.print("你的IP地址是：" + ip);
    }
  %>--%>
<form action="/checkLogin" method="post" onsubmit="return three()">
  <span>用户名</span><input type="text" name="userName" placeholder="请输入用户名！" id="userName" onblur="one()">
  <span id="uName" style="font-size: 8px;font-family: 微软雅黑;color: red;"></span> <br/>
  <span>密码</span><input type="password" name="userPwd" placeholder="请输入密码！" id="userPwd" onblur="two()">
  <span id="uPwd" style="font-size: 8px;font-family: 微软雅黑;color: red;"></span> <br/>
  <input type="submit" value="登录"> <input type="reset" value="重置">
</form>
  <script src="/js/jquery-3.0.0.js"></script>
<script>
  function one(){
    var name=$("#userName").val();
    if(name==null || name==""){
      //alert("昵称不能为空");
      $("#uName").text("用户名不能为空");
      return false;
    }
    var a=/^\s+$/gi;
    if(a.test(name)){
      //alert("昵称不能全是空格");
      $("#uName").text("用户名不能全是空格");
      return false;
    }
    $("#uName").text("OK!");
    return true;
  }
  function two(){
    var pwd=$("#userPwd").val();
    if(pwd==null || pwd==""){
      //alert("密码不能为空！");
      $("#uPwd").text("密码不能为空");
      return false;
    }
    $("#uPwd").text("OK!");
    return true;
  }
  function three(){
    return one() && two();
  }
</script>
  </body>
</html>
