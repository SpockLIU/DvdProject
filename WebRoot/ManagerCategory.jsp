<%--
  Created by IntelliJ IDEA.
  User: Spock
  Date: 8/21/2016
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String context = request.getContextPath(); %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员操作分类界面</title>
    <style type="text/css">
    	.type{
    		list-style-type: none;
    	}
    </style>
</head>
<body>
<label>欢迎您：<s:property value="#session.manager.managerName" /> </label>
<ul class="type">
	<li><a href="<%=context %>/addDvd.jsp" target="target">添加DVD</a></li>
	<li><a href="<%=context %>/queryDvd.jsp" target="target">查看DVD</a></li>
	<li></li>
	<li></li>
</ul>

</body>
</html>
