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
    <title>管理员登录</title>
    <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="/assets/css/app.css">
    <script src="/assets/js/jquery.min.js"></script>
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
<script src="/assets/js/theme.js"></script>
<div class="am-g tpl-g">
  <div class="tpl-login">
    <div class="tpl-login-content">
      <img src="/assets/img/logo.png">
      <form class="am-form tpl-form-line-form" action="/checkLogin" method="post" onsubmit="return three()">
        <div class="am-form-group">
          <input type="text" name="userName" placeholder="请输入用户名！" id="userName" onblur="one()">
          <span id="uName" style="font-size: 8px;font-family: 微软雅黑;color: red;"></span>
        </div>

        <div class="am-form-group">
          <input type="password" name="userPwd" placeholder="请输入密码！" id="userPwd" onblur="two()">
          <span id="uPwd" style="font-size: 8px;font-family: 微软雅黑;color: red;"></span>
        </div>
        <div class="am-form-group">
          <input type="submit" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn" value="提交">
          <input type="reset" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn" value="重置">
        </div>
      </form>
    </div>
  </div>
</div>
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
