<%--
  Created by IntelliJ IDEA.
  User: SEC
  Date: 2022-09-25
  Time: 오전 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="resources/css/join.css" rel="stylesheet" type="text/css">
    <script src="https://kit.fontawesome.com/37439a23d9.js" crossorigin="anonymous"></script>
    <title>회원가입</title>
</head>
<body>
    <div>
        <i class="fa-solid fa-chevron-left"></i>
        <nav class="navbar">
            <div>Z&V</div>
        </nav>
        <div class="mainBox">
            <form method="post" class="formStyle">
                <h3>회원가입</h3>
                <div>
                    <input class="inputSize" type="text" name="userID" placeholder="아이디" maxlength="20" >
                </div>
                <div>
                    <input class="inputSize" type="password" name="userPW" placeholder="비밀번호" maxlength="20">
                </div>
                <div>
                    <input class="inputSize" type="text" name="userName" placeholder="이름" maxlength="20">
                </div>
                <div>
                    <input class="inputSize" type="email" name="userEmail" placeholder="이메일" maxlength="20">
                </div>
                <input class="finishBtn" type="submit" value="가입하기">
            </form>
        </div>
    </div>
</body>
</html>
