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
    
    <title>My JSP 'DvdQuery.jsp' starting page</title>
    
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
  <s:form action="query_Dvd">
  	<s:textfield name="dvdDto.dvdIDs" label="DVD编号" />
  	<s:textfield name="dvdDto.dvdName" label="DVD名称" />
<!--   	<s:radio name="dvdDto.dvdStatus" label="DVD状态" list="#{0:'查看所有',1:'查看可租',2:'查看所有'}" listkey="key" listValue="value"></s:radio> -->
  	<s:radio name="dvdDto.dvdStatus" label="DVD状态" list="#{'':'查看所有',1:'查看可租',2:'查看已租'}"></s:radio>
  	<s:select name="dvdDto.dvdType"  label="DVD类型" list="#{'':'所有类型',1:'爱情',2:'喜剧',3:'剧情',4:'动作'}" listkey="key" listValue="value"/>
  	<s:submit value="查询" />
  </s:form>
  </body>
</html>
