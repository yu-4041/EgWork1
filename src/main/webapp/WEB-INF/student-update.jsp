<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%--    BoootStrap--%>
    <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body>
<div class="container-fluid">
    <form class="form-horizontal" action="http://localhost/api/v1/student/updateUserById" method="post">
        <div class="control-group">
            <label class="control-label">学号</label>
            <div class="controls">
                <input type="text" id="inputId" placeholder="学号" name="studentId" value="${user.studentId}">
            </div>
        </div>



        <div class="control-group">
            <label class="control-label">姓名</label>
            <div class="controls">
                <input type="text" id="inputName" placeholder="姓名" name="name" value="${user.name}">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">院系</label>
            <div class="controls">
                <input type="text" id="inputDPM" placeholder="院系" name="department" value="${user.department}">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">专业</label>
            <div class="controls">
                <input type="text" id="inputMajor" placeholder="专业" name="major" value="${user.major}">
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button type="submit" class="btn" >Sign in</button>
            </div>
        </div>
    </form>

</div>

<script src="/http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>