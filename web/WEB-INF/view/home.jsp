<%--
   User: ChenLongshun
  Date: 2018-02-04
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h1>WelCome to CLS'SYSTEM</h1>
<form method="post" action="/login">
  用户名: <input type="text" name="userName" /> <br>
  密  码: <input type="text" name="passWord" /> <br>
  <input type="submit" value="登录" />
    <a href="/spitter/register">Register </a>
</form>
<%--<a href="/spittles">Spittles </a>--%>
</body>
</html>
