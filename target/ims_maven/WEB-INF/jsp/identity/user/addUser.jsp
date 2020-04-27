<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>办公管理系统-添加用户</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="Cache-Control" content="no-cache, must-revalidate"/>
    <meta name="Keywords" content="keyword1,keyword2,keyword3"/>
    <meta name="Description" content="网页信息的描述"/>
    <meta name="Author" content="fkjava.org"/>
    <meta name="Copyright" content="All Rights Reserved."/>
    <link href="${ctx}/fkjava.ico" rel="shortcut icon" type="image/x-icon"/>
    <link rel="stylesheet"
          href="${ctx}/resources/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <!-- 导入bootStrap的库 -->
    <script type="text/javascript"
            src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/easyUI/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="${ctx}/resources/easyUI/easyui.css">
    <script type="text/javascript">
        $(function () {

            if ("${message}") {
                parent.$.messager.show({
                    title: '提示信息',
                    msg: "<font color='#2b66a5'>${message}</font>",
                    showType: 'show',
                    style: {
                        right: '',
                        left: 0,
                        top: document.body.scrollTop + document.documentElement.scrollTop,
                        bottom: ''
                    }
                });
            }
            /**  添加用户，提交表单函数 */
            $("#btn_submit").click(function () {
                // 对表单中所有字段做校验
                var userId = $("#userId");
                var name = $("#name");
                var passWord = $("#password");
                var repwd = $("#repwd");
                var email = $("#email");
                var tel = $("#tel");
                var phone = $("#phone");
                var qqNum = $("#qqNum");
                var answer = $("#answer");
                var msg = "";
                if ($.trim(userId.val()) == "") {
                    msg += "用户登录名不能为空!";
                    userId.focus();
                } else if (!/^\w{5,20}$/.test(userId.val())) {
                    msg += "用户登录名长度必须在5-20之间!";
                    userId.focus();
                } else if ($.trim(name.val()) == "") {
                    msg += "姓名不能为空!";
                    name.focus();
                } else if ($.trim(passWord.val()) == "") {
                    msg += "密码不能为空!";
                    passWord.focus();
                } else if (!/^\w{6,20}$/.test(passWord.val())) {
                    msg += "密码长度必须为6-20之间!";
                    passWord.focus();
                } else if (repwd.val() != passWord.val()) {
                    msg += "两次输入的密码不一致!";
                    repwd.focus();
                } else if ($.trim(email.val()) == "") {
                    msg += "邮箱不能为空!";
                    email.focus();
                } else if (!/^\w+@\w{2,}\.\w{2,}$/.test(email.val())) {
                    msg += "邮箱格式不正确!";
                    email.focus();
                } else if ($.trim(tel.val()) == "") {
                    msg += "电话号码不能为空!";
                    tel.focus();
                    // 020-38216920 02034432323  0755
                } else if (!/^0\d{2,3}-?\d{7,8}$/.test(tel.val())) {
                    msg += "电话号码格式不正确!";
                    tel.focus();
                } else if ($.trim(phone.val()) == "") {
                    msg += "手机号码不能为空!";
                    phone.focus();
                } else if (!/^1[3|4|5|8]\d{9}$/.test(phone.val())) {
                    msg += "手机号码格式不正确!";
                    phone.focus();
                } else if ($.trim(qqNum.val()) == "") {
                    msg += "QQ号码不能为空!";
                    qqNum.focus();
                } else if (!/^\d{5,12}$/.test(qqNum.val())) {
                    msg += "QQ号码长度必须在5-12之间!";
                    qqNum.focus();
                } else if ($.trim(answer.val()) == "") {
                    msg += "密保问题不能为空!";
                    answer.focus();
                }
                if (msg) {
                    $.messager.alert("提示信息", msg, "warning")
                } else {
                    $("#addUserForm").submit();
                }


            });
        });

        function selAjax(value) {
            // alert("静静"+value)
            $.ajax({
                type: "POST",
                url: "${ctx}/identity/selAjaxId",
                data: "id=" + value,
                dataType: "text",
                success: function (result) {
                    if (result) {

                        parent.$.messager.show({
                            title: '提示信息',
                            msg: "<font color='#2b66a5'>账号已存在哦</font>",
                            showType: 'show',
                            style: {
                                right: '',
                                left: 0,
                                top: document.body.scrollTop + document.documentElement.scrollTop,
                                bottom: ''
                            }
                        });
                        $("#userId").val("")
                        $("#userId").focus();
                    }
                },
                error: function () {
                    alert("失败")
                }
            });
        }


    </script>
