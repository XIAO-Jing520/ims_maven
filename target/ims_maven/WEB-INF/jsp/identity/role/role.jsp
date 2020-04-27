<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<%@taglib prefix="zx" uri="/MyPager-tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>OA办公管理系统-角色管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>
    <%--	<link href="${ctx}/fkjava.ico" rel="shortcut icon" type="image/x-icon" />--%>
    <link rel="stylesheet"
          href="${ctx}/resources/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/css/demo.css">
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <link rel="stylesheet" href="${ctx}/resources/css/pager.css"/>
    <!-- 导入bootStrap的库 -->
    <script type="text/javascript"
            src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${ctx}/resources/easyUI/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        //添加角色
        function addUser() {

            $("#divDialog").dialog({
                title: "添加用户", // 标题
                cls: "easyui-dialog", // class
                width: 800, // 宽度
                height: 300, // 高度
                maximizable: true, // 最大化
                minimizable: false, // 最小化
                collapsible: true, // 可伸缩
                modal: true, // 模态窗口
                onClose: function () { // 关闭窗口
                    //重新进行用户分页查询
                    window.location = "${ctx}/identity/role/selectRole";
                }
            });

            //加载添加用户页面
            $("#iframe").prop("src", "${ctx}/identity/role/addRole");
        }


        //修改角色
        function updateRole(id) {

            $("#divDialog").dialog({
                title: "添加用户", // 标题
                cls: "easyui-dialog", // class
                width: 800, // 宽度
                height: 300, // 高度
                maximizable: true, // 最大化
                minimizable: false, // 最小化
                collapsible: true, // 可伸缩
                modal: true, // 模态窗口
                onClose: function () { // 关闭窗口
                    //重新进行用户分页查询
                    window.location = "${ctx}/identity/role/selectRole";
                }
            });

            //加载添加用户页面
            $("#iframe").prop("src", "${ctx}/identity/role/updateRole?id=" + id);
        }

        $(function () {
            //删除角色
            $("#deleteRole").click(function () {
                var boxes = $("[name='box']:checked");
                if (boxes.length == 0) {
                    $.messager.alert("提是信息", "请选择要删除的角色", "warning")
                } else {
                    $.messager.confirm('提示信息', '是否删除', function x(r) {
                            if (r) {
                                var arr = new Array()
                                $.each(boxes, function () {
                                    arr.push(this.value);
                                })
                                alert(arr.toString())
                                window.location = "${ctx}/identity/role/deleteRole.action?roleIds=" + arr;
                            }

                        }
                    )
                }

            });
        })


        //行背景色，以及复选框的实现
        window.onload = function () {

            $("#checkAll").click(function () {
                $("[name='box']").prop("checked", this.checked);
                $("[id^=dataTr_]").css({"backgroundColor": this.checked ? "#49e2b6" : ""});
            });
            $("[name='box']").click(function (event) {
                event.stopPropagation();
                var len = $("[name='box']").length;
                var boxes = $("[name='box']:checked").length;
                $("#checkAll").prop("checked", boxes == len)
            });


            $("[id^=dataTr_]").mouseover(function () {
                $(this).css({"backgroundColor": "#49e2b6", "cursor": "pointer"});
            }).mouseout(function () {
                var trid = this.id;
                var boxid = trid.replace("dataTr", "box");
                var flag = $("#" + boxid).prop("checked");
                if (!flag) {
                    $(this).css({"backgroundColor": ""});
                }


            }).click(function () {
                var trid = this.id
                var boxid = trid.replace("dataTr", "box")
                $("#" + boxid).prop("checked", !$("#" + boxid).prop("checked"))
            })


        }


    </script>
</head>
<body style="overflow: hidden;width: 100%;height: 100%;padding: 5px;">
<div>
    <div class="panel panel-primary">
        <!-- 工具按钮区 -->
        <div style="padding-top: 4px;padding-bottom: 4px;">
            <a id="addRole" href="javascript:addUser()" class="btn btn-success"><span
                    class="glyphicon glyphicon-plus"></span>&nbsp;添加</a>
            <a id="deleteRole" class="btn btn-danger"><span
                    class="glyphicon glyphicon-remove"></span>&nbsp;删除</a>
        </div>

        <div class="panel-body">
            <table class="table table-bordered" style="float: right;">
                <thead>
                <tr>
                    <th style="text-align: center;"><input type="checkbox" id="checkAll"/></th>
                    <th style="text-align: center;">名称</th>
                    <th style="text-align: center;">备注</th>
                    <th style="text-align: center;">操作</th>
                    <th style="text-align: center;">创建日期</th>
                    <th style="text-align: center;">创建人</th>
                    <th style="text-align: center;">修改日期</th>
                    <th style="text-align: center;">修改人</th>
                    <th style="text-align: center;">操作</th>
                </tr>
                </thead>
                <c:forEach items="${roles}" var="role" varStatus="stat">
                    <tr align="center" id="dataTr_${stat.index}">
                        <td><input type="checkbox" name="box" id="box_${stat.index}" value="${role.id}"/></td>
                        <td>${role.name}</td>
                        <td>${role.remark}</td>
                        <td><span class="label label-success"><a
                                href="${ctx}/identity/role/selectRoleUser?id=${role.id}"
                                style="color: white;">绑定用户</a></span>&nbsp;
                            <span class="label label-info"><a
                                    href="${ctx}/identity/role/mgrPopedom?id=${role.id}"
                                    style="color: white;">绑定操作</a></span>
                        </td>
                        <td><fmt:formatDate value="${role.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>${role.creater.name}</td>
                        <td><fmt:formatDate value="${role.modifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>${role.modifier.name}</td>
                        <td><span class="label label-info"><a href="javascript:updateRole('${role.id}')">修改</a></span>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <!-- 分页标签区 -->
            <zx:pager pageIndex="${pageModel.pageIndex}" pageSize="${pageModel.pageSize}"
                      totalNum="${pageModel.recordCount}"
                      submitUrl="${ctx}/identity/role/selectRole?pageIndex={0}"
                      pageStyle="manu"/>
        </div>

    </div>
</div>
<!-- div作为弹出窗口 -->
<div id="divDialog" style="overflow: hidden;">
    <%--    <iframe id="iframe" scrolling="no" frameborder="0" width="100%" height="100%" style="display:none;"></iframe>--%>
    <iframe id="iframe" frameborder="0" style="width: 100%;height: 100%;"></iframe>
</div>

</body>
</html>