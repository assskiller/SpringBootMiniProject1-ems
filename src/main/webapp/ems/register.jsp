<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/my.css" />
    <script src="js/jquery-3.4.1.min.js">
    </script>
    <script>
        window.onload = function () {
            var checkCode = document.getElementById("checkCode");
            checkCode.onclick = function () {
                this.src = "/ems/user/getCheckCodeImg?time="+new Date().getTime(); //needs to new all the time
            }
        }
    </script>
    <title>Title</title>
</head>
<body>

    <div class="loginForm">
        <h1 class="title">登陆界面</h1>
        <form class="form-horizontal" action="${pageContext.request.contextPath}/user/register">
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="username" name="username">
                </div>
            </div>
            <div class="form-group">
                <label for="realname" class="col-sm-2 control-label">真实姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="realname" name ="realname">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" name="password">
                </div>
            </div>

            <div class="form-group">
                <label  class="col-sm-2 control-label">性别</label>
                <label class="radio-inline">
                    <input type="radio" name="sex"  value="男"> 男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sex"  value="女"> 女
                </label>
            </div>

            <div class="form-group">
                <label  class="col-sm-2 control-label">验证码</label>
                <img src="/ems/user/getCheckCodeImg" id="checkCode">
                <div class="col-sm-10">
                    <input type="password" class="form-control"  name="checkCode">
                </div>
            </div>



            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Sign in</button>
                </div>
            </div>
        </form>
    </div>

</body>
</html>