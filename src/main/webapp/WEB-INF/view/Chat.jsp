<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/11
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>聊天室</title>
  <script src="/js/jquery-3.0.0.js"></script>
  <script>
    $(function(){
      var webSocket=new WebSocket("ws://192.168.0.162:8120/getChat");
      //开
      webSocket.onopen=function(){
        console.log("发起服务器链接成功");
      }
      //关
      webSocket.onclose=function(){
        console.log("服务器链接成功,正在关闭");
      }
      //发送消息
      webSocket.onmessage=function(obj){
        console.log("服务器链接成功，正在发送消息");
        $("#showMsg").append(obj.data);
      }
      //异常
      webSocket.onerror=function(){
        console.log("服务器链接异常，报错！");
      }
      $("#btn").click(function(){
        //向服务器发送消息
        webSocket.send($("#msg").val());
      });
      //浏览器刷新时释放资源
      window.onbeforeunload=function(){
        webSocket.close();
      }
    });
  </script>
</head>
<body>
<h1>webSocket</h1>
<input type="text" id="msg" placeholder="在这输入你想要发送的信息！">
<input type="button" id="btn" value="发送消息">
<div id="showMsg"></div>
</body>
</html>
