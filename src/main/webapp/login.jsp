<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="false" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>办公软件</title>
    <link href="${ctx}/resources/css/login.css" rel="stylesheet">
    <link href="${ctx}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/resources/easyUI/easyui.css">
    <script type="text/javascript" src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/easyui-lang-zh_CN.js"></script>


    <script type="text/javascript">
        $(function () {

            $("#vimg").css("cursor", "pointer").click(function () {
                $("#vimg").prop("src", "${ctx}/createCode?data=" + Math.random())
            })
            $("#login_id").click(function () {

                var userId = $("#userId").val();
                var password = $("#passWord").val();
                var code = $("#vcode").val();
                if (!/^[a-z0-9]{5,12}$/.test(userId)) {
                    $.messager.alert('My Title','账号不合法','warning');
                } else if (!/^[a-z0-9]{5,12}$/.test(password)) {
                    $.messager.alert("密码不合法")
                } else if (!/^[0-9]{4}$/.test(code)) {
                    $.messager.alert("验证码不合法")
                } else {
                    var data = $("#loginForm").serialize();
                    $.ajax({
                        type: "POST",
                        url: "${ctx}/login",
                        data: data,
                        dataType: "text",
                        success: function (result) {
                            if (result) {
                               alert(result)
                            }
                            else  window.location = "${ctx}/main.action";
                        },
                        error: function () {

                            alert("登陆失败")

                        }
                    });
                }
            })
        })
    </script>
</head>
<body>
<div class="login-hd">
    <div class="left-bg"></div>
    <div class="right-bg"></div>
    <div class="hd-inner">
        <span class="logo"></span>
        <span class="split"></span>
        <span class="sys-name">智能办公平台</span>
    </div>
</div>
<div class="login-bd">
    <div class="bd-inner">
        <div class="inner-wrap">
            <div class="lg-zone">
                <div class="lg-box">
                    <div class="panel-heading" style="background-color: #11a9e2;">
                        <h3 class="panel-title" style="color: #FFFFFF;font-style: italic;">用户登陆</h3>
                    </div>
                    <form id="loginForm">
                        <div class="form-horizontal"
                             style="padding-top: 20px;padding-bottom: 30px; padding-left: 20px;">

                            <div class="form-group" style="padding: 5px;">
                                <div class="col-md-11">
                                    <input class="form-control" id="userId" name="userId" type="text"
                                           placeholder="账号/邮箱">
                                </div>
                            </div>

                            <div class="form-group" style="padding: 5px;">
                                <div class="col-md-11">
                                    <input class="form-control" id="passWord" name="passWord" type="password"
                                           placeholder="请输入密码">
                                </div>
                            </div>

                            <div class="form-group" style="padding: 5px;">
                                <div class="col-md-11">
                                    <div class="input-group">
                                        <input class="form-control " id="vcode" name="vcode" type="text" maxlength="4"
                                               placeholder="验证码">
                                        <span class="input-group-addon" id="basic-addon2">
                                            <img class="check-code" id="vimg" alt="" src="${ctx}/createCode"></span>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="tips clearfix">
                            <label><input type="checkbox" checked="checked" name="rem">记住用户名</label>
                            <a href="javascript:;" class="register">忘记密码？</a>
                        </div>
                        <div class="enter">
                            <a href="javascript:;" id="login_id" class="purchaser">登录</a>
                            <a href="javascript:;" class="supplier" onClick="javascript:window.location='main.html'">重
                                置</a>
                        </div>
                    </form>
                </div>
            </div>
            <div class="lg-poster"></div>
        </div>
    </div>
</div>
<div class="login-ft">
    <div class="ft-inner">
        <div class="about-us">
            <a href="javascript:;">关于我们</a>
            <a href="javascript:;">法律声明</a>
            <a href="javascript:;">服务条款</a>
            <a href="javascript:;">联系方式</a>
        </div>
        <div class="address">
            地址：河南省焦作
            &nbsp;邮编：454550&nbsp;&nbsp;
            分享知识，传递希望&nbsp;版权所有
        </div>
        <div class="other-info">
            建议使用火狐、谷歌浏览器，不建议使用IE浏览器！
        </div>
    </div>
</div>
</body>
</html>
<script type="text/javascript">

</script>