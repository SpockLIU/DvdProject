<%--
  Created by IntelliJ IDEA.
  User: Spock
  Date: 8/21/2016
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
登录成功<br/>
欢迎您 ：<s:property value="#session.user.userName"/>

<s:debug></s:debug>

</body>
</html>
