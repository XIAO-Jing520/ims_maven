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
    <link rel="stylesheet" href="${ctx }/resources/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/css/demo.css">
    <script type="text/javascript" src="${ctx }/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${ctx }/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <!-- 导入bootStrap的库 -->
    <script type="text/javascript" src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">

        $(function () {

            $("#checkAll").click(function () {
                $("[name='box']").prop("checked", this.checked);
                $("[id^=dataTr_]").css({"backgroundColor": this.checked ? "#eeecdd" : ""});
            });
            $("[name='box']").click(function (event) {


                event.stopPropagation();
                var len = $("[name='box']").length;
                var boxes = $("[name='box']:checked").length;
                $("#checkAll").prop("checked", boxes == len)
            });


            $("[id^=dataTr_]").mouseover(function () {
                $(this).css({"backgroundColor": "#eeecdd", "cursor": "pointer"});
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

            var boxes = $("[name='box']");
            var codes = "${selectCodes}";

            $.each(boxes, function () {
                if (codes.indexOf(this.value) != -1) {
                    $(this).prop("checked", true).trigger("mouseover");
                }
            })

            // 如果有提示就弹出来
            if ("${message}") {
                $.messager.show({
                    title: '操作提示',
                    msg: "<font color='black'>${message}</font>",
                    timeout: 2000,
                    showType: 'slide'
                });
            }


            $("#back").click(function () {
                parent.window.location = "${ctx}/identity/role/selectRole";
            });

            /** 绑定操作 */
            $("#bindPopedom").click(function () {
                var boxes = $("[name='box']:checked");
                if (boxes.length == 0) {
                    $.messager.alert("提示信息", "请选择要绑定的的权限", "warning")
                } else {
                    $.messager.confirm('提示信息', '是否绑定', function x(r) {
                            if (r) {
                                var arr = new Array()
                                $.each(boxes, function () {
                                    arr.push(this.value);
                                })
                                window.location = "${ctx}/identity/role/bindPopedom.action?moduleCodeName=${moduleCodeName}&moduleCode=${moduleCode}&id=${role.id}&name=${role.name}&arrCodes=" + arr;
                            }

                        }
                    )
                }

            });
        });


    </script>

</head>
<body style="overflow: hidden; width: 98%; height: 100%;">
<div>
    <div class="panel panel-primary">
        <!-- 工具按钮区 -->
        <div style="padding: 5px;">
            <a id="back" class="btn btn-primary"><span class="glyphicon glyphicon-hand-left"></span>&nbsp;返回</a>
            <a id="bindPopedom" class="btn btn-success"><span class="glyphicon glyphicon-copy"></span>&nbsp;绑定权限</a>
            <button type="button" disabled="disabled" class="btn btn-default">
                <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <span style="font-style: italic;">当前角色: ${role.name}</span>
            </button>
        </div>

        <div class="panel-heading" style="background-color: #11a9e2;">
            <h3 class="panel-title"><label style="color: white;font-size: 15px;"><span
                    class="glyphicon glyphicon-yen"></span>&nbsp;${moduleCodeName}</label></h3>
        </div>
        <div class="panel-body" id="table" style="overflow:scroll;overflow-x:hidden;">
            <table class="table table-bordered">
                <thead>
                <tr style="font-size: 12px;" align="center">
                    <th style="text-align: center;"><input type="checkbox" id="checkAll"/></th>
                    <th style="text-align: center;">编号</th>
                    <th style="text-align: center;">名称</th>
                    <!-- 							<th>备注</th> -->
                    <th style="text-align: center;">链接</th>
                    <th style="text-align: center;">创建日期</th>
                    <th style="text-align: center;">创建人</th>
                    <!-- 							<th>修改日期</th> -->
                    <th style="text-align: center;">修改人</th>
                </tr>
                </thead>
                <c:forEach items="${modules}" var="module" varStatus="stat">
                    <tr align="center" id="dataTr_${stat.index}">
                        <td><input type="checkbox" name="box" id="box_${stat.index}" value="${module.code}"/></td>
                        <td>${module.code}</td>
                        <td>${module.name.replaceAll("-","")}</td>
                            <%-- 							<td>${module.remark}</td> --%>
                        <td>${module.url}</td>
                        <td><fmt:formatDate value="${module.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>${module.creater.name }</td>
                            <%-- 							<td><fmt:formatDate value="${module.modifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
                        <td>${module.modifier.name }</td>
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
<div id="divDialog" style="display: none;">
    <!-- 放置一个添加用户的界面  -->
    <iframe id="iframe" frameborder="0" style="width: 100%;height: 100%;"></iframe>
</div>

</body>
</html>