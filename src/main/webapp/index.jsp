<%@ page import="java.util.UUID" %>
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
    <title>登录评论</title>
    <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="/assets/css/app.css">
    <script src="/assets/js/jquery.min.js"></script>
  </head>
  <body data-type="login">
  <%
    String realIP = request.getHeader("x-forwarded-for");
    if (realIP != null && realIP.length() != 0) {
      out.print("你的IP地址是：" + realIP);
      //session.setAttribute("ip",realIP);
    } else {
      String ip = request.getRemoteAddr();
      out.print("本机IP地址是：" + ip);
    }
    String name= UUID.randomUUID().toString();
    name=name.substring(0,8);
    %>
  <script src="/assets/js/theme.js"></script>
  <div class="am-g tpl-g">
    <div class="tpl-login">
      <div class="tpl-login-content">
          <img src="/assets/img/logo.png">
        <form class="am-form tpl-form-line-form" action="/login.do" method="post" onsubmit="return three()">
          <div class="am-form-group">
            <input type="text" name="stuName" placeholder="请输入你的昵称！" id="stuName" onblur="one()" value="<%=name%>">
            <span id="uName" style="font-size: 8px;font-family: 微软雅黑;color: red;"></span>
          </div>

          <div class="am-form-group">
            <input type="password" name="stuPwd" placeholder="请输入考核密码！" id="stuPwd" onblur="two()">
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
<%--<form action="/login.do" method="post" onsubmit="return three()">
  <span>昵称</span>
  <span>密码</span><br/>
  <input type="submit" value="登录"> <input type="reset" value="重置">
</form>--%>
  <script src="/js/jquery-3.0.0.js"></script>
  <script>
    function one(){
      var name=$("#stuName").val();
      if(name==null || name==""){
        //alert("昵称不能为空");
        $("#uName").text("昵称不能为空");
        return false;
      }
      var a=/^\s+$/gi;
      if(a.test(name)){
          //alert("昵称不能全是空格");
          $("#uName").text("昵称不能全是空格");
          return false;
      }
      $("#uName").text("OK!");
      return true;
    }
    function two(){
      var pwd=$("#stuPwd").val();
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
