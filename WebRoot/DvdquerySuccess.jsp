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
    
    <title>My JSP 'DvdquerySucess.jsp' starting page</title>
    
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
  <s:textfield name="test" value="%{dvds[1].dvdName}"/>
  <table>
  	<tr>
  			<td>DVD编号</td>
  			<td>DVD名字</td>
  			<td>DVD价格</td>
  			<td>DVD状态</td>
  			<td>DVD类型 </td>
  			<td>DVD租借次数</td>
  			<td>DVD租价</td>
  		</tr>
		<s:iterator value="dvds">
  		<tr>
  			<td><s:property value="dvdId"/></td>
  			<td><s:property value="dvdName"/></td>
  			<td><s:property value="dvdPrice"/></td>
  			<td><s:property value="dvdStatus"/></td>
  			<td><s:property value="dvdType"/></td>
  			<td><s:property value="dvdRentTime"/></td>
  			<td><s:property value="dvdRentPrice"/></td>
  		</tr>
  	</s:iterator>
  	<tr>
  	</tr>
  </table>
    <s:debug></s:debug>
  </body>
</html>
