<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>评价结果</title>
    <link rel="stylesheet" href="assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="/assets/css/app.css">
    <script src="/assets/js/jquery.min.js"></script>
</head>
<body data-type="widgets">
<script src="/assets/js/theme.js"></script>
    <!-- 内容区域 -->
        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">文章列表</div>


                        </div>
                        <div class="widget-body  am-fr">

                            <%--<div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-success"><span class="am-icon-plus"></span> 新增</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 保存</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning"><span class="am-icon-archive"></span> 审核</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除</button>
                                        </div>
                                    </div>
                                </div>
                            </div>--%>
                            <%--<div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <div class="am-form-group tpl-table-list-select">
                                    <select data-am-selected="{btnSize: 'sm'}">
                                        <option value="option1">所有类别</option>
                                        <option value="option2">IT业界</option>
                                        <option value="option3">数码产品</option>
                                        <option value="option3">笔记本电脑</option>
                                        <option value="option3">平板电脑</option>
                                        <option value="option3">只能手机</option>
                                        <option value="option3">超极本</option>
                                    </select>
                                </div>
                            </div>--%>
                            <%--<div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                    <input type="text" class="am-form-field ">
                                    <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" type="button"></button>
          </span>
                                </div>
                            </div>--%>

                            <div class="am-u-sm-12">
                                <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
                                    <thead>
                                    <tr>
                                        <th>问题名称</th>
                                        <th>对该问题提出的意见</th>
                                        <th>分数</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${sessionScope.answerVos}" var="a">
                                        <tr class="gradeX">
                                            <td><input type="hidden" name="proId" value="${a.proId}"> ${a.proContent}</td>
                                            <td><input type="hidden" name="ansContent" value="${a.ansContent}">${a.ansContent}</td>
                                            <td><input type="hidden" name="ansSc" value="${a.ansSc}">${a.ansSc}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                                <div style="width: 300px;margin-right: auto;margin-left: auto">
                                    <a href="addCommentAndDiscuss" class="am-btn am-btn-default am-btn-secondary">确认评价</a>
                                    <a href="/findAllProblemAndAnswer?hzitxx=6666${sessionScope.checkVo.checkModule}6666${sessionScope.checkVo.checkModule}&&proModule=??.com"
                                       class="am-btn am-btn-default am-btn-warning" style="">返回重新评论</a>
                                </div>
                            </div>
                            <%--<div class="am-u-lg-12 am-cf">

                                <div class="am-fr">
                                    <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
                                </div>
                            </div>--%>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/amazeui.datatables.min.js"></script>
<script src="/assets/js/dataTables.responsive.min.js"></script>
<script src="/assets/js/app.js"></script>

</body>
</html>
