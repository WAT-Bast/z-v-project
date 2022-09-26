<%--
  Created by IntelliJ IDEA.
  User: lby99
  Date: 2022-09-24
  Time: 오후 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <script src="https://kit.fontawesome.com/5ef77fbbed.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/resources/css/login_css.css">
</head>
<body>

<div class="login_navbar_header">
    <div class="login_navbar_container">
        <div class="login_navbar_icon"><i class="fa-solid fa-chevron-left"></i></div>
        <a class="login_navbar_title">Z&V</a>
    </div>
</div>

    <div>
        <div class="login_container">
            <form method="post" class="formStyle">
                <h3>로그인</h3>
                <div class="login_id_box">
                    <input class="formControl" type="text" name="userID" placeholder="아이디" maxlength="20" >
                </div>
                <div>
                    <input class="formControl" type="password" name="userPW" placeholder="비밀번호" maxlength="20">
                </div>
                <div>
                <button class="sign_up_button" type="submit">회원가입</button>
                </div>
                <input type="submit" class="login_button" value="로그인하기">
            </form>
        </div>
    </div>
</body>
</html>
