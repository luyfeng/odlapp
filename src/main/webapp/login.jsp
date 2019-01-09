<%--
  Created by IntelliJ IDEA.
  User: lu
  Date: 2018/12/27
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="css/loginbackground.css">
</head>

<%--<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>--%>
<%--<script type="text/javascript">--%>
    <%--//提交用户名和密码到服务器验证--%>
    <%--$("#button_submit").click(function () {--%>
        <%--var schoolnumber = $("#input_username");--%>
        <%--var password = $("#input_password");--%>
        <%--if (schoolnumber.val() != "" && password.val() != "") {--%>
            <%--$.ajax({--%>
                <%--url: "logincheck",--%>
                <%--type: "get",--%>
                <%--async: "true",--%>
                <%--contentType: "application/json",--%>
                <%--dataType: "json",--%>
                <%--data: {schoolnumber: schoolnumber.val(), password: $.md5(password.val())},--%>
                <%--success: function (data) {--%>
                    <%--console.log("login check success!")--%>
                    <%--if (data.result == "false") {--%>
                        <%--alert("密码错误!如有疑问请联系秘书部!");--%>
                        <%--schoolnumber.val("");--%>
                        <%--password.val("");--%>
                    <%--}else{--%>
                        <%--window.location.href="index.do";--%>
                    <%--}--%>
                <%--},--%>
                <%--error: function () {--%>
                    <%--console.log("login check error!")--%>
                <%--}--%>
            <%--});--%>
        <%--}--%>
    <%--});--%>

<%--</script>--%>

<body>

    <div class="page-container" >
        <h1>odlwebapp</h1>
        <h1>NetController</h1>
        <form method="post" action="/loginController">
            <%--<input type="hidden" name="method" value="login">--%>
            <label>用户名 </label>
            <input type="text" id="admin" name="admin" >
            <label>密码 </label>
            <input type="password" id="password" name="password" >
        <%--<button type="submit" id="button_submit" >登录</button>--%>
            <input type="submit" value="登录" name="submit">
        </form>
        <div >
            <p>odlapp</p>

        </div>
    </div>

    <div class="landscape"></div>
    <div class="filter"></div>
    <canvas id="canvas" ></canvas>

   <script src="js/loginbackground.js"></script>

</body>
</html>
