<%--
  Created by IntelliJ IDEA.
  User: ChenLongshun
  Date: 2018-02-04
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0" charset="utf-8">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <title>用户欢迎界面</title>
</head>
<body>
    <%--<h1>Welcome ,<c:out value="${user.userName}" /></h1>--%>
    <%--<H2>    欢迎,<c:out value="${user.userName}" /></H2>--%>
    <%--请选择要使用的功能：<a href="vireReport">记录查看</a>--%>
    <nav class="navbar navbar-default" role="navigation">
        <div class="text-center">
            <h3>Welcome ,<c:out value="${user.userName}" /></h3>
        </div>
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">功能选择</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="/report?userName=longshun" class="dropdown-toggle" data-toggle="dropdown">
                            向下下拉菜单
                            <b class="caret"></b>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="reportContainer col-md-6 col-md-offset-3" >
        <table class="table table-hover">
            <caption>周报</caption>
            <thead>
            <th>工作类型</th>
            <th>姓名</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>任务描述</th>
            <th>工作时间（人时）</th>
            </thead>
        </table>
    </div>
</body>
</html>
