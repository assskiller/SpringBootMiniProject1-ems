<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems/css/my.css" />
    <title>Title</title>
</head>
<body>
<div class = "empTable">
    <h1 style="text-align: center">员工信息</h1>
    <table class="table table-striped">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>salary</td>
            <td>age</td>
        </tr>
        <c:forEach items="${requestScope.empList}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.age}</td>
            </tr>
        </c:forEach>


    </table>
</div>
</body>
</html>