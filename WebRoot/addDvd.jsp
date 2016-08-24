<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加DVD页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script language="Javascript" src="js/jquery-1.7.2.js" type="text/javascript"></script>
	<script type="text/javascript">
		function addRow(){
			var root=$("#table");
			var allRows=$("#table tr");
			var cRow=$("#table tr:eq(1)").clone();
			root.append(cRow);
			var lRow = $("#table tr:last input");
			var len = allRows.length - 1;
			lRow.attr("value","");
			$("#table tr:last .name").attr("name","dvds[" + len + "]\.dvdName");
			$("#table tr:last .price").attr("name","dvds[" + len + "]\.dvdPrice");
			$("#table tr:last .type").attr("name","dvds[" + len + "]\.dvdType");
			$("#table tr:last .rentPrice").attr("name","dvds[" + len + "]\.dvdRentPrice");
		}
		
		function removeRow(){
			$("#table tr:last").remove();
		}
	</script>
	
	<style type="text/css">
		.main{
			width:600px;
		}
	</style>

  </head>
  
  <body>
  	<div class="main">
  		<s:form action="add_Dvd">
  			<input type="button" name="button" id="addButton" value="增加一行" onclick="addRow();" />
  			<input type="button" name="button" id="delButton" value="删除最后一行" onclick="removeRow()" />
  			<table id="table">
  				<tr>
  					<td>DVD名字</td>
  					<td>DVD价格</td>
  					<td>DVD类型</td>
  					<td>租金</td>
  				</tr>
  				<tr>
  					<td><s:textfield class="name" name="dvds[0].dvdName" theme="simple"/></td>
  					<td><s:textfield class="price" name="dvds[0].dvdPrice" theme="simple"/></td>
  					<td><s:select class="type" name="dvds[0].dvdType"  list="#{1:'爱情',2:'喜剧',3:'剧情',4:'动作'}" listkey="key" listValue="value" theme="simple"/>
  					<td><s:textfield class="rentPrice" name="dvds[0].dvdRentPrice" theme="simple"/>
  				</tr>
  				
  			</table>
  			<s:submit value="增加" />
  			
  		</s:form>
  		
  	</div>
  </body>
</html>
