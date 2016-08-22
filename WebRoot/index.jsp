<%--
  Created by IntelliJ IDEA.
  User: Spock
  Date: 8/21/2016
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String context = request.getContextPath(); %>

<html>
  <head>
    <title>DVD管理主页</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js">

    </script>
    <style type="text/css">
      .ul{
        list-style-type: none;
      }

    </style>
  </head>
  <body>
  <ul class="ul">
    <button class="select">用户登录</button>
    <button class="select">管理员登录</button>
  </ul>
  <div class="login">
  <form method="post" action="<%=context %>/login/User_login" id="user">
    <label>用户名：</label>
    <input type="text" name="user.userName"/><br/>
    <label>密码：</label>
    <input type="password" name="user.userPassword"/><br/>
    <input type="submit" value="登录">
  </form>
    </div>
<%=context %>
  <div class="login">
  <form method="post" action="<%=context %>/login/Manager_login" id="manager">
    <label>用户名：</label>
    <input type="text" name="manager.managerName"/><br/>
    <label>密码：</label>
    <input type="password" name="manager.managerPassword"/><br/>
    <input type="submit" value="登录">
  </form>
    </div>
  </body>
</html>
