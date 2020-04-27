<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>办公管理系统-菜单管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="Cache-Control" content="no-cache, must-revalidate"/>
    <meta name="Keywords" content="keyword1,keyword2,keyword3"/>
    <meta name="Description" content="网页信息的描述"/>
    <meta name="Copyright" content="All Rights Reserved."/>
    <link rel="stylesheet" href="${ctx}/resources/easyUI/easyui.css">
    <script type="text/javascript" src="${ctx}/resources/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/jquery/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/dtree/dtree.css"/>
    <script type="text/javascript" src="${ctx}/resources/dtree/dtree.js"></script>
    <script type="text/javascript">

        $(function () {
            d = new dTree('d', "${ctx}/");
            d.add(0, -1, '系統');
            d.add("1", 0, '全部', "${ctx}/identity/module/moduleLoad.action", this.name, "rightFrame");

            $.ajax({
                type: "post",
                data: "json",
                url: "${ctx}/identity/module/ModuleAjax",
                async: false,
                success: function (arr) {

                    $.each(arr, function () {

                            d.add(this.code, this.vcode, this.name, "${ctx}/identity/module/moduleLoad.action?code=" + this.code, this.name, "rightFrame");



                    })

                },
                error: function () {
                    alert("模快加載異常")
                }
            })
            $("#tree").html(d.toString());
        })

    </script>
</head>
<body class="easyui-layout" style="width:100%;height:100%;">
<div id="tree" data-options="region:'west'" title="菜单模块树" style="width:20%;padding:10px">
    <!-- 展示所有的模块树  -->

</div>

<div data-options="region:'center'" title="模块菜单">
    <!-- 展示当前模块下的子模块  -->
    <iframe src="${ctx}/identity/module/moduleLoad.action" frameborder="0" id="sonModules" name="rightFrame"
            width="100%"
            height="100%"></iframe>
</div>
</body>
</html>
