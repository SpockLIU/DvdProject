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
  <s:form action="modify_Dvd">
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
		<s:iterator value="dvds" status="ind">
  		<tr>
  			<s:set name="index" value="%{#ind.index}" />
  			<td><s:textfield name="dvds[%{index}].dvdId" value="%{dvdId}" readonly="true" theme="simple"></s:textfield></td>
  			<td><s:textfield name="dvds[%{index}].dvdName" value="%{dvdName}" theme="simple" /></td>
  			<td><s:textfield name="dvds[%{index}].dvdPrice" value="%{dvdPrice}" theme="simple" /></td>
  			<td><s:textfield name="dvds[%{index}].dvdStatus" value="%{dvdStatus}" readonly="true" theme="simple" /></td>
  			<td><s:select name="dvds[%{index}].dvdType" list="#{1:'爱情',2:'喜剧',3:'剧情',4:'动作'}" listkey="key" listValue="value" value="%{dvdType}" theme="simple" /></td>
  			<td><s:textfield name="dvds[%{index}].dvdRentTime" value="%{dvdRentTime}" readonly="true" theme="simple" /></td>
  			<td><s:textfield name="dvds[%{index}].dvdRentPrice" value="%{dvdRentPrice}" theme="simple"></s:textfield></td> 
  			<%-- <td><s:property value="dvdId"/></td>
  			<td><s:property value="dvdName"/></td>
  			<td><s:property value="dvdPrice"/></td>
  			<td><s:property value="dvdStatus"/></td>
  			<td><s:property value="dvdType"/></td>
  			<td><s:property value="dvdRentTime"/></td>
  			<td><s:property value="dvdRentPrice"/></td> --%>
  		</tr>
  	</s:iterator>
  	<tr>
  	</tr>
  </table>
  <s:submit value="修改" />
  </s:form>
    <s:debug></s:debug>
  </body>
</html>
