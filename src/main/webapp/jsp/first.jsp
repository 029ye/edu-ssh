<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/20 0020
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h1 class="text-center">用户列表</h1>
    <table class="table table-success table-striped table-hover">
        <thead>
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        </thead>

        <tbody>
        <s:forEach items="${users}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.age}</td>
            </tr>

        </s:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
