<%--
  Created by IntelliJ IDEA.
  User: wyz
  Date: 2018/12/16
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>保存用户</title>
</head>
<body>
<form action="/user/saveUser" method="post">
   用户名: <input name="username" type="text"><br>
   密码: <input name="password" type="text"><br>
   昵称: <input name="nickname" type="text"><br>
   电话号码: <input name="phonenumber" type="text"><br>
   邮箱: <input name="email" type="text"><br>
   <input type="submit" value="提交">
</form>
</body>
</html>
