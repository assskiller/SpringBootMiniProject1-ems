<%@ page import="com.ljh.ems.entity.User" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>sprint boot项目测试jsp页面</title>
</head>
<body>
<div>
    <%= request.getSession().getAttribute("user") == null?
            "<a href='"+request.getContextPath()+"/ems/login.jsp'>请先登陆</a>"
            :
            "欢迎您,"+ request.getSession().getAttribute("user")+"</br><a href='"+request.getContextPath()+"/emp/findAll'>查看员工信息</a>"%>

</div>
</body>
</html>