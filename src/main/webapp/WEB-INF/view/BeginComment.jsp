<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/31
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考核信息</title>
  <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="/assets/css/app.css">
  <script src="/assets/js/jquery.min.js"></script>
</head>
<body>
<script src="/assets/js/theme.js"></script>
<!-- 头部 -->
<header>
  <!-- logo -->
  <div class="am-fl tpl-header-logo">
    <a href="javascript:void(0);"><img src="assets/img/logo.png" alt=""></a>
  </div>
  <!-- 右侧内容 -->
  <div class="tpl-header-fluid">
    <!-- 其它功能-->
    <div class="am-fr tpl-header-navbar">
      <ul>
        <!-- 欢迎语 -->
        <li class="am-text-sm tpl-header-navbar-welcome">
          <a href="javascript:;">欢迎你, <span>${sessionScope.user.userName}</span> </a>
        </li>
        <!-- 退出 -->
        <li class="am-text-sm">
          <a href="/pageUrl?url=WEB-INF/view/XiaoHui.jsp">
            <span class="am-icon-sign-out"></span> 退出
          </a>
        </li>
      </ul>
    </div>
  </div>

</header>
<div class="am-g tpl-g">
  <div class="tpl-login">
    <div class="tpl-login-content" style="margin: 2% auto 0">
      <img src="/assets/img/logo.png">
      <form class="am-form tpl-form-line-form" action="javascript:void(0)" method="post" onsubmit="return three()">
        <div class="am-form-group">
          <span>&nbsp;&nbsp;班级&nbsp;&nbsp;</span><input type="text" name="checkClass" placeholder="请设置班级" id="checkClass">
          <span style="font-size: 8px;font-family:微软雅黑;color: red ">请设置评论来源于哪个班级！</span>
        </div>

        <div class="am-form-group">
          <span>被评论人名字</span><input type="text" name="checkTeacher" placeholder="设置被评论人" id="checkTeacher">
          <span style="font-size: 8px;font-family:微软雅黑;color: red ">要评论谁？留下他的名字！</span>
        </div>
        <div class="am-form-group">
          <span>&nbsp;评论模块&nbsp;</span>
          <select id="checkModule" style="cursor: pointer">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
          </select>
          <span style="font-size: 8px;font-family:微软雅黑;color: red ">0代表餐饮 1代表讲师 2 代表班主任</span><br/>
        </div>
        <div class="am-form-group">
          <input type="submit" id="sub" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn" value="生成密码">
          <input type="reset" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn" value="重新设置">
        </div>
      </form>
      <span id="pwd" style="font-size: 20px;font-family: 微软雅黑;color: red"></span>
    </div>
  </div>
</div>
<script src="/js/jquery-3.0.0.js"></script>
<script>
$("#sub").click(function (){
  var className=$("#checkClass").val();
  var teacherName=$("#checkTeacher").val();
  var moduleId=$("#checkModule").val();
  var a=/^\s+$/gi;
  if(className==null || className==""){
    alert("班级不能为空！");
    return;
  }else if(a.test(className)){
    alert("班级不能全是空格");
    return;
  }else if(teacherName==null || teacherName==""){
    alert("被评论人名字不能为空");
    return;
  }else if(a.test(teacherName)){
    alert("被评论人名字不能全是空格");
  }else if(moduleId==null || moduleId==""){
    alert("评论的模块Id不能为空");
  }else if(a.test(moduleId)){
    alert("评论的模块Id不能全是空格")
  }else{
    $.post("/GetRandomPwd",
            {"checkClass":className,"checkTeacher":teacherName,"checkModule":moduleId},
            function(data){
              //alert(data)
              $("#pwd").text(data);
    });
  }
});
</script>
</body>
</html>
