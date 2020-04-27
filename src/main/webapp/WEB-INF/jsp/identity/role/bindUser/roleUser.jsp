<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<%@taglib prefix="zx" uri="/MyPager-tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>OA办公管理系统-用户管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>
    <link rel="stylesheet"
          href="${ctx}/resources/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <link rel="stylesheet" href="${ctx}/resources/css/pager.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/css/demo.css">
    <!-- 导入bootStrap的库 -->
    <script type="text/javascript" src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">

        function bindUser(id) {

            $("#divDialog").dialog({
                title: "添加用户", // 标题
                cls: "easyui-dialog", // class
                width: 800, // 宽度
                height: 800, // 高度
                maximizable: true, // 最大化
                minimizable: false, // 最小化
                collapsible: true, // 可伸缩
                modal: true, // 模态窗口
                onClose: function () { // 关闭窗口
                    //重新进行用户分页查询
                    window.location = "";
                }
            });

            //加载添加用户页面
            $("#iframe").prop("src", "${ctx}/identity/role/bindUser?id=" + id);
        }
        $(function () {

            if ("${message}") {
                $.messager.show({
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
            $("#unBindUser").click(function () {
                var boxes = $("[name='box']:checked")
                var arr = new Array()
                if (boxes.length == 0) {
                    $.messager.alert("提示信息", "请选择要解绑的用户", "warning")
                } else {
                    $.messager.confirm('提示信息', '是否添加', function a(r) {

                        if (r) {
                            $.each(boxes, function () {
                                arr.push(this.value)
                            })
                        }
                        window.location="${ctx}/identity/role/removeRoleBind.action?id=${id}&userIds=" + arr;
                    })
                }
            })
        })


    </script>
</head>
<body style="overflow: hidden; width: 98%; height: 100%;">
<!-- 工具按钮区 -->

<div class="panel panel-primary" style="padding-left: 5px;">
    <div style="padding-top: 4px;padding-bottom: 4px;">
        <a id="back" href="javascript:history.go(-1)" class="btn btn-primary"><span
                class="glyphicon glyphicon-hand-left"></span>&nbsp;返回</a>
        <a id="bindUser" href="javascript:bindUser('${id}')" class="btn btn-success"><span class="glyphicon glyphicon-copy"></span>&nbsp;绑定用户</a>
        <a id="unBindUser"  class="btn btn-danger"><span class="glyphicon glyphicon-paste"></span>&nbsp;解绑用户</a>


    </div>
    <div class="panel-heading" style="background-color: #11a9e2;">
        <h3 class="panel-title"><label style="color: white;font-size: 15px;"><span
                class="glyphicon glyphicon-user"></span>&nbsp;${role.name }</label></h3>
    </div>
    <div class="panel-body">
        <table class="table table-bordered">
            <thead>
            <tr style="font-size: 12px;" align="center">
                <th style="text-align: center;"><input id="checkAll" type="checkbox"/></th>
                <th style="text-align: center;">账户</th>
                <th style="text-align: center;">姓名</th>
                <th style="text-align: center;">性别</th>
                <th style="text-align: center;">部门</th>
                <th style="text-align: center;">职位</th>
                <th style="text-align: center;">手机号码</th>
                <th style="text-align: center;">邮箱</th>
                <th style="text-align: center;">审核人</th>
            </tr>
            </thead>
            <c:forEach items="${requestScope.users}" var="user"
                       varStatus="stat">
                <tr id="dataTr_${stat.index}" align="center">
                    <td><input type="checkbox" name="box" id="box_${stat.index}"
                               value="${user.userId}"/></td>
                    <td>${user.userId}</td>
                    <td>${user.name}</td>
                    <td>${user.sex == 1 ? '男' : '女' }</td>
                    <td>${ user.dept.name}</td>
                    <td>${ user.job.name}</td>
                    <td>${user.phone}</td>
                    <td>${user.email}</td>
                    <td>${user.checker.name}</td>
                </tr>
            </c:forEach>
        </table>
        <!-- 分页标签区 -->
        <zx:pager pageIndex="${pageModel.pageIndex}" pageSize="${pageModel.pageSize}"
                  totalNum="${pageModel.recordCount}"
                  submitUrl="${ctx}/identity/role/selectRoleUser?pageIndex={0}"
                  pageStyle="manu"/>
    </div>

</div>

<div id="divDialog" style="display: none;">
    <!-- 放置一个添加用户的界面  -->
    <iframe id="iframe" frameborder="0" style="width: 100%;height: 100%;"></iframe>
</div>

</body>
</html>