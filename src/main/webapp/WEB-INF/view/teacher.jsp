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
    <dt>${p.proContent}</dt>
    <dd style="margin-left: 100px">
    <c:forEach items="${requestScope.answerList}" var="list">
      <c:forEach items="${list}" var="a">
        <c:if test="${p.proId==a.proId}">
            <span>
                <input type="radio" id="question${a.proId}" name="question${a.proId}"><label for="question${a.proId}">${a.ansContent}</label>
                ${a.ansSc}分
            </span>
        </c:if>
      </c:forEach>
    </c:forEach>
    </dd>
  </dl>
  </c:forEach>
  <%--<dl>
    <dt>一、老师早上(8:25)和中午(13:25)是否能做提前来到教室提醒学员准备上课？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question1-1" name="question1"><label for="question1-1">一直能做到</label>
                5分
            </span>
            <span>
                <input type="radio" id="question1-2" name="question1"><label for="question1-2">偶尔没做到</label>
                3分
            </span>
            <span>
                <input type="radio" id="question1-3" name="question1"><label for="question1-3">偶尔能做到</label>
                1分
            </span>
            <span>
                <input type="radio" id="question1-4" name="question1"><label for="question1-4">一直没做到</label>
                0分
            </span>
    </dd>
  </dl>--%>
