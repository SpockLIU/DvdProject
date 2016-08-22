<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

  </head>
  
  <body>
  	<div>
  		<form action="add_Dvd" method="post">
  			<label>DVD名字：</label>
  			<input type="text" name="Dvd.dvdName"><br/>
  			<label>DVD价格：</label>
  			<input type="text" name="Dvd.dvdPrice"><br/>
  			<label>DVD类型：</label>
  			<select name="Dvd.dvdType">
  				<option value="1">爱情</option>
  				<option value="2">喜剧</option>
  				<option value="3">剧情</option>
  				<option value="4">动作</option>
  			</select>
  			<br/>
  			<label>租金：</label>
  			<input type="text" name="Dvd.dvdRentPrice">
  			<br/>
  			<input type="submit" value="增加">
  		</form>
  	</div>
  </body>
</html>
