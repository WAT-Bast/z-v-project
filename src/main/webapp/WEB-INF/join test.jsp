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
<script type="text/javascript">
    function checkJoin() {
        if(document.joinForm.user_ID.value == "") {
            alert("아이디를 입력해주세요.");
            document.joinForm.user_ID.focus();
            return false;
        } else if(document.joinForm.user_name.value == ""){
            alert("이름을 입력해주세요.");
            document.joinForm.user_name.focus();
            return false;
        } else if(document.joinForm.user_PW.value == ""){
            alert("비밀번호를 입력해주세요.");
            document.joinForm.user_PW.focus();
            return false;
        }else if(document.joinForm.user_email.value == ""){
            alert("이메일을 입력해주세요.");
            document.joinForm.user_email.focus();
            return false;
        }
        checkJoin.submit();
    }

</script>
<body>
<div>
    <div class="join_navbar">
        <div class="join_navbar_container">
            <div class="join_navbar_icon"><i class="fa-solid fa-chevron-left"></i></div>
            <a class="join_navbar_title">Z&V</a>
        </div>
    </div>


    <div class="mainBox">
        <form method="post" class="formStyle" name="joinForm">
            <h3>회원가입</h3>
            <div class="idBox">
                <input class="inputSize" type="text" name="user_ID" placeholder="아이디" maxlength="20" >
                <div>
                <input class="idCheckBtn" type="submit" value="중복확인">
                </div>
            </div>
            <div>
                <input class="inputSize_1" type="password" name="user_PW" placeholder="비밀번호" maxlength="20">
            </div>
            <div>
                <input class="inputSize_1" type="text" name="user_name" placeholder="이름" maxlength="20">
            </div>
            <div>
                <input class="inputSize_1" type="email" name="user_email" placeholder="이메일" maxlength="20">
            </div>


            <div class="animal_check">
                <label class="labelText">키우는 동물 : </label>
                <div class="animal_box">
                    <input type="checkbox" name="animal" value="강아지">강아지
                    <input type="checkbox" name="animal" value="고양이">고양이
                    <input type="checkbox" name="animal" value="햄스터">햄스터
                    <input type="checkbox" name="animal" value="기타">기타
                </div>
            </div>

            <%
                String [] animal = request.getParameterValues("animal");
                if(animal != null) {
                    for(int i=0; i<animal.length; i++){
                        out.println(" " + animal[i]);
                    }
                }
            %>
            <hr>
            <div class="listBox_All">
                <label class="labelText">거주 지역</label>
                <select class="list_box" name="Area" onchange="areaList(this)">
                    <option>시/도 선택</option>
                    <option value="서울">서울</option>
                    <option value="경기">경기</option>
                    <option value="인천">인천</option>
                    <option value="부산">부산</option>
                    <option value="대구">대구</option>
                    <option value="광주">광주</option>
                    <option value="울산">울산</option>
                    <option value="대전">대전</option>
                    <option value="세종">세종</option>
                </select>

                <select class="list_box" name="Area" id="state">
                    <option>군/구 선택</option>
                </select>
            </div>

            <script type="text/javascript">
                function areaList(e) {
                    var list_Seoul = ["강남구","서초구","중구","서초구","양천구","종로구","송파구","마포구","용산구","강동구","서대문구","성동구","관악구","은평구","동대문구",
                        "동작구","노원구","도봉구","영등포구","중랑구","강북구","금천구","광진구","성북구","구로구"];
                    var list_Gyeonggi = ["수원","김포","고양","영통","용인","일산","성남","기흥","부천","분당","안성","남양주","과천","오산","동두천","광명","의왕","양주",
                    "안양","이천","의정부","시흥","평택","파주","안산","하남","포천","광주","하남","포천","광주","화성","연천","군포","여주","가평","구리","양평"];
                    var list_Incheon = ["송도","청라","연수구","남동구","서구","부평","미추홀구","계양구","중구","강화군","옹진군","동구"];
                    var list_Busan = ["서면","남포동","광안리","해운대","센텀시티","송도","중구","남구","강서구","서구","북구","연제구","동구","동래구","수영구","영도구","사하구","사상구","부산진구","금정구","기장군"];
                    var list_Daegu = ["동성로","달서구","수성구","중구","남구","서구","동구","북구","달성군"];
                    var list_Gwangju = ["충장로","상무지구","동구","서구","북구","광산구","남구"];
                    var list_Ulsan = ["삼산동","성남동","공업탑","중구","동구","울주군","남구","북구"];
                    var list_Daejeon = ["둔산동","은행동","대덕구","동구","서구","유성구","중구"];
                    var list_Sejong = ["도담동","나성동","새롬동","다정동","한솔동","보람동","가람동","어진동","소담동","반곡동","종촌동","대평동","아름동","고운동","조치원읍"];

                    var target = document.getElementById("state");

                    if(e.value == "서울") {
                        var d = list_Seoul;
                    }else if(e.value == "경기") {
                        var d = list_Gyeonggi;
                    }else if(e.value == "인천") {
                        var d = list_Incheon;
                    }else if(e.value == "부산") {
                        var d = list_Busan;
                    }else if(e.value == "대구") {
                        var d = list_Daegu;
                    }else if(e.value == "광주") {
                        var d = list_Gwangju;
                    }else if(e.value == "울산") {
                        var d = list_Ulsan;
                    }else if(e.value == "대전") {
                        var d = list_Daejeon;
                    }else if(e.value == "세종") {
                        var d = list_Sejong;
                    }

                    target.options.length = 0;

                    for (x in d) {
                        var opt = document.createElement("option");
                        opt.value = d[x];
                        opt.innerHTML = d[x];
                        target.appendChild(opt);
                    }
                }
            </script>
            <hr>
            <div class="finishBtn_Box">
                <input class="finishBtn" type="submit" value="가입하기" onclick="checkJoin()"/>
            </div>
        </form>
    </div>
</div>
</body>
</html>