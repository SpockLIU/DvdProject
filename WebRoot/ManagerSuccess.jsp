<%--
  Created by IntelliJ IDEA.
  User: Spock
  Date: 8/21/2016
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String context = request.getContextPath(); %>

<html>
<head>
    <title>管理员页面</title>
</head>
<frameset cols="15%,*" >
    <frame src="<%=context %>/ManagerCategory.jsp">
    <frame src="<%=context %>/ManagerBlank.jsp" name="target">
</frameset>
</html>
