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
    <script src="https://kit.fontawesome.com/16dd1d1568.js" crossorigin="anonymous"></script>
    <link href="resources/CSS/join.css" rel="stylesheet" type="text/css">
    <title></title>
</head>
<body>
<div>
    <div class="join_navbar">
        <div class="join_navbar_container">
            <div class="join_navbar_icon"><i class="fa-solid fa-chevron-left"></i></div>
            <a class="join_navbar_title">Z&V</a>
        </div>
    </div>
    <div class="mainBox">
        <form method="post" class="formStyle">
            <h3>회원가입</h3>
            <div class="test">
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
            <div class="animal_check">
                <label class="labelText">키우는 동물 : </label>
                <div class="animal_box">
                    <input type="checkbox" name="animal">강아지
                    <input type="checkbox" name="animal">고양이
                    <input type="checkbox" name="animal">햄스터
                    <input type="checkbox" name="animal">기타
                </div>
            </div>
            <hr>
            <div class="listBox_All">
                <label class="labelText">거주 지역</label>
                <select class="list_box" name="area" >
                    <option value="">서울</option>
                    <option value="">인천</option>
                    <option value="">대전</option>
                    <option value="">부산</option>
                </select>
            </div>
            <hr>
            <input class="finishBtn" type="submit" value="가입하기">
        </form>
    </div>
</div>
</body>
</html>