</head>
<body style="background: #F5FAFA;">
<center>
    <form id="addUserForm" action="${ctx}/identity/user/addUser"
          method="post">
        <table class="table-condensed">
            <tbody>
            <tr>
                <td>登陆名称:</td>
                <td><input type="text" id="userId" name="userId" onblur="selAjax(value)"
                           value="${user.name}" class="form-control" placeholder="请输入您的登录名"></td>
                <td>用户姓名:</td>
                <td><input type="text" id="name" name="name"
                           value="${user.name}" class="form-control" placeholder="请输入您的电子邮件"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="text" id="password" name="passWord"
                           value="${user.name}" class="form-control" placeholder="请输入您的密码"></td>
                <td>确认密码:</td>
                <td><input type="text" id="repwd" name="repwd"
                           value="${user.name}" class="form-control" placeholder="请输入您的确认密码"></td>
            </tr>
            <tr>
                <td>性别:</td>
                <td><select name="sex" id="sex" class="btn btn-default">
                    <option value="1">男</option>
                    <option value="2">女</option>
                </select></td>
                <td>部门:</td>
                <td><select id="deptSelect" name="dept.id" class="btn btn-default" id="deptSelect" name="dept.id">
                    <option value="1">技术部</option>
                    <option value="2">运营部</option>
                    <option value="3">财务部</option>
                    <option value="4">人事部</option>
                    <option value="5">总办公</option>

                </select>
                </td>
            </tr>
            <tr>
                <td>职位:</td>
                <td><select id="jobSelect" name="job.code"
                            class="btn btn-default" id="jobSelect" name="job.code">
                    <option value="0001">职员</option>
                    <option value="0002">java初级开发工程师</option>
                    <option value="0003">java中级开发工程师</option>
                    <option value="0004">java高级开发工程师</option>
                    <option value="0005">系统管理员</option>
                    <option value="0006">架构师</option>
                    <option value="0007">主管</option>
                    <option value="0008">经理</option>
                    <option value="0009">总经理</option>
                </select>
                </td>
                <td>邮箱:</td>
                <td><input id="email" name="email" type="text"
                           value="${user.email}" class="form-control"
                           placeholder="请输入您的电子邮件"></td>
            </tr>

            <tr>
                <td>电话:</td>
                <td><input id="tel" name="tel" type="text"
                           value="${user.tel}" class="form-control" placeholder="请输入您的电话">
                </td>
                <td>手机:</td>
                <td><input id="phone" name="phone" type="text"
                           value="${user.phone}" class="form-control" placeholder="请输入您的手机">

                </td>
            </tr>

            <tr>
                <td>问题:</td>
                <td><select name="question" class="btn btn-default"
                            id="question">
                    <option value="1">您的生日</option>
                    <option value="2">您的出生地</option>
                    <option value="3">您母亲的名字</option>
                </select></td>
                <td>答案:</td>
                <td><input id="answer" name="answer" value="${user.answer}"
                           type="text" class="form-control" placeholder="请输入您的答案"></td>
            </tr>
            <tr>
                <td>qq号码:</td>
                <td><input id="qqNum" name="qqNum" value="${user.qqNum}"
                           type="text" class="form-control" placeholder="请输入您的qq号码">
                </td>
            </tr>

            </tbody>
        </table>
        <div align="center" style="margin-top: 20px;">
            <a id="btn_submit" class="btn btn-info"><span
                    class="glyphicon glyphicon-plus"></span>&nbsp;添加</a>
            <button type="reset" class="btn btn-danger">
                <span class="glyphicon glyphicon-remove"></span>&nbsp;重置
            </button>
        </div>
    </form>

</center>
</body>
</html>
