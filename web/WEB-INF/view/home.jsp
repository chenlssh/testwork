<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0" charset="utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="shortcut icon" href="#"/>
    <title>登陆页面</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="/js/vuelidate/validators.min.js"></script>
    <script src="/js/vuelidate/vuelidate.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center">
                欢迎登陆/注册
            </h3>
            <form id="loginForm" role="form" method="post" action="/login" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="UserName" v-model="userName" name="UserName"/>
                        <p>{{userNameError}}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="passWord" v-model="passWord" name="passWord"/>
                        <p>{{passwordError}}</p>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button class="btn btn-default" v-on:click="login"> 登陆</button>
                        <button class="btn btn-default"><a href="/spitter/register">注册</a></button>
                        <p>{{loginError}}</p>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    const vue = new Vue({
        el: '#loginForm',
        data: {
            userName: null,
            userNameError: null,
            passWord: null,
            passwordError: null,
            loginError:null
        },
        validations: {
            userName: {

            }
        },
        methods: {
            login: function (e) {
                e.preventDefault();
                if (!this.userName) {
                    this.userNameError = "用户名不能为空";
                    return;
                }
                if (!this.passWord) {
                    this.passwordError = "密码不能为空";
                    return;
                }
                axios({
                    method: 'post',
                    url: '/login',
                    dataType : 'json',
                    headers:{
                        'Content-type': 'application/json;charset=utf-8'
                    },
                    data:{userName: this.userName, passWord: this.passWord}
                }).then(function (response) {
                    console.log(response);
                });
            }
        }
    })
</script>

</body>
</html>
