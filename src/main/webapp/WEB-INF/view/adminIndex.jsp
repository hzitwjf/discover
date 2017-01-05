<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>管理员首页</title>
  <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="/assets/css/app.css">
  <script src="/assets/js/jquery.min.js"></script>
<style>
  .he{
    float: left;
    margin-left: 65px;
  }
</style>
</head>

<body data-type="widgets">
<script src="/assets/js/theme.js"></script>

  <!-- 头部 -->
  <header>
    <!-- logo -->
    <div class="am-fl tpl-header-logo">
      <a href="javascript:;"><img src="assets/img/logo.png" alt=""></a>
    </div>
    <!-- 右侧内容 -->
    <div class="tpl-header-fluid">

      <!-- 搜索 -->
      <div class="am-fl tpl-header-search" style="line-height: 56px">
        <ul>
          <%--<li class="am-text-sm" style="float: left">
            <a href="javascript:void (0);"><span class="comment" moduleId="0">餐饮评论</span> </a>
          </li>--%>
          <li class="am-text-sm he">
            <a href="javascript:void (0)"><span class="comment" moduleId="1">讲师评论</span></a>
          </li>
          <li class="am-text-sm he">
            <a href="javascript:void (0)"><span class="comment" moduleId="2">班主任评论</span></a>
          </li>
          <%--<li class="am-text-sm he">
            <a href="javascript:void (0)"><span>餐饮调查结果</span></a>
          </li>--%>
          <li class="am-text-sm he">
            <a href="javascript:void (0)"><span>讲师调查结果</span></a>
          </li>
          <li class="am-text-sm he">
            <a href="javascript:void (0)"><span>班主任调查结果</span></a>
          </li>
        </ul>
      </div>
      <!-- 其它功能-->
      <div class="am-fr tpl-header-navbar">
        <ul>
          <!-- 欢迎语 -->
          <li class="am-text-sm tpl-header-navbar-welcome ">
            <a href="javascript:void(0);">欢迎你, <span>${sessionScope.user.userName}</span> </a>
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
  <!-- 内容区域 -->
    <iframe src="/pageUrl" width="100%" scrolling="no" height="100%" frameborder="0" id="ram"></iframe>

<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/amazeui.datatables.min.js"></script>
<script src="/assets/js/dataTables.responsive.min.js"></script>
<script src="/assets/js/app.js"></script>
<script src="/js/jquery-3.0.0.js"></script>
<script>
  $(function(){
    $(".comment").click(function(){
      var moduleId=$(this).attr("moduleId");
      //alert(moduleId)
      $.post("/toShowAllComment",{"comModule":moduleId},function(data){
        $("#ram").attr("src",data);
        //alert(data)
      });
    });
  });
</script>
</body>
</html>
