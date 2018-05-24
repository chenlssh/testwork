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
    <title>用户欢迎界面</title>
</head>
<body>
    <h1>Welcome Spittle</h1>
    欢迎<c:out value="${user.userName}" />
</body>
</html>
