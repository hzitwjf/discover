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
    <title></title>
</head>
<body>
<h1>开始考核</h1>
<form action="javascript:void(0)" method="post">
  <span>&nbsp;&nbsp;班级&nbsp;&nbsp;</span><input type="text" name="checkClass" placeholder="请设置班级" id="checkClass">
  <span style="font-size: 8px;font-family:微软雅黑;color: red ">请设置评论来源于哪个班级！</span><br/>
  <span>被评论人名字</span><input type="text" name="checkTeacher" placeholder="设置被评论人" id="checkTeacher">
  <span style="font-size: 8px;font-family:微软雅黑;color: red ">要评论谁？留下他的名字！</span><br/>
  <span>&nbsp;评论模块&nbsp;</span><input type="text" name="checkModule" placeholder="设置考察模块" id="checkModule">
  <span style="font-size: 8px;font-family:微软雅黑;color: red ">0代表餐饮 1代表讲师 2 代表班主任</span><br/>
  <input type="button" value="生成密码" id="sub"> <input type="reset" value="重新设置">
</form>
<span id="pwd"></span>
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
