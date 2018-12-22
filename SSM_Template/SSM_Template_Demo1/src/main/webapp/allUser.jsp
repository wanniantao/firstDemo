<%--
  Created by IntelliJ IDEA.
  User: wyz
  Date: 2018/12/16
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
    <c:forEach items="${allUser}" var="user">
        ${user}<br>
    </c:forEach>
</body>
</html>
