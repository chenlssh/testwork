<%--
   User: ChenLongshun
  Date: 2018-02-04
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta name="viewport" content="width=device-width,initial-scale=1.0" charset="utf-8">
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  <title>登陆页面</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h3 class="text-center">
        欢迎登陆/注册
      </h3>
      <form role="form" method="post" action="/login" class="form-horizontal">
        <div class="form-group">
          <label class="col-sm-2 control-label">用户名</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="userName" name="userName"/>
          </div>
        </div>
        <div class="form-group">
          <label class="col-sm-2 control-label">密码</label>
          <div class="col-sm-10">
            <input type="password" class="form-control" id="passWord" name="passWord" />
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登陆</button>
            <button class="btn btn-default"><a href="/spitter/register">注册</a></button>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
