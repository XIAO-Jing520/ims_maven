
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
<html>
<head>
	<meta charset="UTF-8">
	<title>Alert Messager - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/easyUI/css/demo.css">
	<script type="text/javascript" src="${ctx}/resources/easyUI/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/resources/easyUI/jquery.easyui.min.js"></script>

</head>
<body>
	<h2>Alert Messager</h2>
	<div class="demo-info">
		<div class="demo-tip icon-tip"></div>
		<div>Click on each button to display different alert message box.</div>
	</div>
	<h2>Message Box Position</h2>
	<div class="demo-info">
		<div class="demo-tip icon-tip"></div>
		<div>Click the buttons below to display message box on different position.</div>
	</div>
	<div style="margin:10px 0;">
		<p>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="topLeft();">TopLeft</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="topCenter()">TopCenter</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="topRight()">TopRight</a>
		</p>
		<p>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="centerLeft()">CenterLeft</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="center()">Center</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="centerRight()">CenterRight</a>
		</p>
		<p>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="bottomLeft()">BottomLeft</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="bottomCenter()">BottomCenter</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="bottomRight()">BottomRight</a>
		</p>
	</div>
	<script>

		function topLeft(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'show',
				style:{
					right:'',
					left:0,
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
		}
		function topCenter(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'slide',
				style:{
					right:'',
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
		}
		function topRight(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'show',
				style:{
					left:'',
					right:0,
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
		}
		function centerLeft(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'fade',
				style:{
					left:0,
					right:'',
					bottom:''
				}
			});
		}
		function center(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'fade',
				style:{
					right:'',
					bottom:''
				}
			});
		}
		function centerRight(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'fade',
				style:{
					left:'',
					right:0,
					bottom:''
				}
			});
		}
		function bottomLeft(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'show',
				style:{
					left:0,
					right:'',
					top:'',
					bottom:-document.body.scrollTop-document.documentElement.scrollTop
				}
			});
		}
		function bottomCenter(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'slide',
				style:{
					right:'',
					top:'',
					bottom:-document.body.scrollTop-document.documentElement.scrollTop
				}
			});
		}
		function bottomRight(){
			$.messager.show({
				title:'My Title',
				msg:'The message content',
				showType:'show'
			});
		}
	</script>


</body>
</html>