<%--  <dl>
    <dt>二、老师中午(12:00)和晚上(17:30)是否能做到准时下课？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question2-1" name="question2"><label for="question2-1">一直能准时下课 </label>
                5分
            </span>
            <span>
                <input type="radio" id="question2-2" name="question2"><label for="question2-2">偶尔提前或延后 </label>
                3分
            </span>
            <span>
                <input type="radio" id="question2-3" name="question2"><label for="question2-3">经常提前或延后 </label>
                1分
            </span>
            <span>
                <input type="radio" id="question2-4" name="question2"><label for="question2-4">一直是提前下课 </label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>三、老师上课时的上课案例，备课是否充分？&nbsp;（5分）</dt>
    <dd>
            <span>
                <input type="radio" id="question3-1" name="question3"><label for="question3-1">案例和授课用具充分</label>
                5分
            </span>
            <span>
                <input type="radio" id="question3-2" name="question3"><label for="question3-2">案例和授课用具一般 </label>
                3分
            </span>
            <span>
                <input type="radio" id="question3-3" name="question3"><label for="question3-3">案例不够详细 </label>
                1分
            </span>
            <span>
                <input type="radio" id="question3-4" name="question3"><label for="question3-4">备课不充分</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>四、老师在课堂上是否针对性进行小结和回顾？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question4-1" name="question4"><label for="question4-1">每天的课程都有回顾和小结 </label>
                5分
            </span>
            <span>
                <input type="radio" id="question4-2" name="question4"><label for="question4-2">几天一次回顾和小结</label>
                3分
            </span>
            <span>
                <input type="radio" id="question4-3" name="question4"><label for="question4-3">偶尔会回顾和小结一次</label>
                1分
            </span>
            <span>
                <input type="radio" id="question4-4" name="question4"><label for="question4-4">没有回顾和小结</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>五、每天的授课前30分钟是否有学员上讲台回顾授课知识点？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question5-1" name="question5"><label for="question5-1">每周实施上台回顾次数4次</label>
                5分
            </span>
            <span>
                <input type="radio" id="question5-2" name="question5"><label for="question5-2">每周实施上台回顾次数3次</label>
                3分
            </span>
            <span>
                <input type="radio" id="question5-3" name="question5"><label for="question5-3">每周实施上台回顾次数2次</label>
                2分
            </span>
            <span style="max-width: 278px">
                <input type="radio" id="question5-4" name="question5"><label for="question5-4">每周实施上台回顾次数0到1次 </label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>六、老师的技术能力是否满足该课程的教学要求？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question6-1" name="question6"><label for="question6-1">完全达到，非常喜欢这位老师</label>
                5分
            </span>
            <span>
                <input type="radio" id="question6-2" name="question6"><label for="question6-2">达到，但讲课方法希望提升</label>
                4分
            </span>
            <span>
                <input type="radio" id="question6-3" name="question6"><label for="question6-3">达到, 但是我听不懂</label>
                3分
            </span>
            <span>
                <input type="radio" id="question6-4" name="question6"><label for="question6-4">不是所有技能点都能达到，教学方法有待提升</label>
                2分
            </span>
            <span>
                <input type="radio" id="question6-5" name="question6"><label for="question6-5">没有达到</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>七、老师上课时候理论知识，是否能做到思路清晰、重点突出？&nbsp;(7分)</dt>
    <dd>
            <span>
                <input type="radio" id="question7-1" name="question7"><label for="question7-1">思路清晰，重点突出，点赞！</label>
                7分
            </span>
            <span>
                <input type="radio" id="question7-2" name="question7"><label for="question7-2">思路清晰，重点不突出</label>
                5分
            </span>
            <span>
                <input type="radio" id="question7-3" name="question7"><label for="question7-3">思路不清晰，重点突出</label>
                3分
            </span>
            <span>
                <input type="radio" id="question7-4" name="question7"><label for="question7-4">思路不清晰，重点不突出 </label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>八、老师上课时，是否经常和学员互动，提问题？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question8-1" name="question8"><label for="question8-1">经常互动，提问学员 </label>
                5分
            </span>
            <span>
                <input type="radio" id="question8-2" name="question8"><label for="question8-2">经常互动，但缺乏提问</label>
                3分
            </span>
            <span>
                <input type="radio" id="question8-3" name="question8"><label for="question8-3">不经常互动，偶尔提问 </label>
                1分
            </span>
            <span>
                <input type="radio" id="question8-4" name="question8"><label for="question8-4">不经常互动，从不提问 </label>
                2分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>九、老师是否关注课堂纪律，及时纠正学生违纪行为？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question9-1" name="question9"><label for="question9-1">关注课堂纪律并能及时纠正违纪行为 </label>
                5分
            </span>
            <span>
                <input type="radio" id="question9-2" name="question9"><label for="question9-2">关注课堂纪律但不能纠正违纪行为 </label>
                3分
            </span>
            <span>
                <input type="radio" id="question9-3" name="question9"><label for="question9-3">偶尔关注课堂纪律和纠正违纪行为 </label>
                1分
            </span>
            <span>
                <input type="radio" id="question9-4" name="question9"><label for="question9-4">不关注课堂纪律也不纠正课堂行为 </label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十、老师是否很能及时，正确的解答问题？&nbsp;(10分)</dt>
    <dd>
            <span>
                <input type="radio" id="question10-1" name="question10"><label for="question10-1">一直都是，很有责任心，而且是技术大牛</label>
                10分
            </span>
            <span>
                <input type="radio" id="question10-2" name="question10"><label for="question10-2">一直都是，但偶尔因为问题多而忽略了</label>
                8分
            </span>
            <span>
                <input type="radio" id="question10-3" name="question10"><label for="question10-3">能正确的解答问题，但一般不是很及时</label>
                6分
            </span>
            <span>
                <input type="radio" id="question10-4" name="question10"><label for="question10-4">我不敢提问老师问题</label>
                4分
            </span>
            <span>
                <input type="radio" id="question10-5" name="question10"><label for="question10-5">不能及时，正确的回答问题</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十一、老师是否适当布置作业，认真批改作业？&nbsp;(3分)</dt>
    <dd>
            <span>
                <input type="radio" id="question11-1" name="question11"><label for="question11-1">适当布置，并且认真批改</label>
                3分
            </span>
            <span>
                <input type="radio" id="question11-2" name="question11"><label for="question11-2">作业布置了，但没有批改</label>
                2分
            </span>
            <span>
                <input type="radio" id="question11-3" name="question11"><label for="question11-3">没有布置过作业</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十二、	机房上课老师是否做到通过机房控制软件查看全场机器，并给予学员指导？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question12-1" name="question12"><label for="question12-1">经常用极域机房控制软件,查看全场学员的屏幕，并及时给予指导</label>
                5分
            </span>
            <span>
                <input type="radio" id="question12-2" name="question12"><label for="question12-2">经常用极域机房控制软件,查看全场学员的屏幕，偶尔给予指导</label>
                4分
            </span>
            <span>
                <input type="radio" id="question12-3" name="question12"><label for="question12-3">很少用机房控制软件查看学员电脑，我们一般也不主动提问问题</label>
                3分
            </span>
            <span>
                <input type="radio" id="question12-4" name="question12"><label for="question12-4">很少用机房控制软件查看学员电脑，很少主动指导学员</label>
                2分
            </span>
            <span>
                <input type="radio" id="question12-5" name="question12"><label for="question12-5">一般不用查看学员机器。也不主动给予指导</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十三、上课老师是否关注你的上机进度，引导和解决问题？&nbsp;(10分)</dt>
    <dd>
            <span>
                <input type="radio" id="question13-1" name="question13"><label for="question13-1">上课老师能及时关注上机进度，并且引导和解决学员问题</label>
                10分
            </span>
            <span>
                <input type="radio" id="question13-2" name="question13"><label for="question13-2">上课老师能及时关注上机进度，但解决问题的能力需要加强 </label>
                8分
            </span>
            <span>
                <input type="radio" id="question13-3" name="question13"><label for="question13-3">上课老师不能及时关注上机进度，但可以解决问题</label>
                6分
            </span>
            <span>
                <input type="radio" id="question13-4" name="question13"><label for="question13-4">我能够自己解决问题。不需要老师指导</label>
                4分
            </span>
            <span>
                <input type="radio" id="question13-5" name="question13"><label for="question13-5">上课老师不能及时关注上机进度，也不能解决学员问题</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十四、你感觉老师是否对班级很有耐心和责任心？&nbsp;(10分)</dt>
    <dd>
            <span>
                <input type="radio" id="question14-1" name="question14"><label for="question14-1">有耐心，有责任心</label>
                10分
            </span>
            <span>
                <input type="radio" id="question14-2" name="question14"><label for="question14-2">有责任心，但需要加强耐心 </label>
                8分
            </span>
            <span>
                <input type="radio" id="question14-3" name="question14"><label for="question14-3">有耐心，但缺乏责任心</label>
                6分
            </span>
            <span>
                <input type="radio" id="question14-4" name="question14"><label for="question14-4">我一般不和老师沟通。所以不清楚</label>
                4分
            </span>
            <span>
                <input type="radio" id="question14-5" name="question14"><label for="question14-5">没有耐心，也没有责任心</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十五、通过学习，你对所学的这门课程是否感兴趣？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question15-1" name="question15"><label for="question15-1">很喜欢这个老师，对课程也很有有兴趣 </label>
                5分
            </span>
            <span>
                <input type="radio" id="question15-2" name="question15"><label for="question15-2">很喜欢这个老师，对课程有一点兴趣</label>
                3分
            </span>
            <span>
                <input type="radio" id="question15-3" name="question15"><label for="question15-3">很喜欢这个老师，对课程没有兴趣 </label>
                2分
            </span>
            <span>
                <input type="radio" id="question15-4" name="question15"><label for="question15-4">不喜欢这个老师，对课程有兴趣</label>
                1分
            </span>
            <span>
                <input type="radio" id="question15-5" name="question15"><label for="question15-5">不喜欢这个老师，对课程也没有兴趣 </label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十六、你是否能跟上老师授课进度，并及时完成作业？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question16-1" name="question16"><label for="question16-1">能跟上老师的授课进度，并能完成作业</label>
                5分
            </span>
            <span>
                <input type="radio" id="question16-2" name="question16"><label for="question16-2">能跟上老师的授课进度，但不能及时完成老师作业 </label>
                3分
            </span>
            <span>
                <input type="radio" id="question16-3" name="question16"><label for="question16-3">不能跟上老师的授课进度，也不能完成老师作业</label>
                0分
            </span>
    </dd>
  </dl>
  <dl>
    <dt>十七、每天的学习是否有明确学习目标，和上机任务？&nbsp;(5分)</dt>
    <dd>
            <span>
                <input type="radio" id="question17-1" name="question17"><label for="question17-1">有明确的学习目标和上机任务</label>
                5分
            </span>
            <span>
                <input type="radio" id="question17-2" name="question17"><label for="question17-2">有明确的学习目标，但是没有上机任务</label>
                3分
            </span>
            <span>
                <input type="radio" id="question17-3" name="question17"><label for="question17-3">目标不是很明确，能跟着老师做</label>
                1分
            </span>
            <span>
                <input type="radio" id="question17-4" name="question17"><label for="question17-4">没有明确的学习目标</label>
                0分
            </span>
    </dd>
  </dl>--%>
 <%-- <dl>
    <dt>十八、你对老师授课方式有什么意见，建议或疑惑？</dt>
    <dd>
      <textarea name="" id="textarea" cols="30" rows="10"></textarea>
    </dd>
  </dl>--%>
</div>
<input type="submit" value="提交问卷" id="submit">
<script src="/js/jquery-3.0.0.js"></script>
<script>
  $(function () {
    $("dd span:first-child input").each(function () {
      this.checked = true;
    });
    $("#submit").click(function () {
      var text = $("#textarea").val().replace(/\s+/g,"");
      if($("#select").val() == " ")  {
        alert("还没选择老师！！！")
      } else if(text == "" || text == null){
        alert("没有什么对老师想说的吗？")
      }
    })
  })
</script>
</body>
</html>
