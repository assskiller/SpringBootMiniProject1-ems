<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/my.css" />
    <title>Title</title>
</head>
<body>

<div class="loginForm">
    <h1 class="title">修改员工信息界面</h1>
    <form class="form-horizontal" action="${pageContext.request.contextPath}/emp/update">

        <input type="hidden" class="form-control" id="id" name="id" value="${requestScope.emp.id}">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">员工姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name" value="${requestScope.emp.name}">
            </div>
        </div>
        <div class="form-group">
            <label for="salary" class="col-sm-2 control-label">工资</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="salary" name="salary" value="${requestScope.emp.salary}">
            </div>
        </div>

        <div class="form-group">
            <label for="age" class="col-sm-2 control-label">年龄</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" name="age" value="${requestScope.emp.age}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">确认修改</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>