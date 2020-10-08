<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" deferredSyntaxAllowedAsLiteral="true" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%--    BoootStrap--%>
    <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body>
<div class="container-fluid">
    <table class="table table-bordered">
        <tr class="info">
            <td>学号</td>
            <td>姓名</td>
            <td>院系</td>
            <td>专业</td>

            <td>
                <button class="btn-info" name="Add" onclick="location.href='${pageContext.request.contextPath}/hello'">
                    添加
                </button>
            </td>
        </tr>
        <c:forEach items="${students}" var="user">
            <tr>
                <td>${user.studentId}</td>
                <td>${user.name}</td>
                <td>${user.department}</td>
                <td>${user.major}</td>
                <td>
                    <button class="btn-info" name="delete" onclick="location.href='${pageContext.request.contextPath}/api/v1/student/deleteUser?id=${user.studentId}'">删除</button>
                    <button class="btn-info" name="update" onclick="location.href='${pageContext.request.contextPath}/api/v1/student/updateUser?id=${user.studentId}'">修改</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<script src="/http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>