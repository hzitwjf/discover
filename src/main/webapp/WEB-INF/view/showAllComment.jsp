<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" href="/assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="/assets/css/app.css">
  <script src="/assets/js/jquery.min.js"></script>
</head>
<body>
<script src="/assets/js/theme.js"></script>
<div class="row-content am-cf">
  <div class="row">
  <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
    <div class="widget am-cf">
      <div class="widget-head am-cf">
        <div class="widget-title  am-cf">评论列表</div>


      </div>
      <div class="widget-body  am-fr">


        <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
          <div class="am-form-group tpl-table-list-select" style="width: 500px;">
            <span>学生对老师的建议</span>
            <span>
              <select data-am-selected="{btnSize: 'sm'}" name="teaName" id="select">
              <option value="未选择教师名字">-------------</option>
                <c:forEach items="${requestScope.teaName}" var="t">
                  <option value="${t.codPeople}" >${t.codPeople}</option>
                </c:forEach>
            </select>
            </span>
          </div>
        </div>
        <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
          <div class="am-form-group">
            <div class="am-btn-toolbar">
              <div class="am-btn-group am-btn-group-xs">
                <%--<button type="button" class="am-btn am-btn-default am-btn-success"><span class="am-icon-plus"></span> 新增
                </button>
                <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 保存
                </button>
                <button type="button" class="am-btn am-btn-default am-btn-warning"><span class="am-icon-archive"></span> 审核
                </button>
                <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除
                </button>--%>
              </div>
            </div>
          </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
          <form action="/doShowAllComment" method="post">
            <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                <input type="text" class="am-form-field "placeholder="根据老师名字查找评论信息" name="likeName" id="text">
                <span class="am-input-group-btn">
                <input type="submit" class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" value="查找">
               </span>
            </div>
          </form>
        </div>

        <div class="am-u-sm-12">
          <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
            <thead>
            <tr>
              <th>评论人</th>
              <th>被评论人</th>
              <th>评论时间</th>
              <th>评论的模块</th>
              <th>总得分</th>
              <th>评论来自的班级</th>
              <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.commentList}" var="c">
              <tr class="gradeX">
                <td>
                  <input type="hidden" value="${c.comId}">
                  ${c.comPeople}
                  <input type="hidden" value="${c.comuuId}">
                </td>
                <td>${c.codPeople}</td>
                <td>${c.comTime}</td>
                <td>${c.comModule}</td>
                <td>${c.comScore}</td>
                <td>${c.comClass}</td>
                <td>
                  <div class="tpl-table-black-operation">
                    <a href="/ShowAllTeacherSugesst?comUuid=${c.comuuId}">
                      <i class="am-icon-pencil"></i> 查看详情
                    </a>
                  </div>
                </td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
        <div class="am-u-lg-12 am-cf">
          <span style="color: #0e93d7;font-family: 微软雅黑;font-size: 20px">共${totalElements}条评论，合计${totalPages}页</span>
          <span style="margin-left: 310px;"><a href="javascript:history.go(-1)" class="am-btn am-btn-default am-btn-warning">返回</a></span>
          <c:if test="${totalPages!=0}">
          <div class="am-cf">
            <div class="am-fr">
              <ul class="am-pagination">
                <c:if test="${(currentPage-1)<0}">
                  <li class="am-disabled"><a href="/doShowAllComment?page=${currentPage-1}">«</a></li>
                </c:if>
                <c:if test="${(currentPage-1)>=0}">
                  <li><a href="/doShowAllComment?page=${currentPage-1}">«</a></li>
                </c:if>
                <c:forEach begin="0" end="${totalPages-1}" var="p">
                  <c:if test="${currentPage==p}">
                    <li class="am-active"><a href="/doShowAllComment?page=${p}">${p+1}</a></li>
                  </c:if>
                  <c:if test="${currentPage!=p}">
                    <li><a href="/doShowAllComment?page=${p}">${p+1}</a></li>
                  </c:if>
                </c:forEach>
                <c:if test="${currentPage<(totalPages-1)}">
                  <li><a href="/doShowAllComment?page=${currentPage+1}">»</a></li>
                </c:if>
                <c:if test="${currentPage>=(totalPages-1)}">
                  <li class="am-disabled"><a href="/doShowAllComment?page=${currentPage+1}">»</a></li>
                </c:if>
              </ul>
            </div>
            </c:if>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
</div>
<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/app.js"></script>
<script>
  $(function () {
    $("#select").change(function () {
      var name=$("#select").val();
        if(confirm("确定查看学生给"+name+"老师的建议吗？")){
            window.location="/OneComment?teaName="+name;
        }
    });
  });
</script>
</body>
</html>
