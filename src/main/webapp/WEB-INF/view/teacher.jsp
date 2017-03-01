<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>班主任调查</title>
  <link rel="stylesheet" href="/css/common.css">
  <link rel="stylesheet" href="/css/teachers.css">
</head>
<body>
<header>
  <div>
    <h2>合众艾特班主任</h2>
    <span>统计班主任工作情况</span>
  </div>
</header>
<p>
    当前登录人：<span>${sessionScope.checkVo.stuName}</span>
    <span>被评论人：${sessionScope.checkVo.checkTeacher}</span>
</p>
<div class="wrap">
  <p>班主任调查表</p>
    <c:forEach items="${requestScope.problem}" var="p">
        <dl>
            <dt class="problem">${p.proContent}</dt>
            <dd style="margin-left: 100px">
                <c:forEach items="${requestScope.answerList}" var="list">
                    <c:forEach items="${list}" var="a">
                        <c:if test="${p.proId==a.proId}">
                <span>
                <input type="radio" name="question${a.proId}" class="ans" proId="${a.proId}" proContent="${p.proContent}" ansSc="${a.ansSc}" value="${a.ansContent}">${a.ansContent}
                ${a.ansSc}分
                </span>
                        </c:if>
                    </c:forEach>
                </c:forEach>
            </dd>
        </dl>
    </c:forEach>
</div>
<input type="submit" value="提交问卷" id="submit">
<script src="/js/jquery-3.0.0.js"></script>
<script>
    $(function () {
        var question=new Array();
        $("dd span:nth-child(2) input").each(function () {
            this.checked = true;
            var proId=$(this).attr("proId");
            var ansSc=$(this).attr("ansSc");
            var proContent=$(this).attr("proContent");
            var ansContent=$(this).val();
            var answer={"proId":proId,"ansContent":ansContent,"ansSc":ansSc,"proContent":proContent};
            question.push(answer)
            //console.log(question)
        });

        $(".ans").click(function () {
            var proId=$(this).attr("proId");
            var ansSc=$(this).attr("ansSc");
            var ansContent=$(this).val();
            //var answer={"proId":proId,"ansContent":ansContent};
            for(var i = 0; i < question.length; i++){
                if(proId == question[i].proId){
                    question[i].ansContent=ansContent;
                    question[i].ansSc=ansSc;
                    return;
                }
            }
            //question.push(answer);
        });
        $("#textarea").blur(function () {
            var proId=$(this).attr("proId");
            var ansSc=$(this).attr("ansSc");
            var proContent=$(this).attr("proContent");
            var ansContent=$(this).val();
            var answer={"proId":proId,"ansContent":ansContent,"ansSc":ansSc,"proContent":proContent};
            for(var i = 0; i < question.length; i++){
                if(proId == question[i].proId){
                    question[i].ansContent=ansContent;
                    return;
                }
            }
            question.push(answer);
        });
        $("#submit").click(function () {
            //添加表单验证，要求所有题目的单选框都被选中
            /*var text=$("#textarea").val();
            var a=/^\s+$/gi;*/
            var problemLength=$(".problem").length;
            if (question.length<problemLength){
                alert("你还有其他问题没有回答！赶紧去补全答案吧");
                return;
            }else {
               /* if (text==null || text==""){
                    alert("难道你没有什么想对你老师说什么的吗？")
                }else if(a.test(text)){
                    alert("不能全是空格！");
                }else{*/
                    console.log(question)
                    $.ajax({
                        url: '/addCommentAndDiscuss',
                        data: { "question": JSON.stringify(question)},
                        dataType: "json",
                        type: "POST",
                        traditional: true,
                        success: function (data) {
                            if (data==1){
                                window.location="/showCommentDetails";

                            }else {
                                window.location="/500.jsp";
                            }
                        },
                        error:function(ex){
                            alert(ex);
                            a                      }
                    });
                //}
            }
        });
    })
</script>
</body>
</html>
