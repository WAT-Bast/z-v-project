<%--
  Created by IntelliJ IDEA.
  User: lby99
  Date: 2022-10-06
  Time: 오후 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://kit.fontawesome.com/5ef77fbbed.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/resources/CSS/manager.css">
    <title>관리자 페이지</title>
<%--    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.7.1/dist/chart.min.js"></script>--%>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
</head>
<body>
<div class="main_bar_container">
    <div class="main_bar">
        <a href="" class="home">
            <img src="resources/img/로고.png" alt="Z&V 로고">
            <div class="home_str">Z&V</div>
        </a>
        <form action="" method="post" class="manager_form">
            <i class="fa-solid fa-heart"></i>
            <button type="button" class="navyBtn" onClick="location.href=''" type="submit">관리자</button>
        </form>
    </div>
</div>



    <div class="hospital_title">
        <form class="hospital_form_container" method="post" name="manager">
            <div class="hospital_title_name_box">
                <input type="text" type="submit" class="hospital_name_input" placeholder="병원명을 입력해주세요.">
            </div>


            <div class="hospital_img_box">
                <div class="hospital_img_container">
                    <div class="imgPlus"><i class="fa-regular fa-images"></i></div>
                </div>
            </div>


            <div class="hospital_information">
                <div class="Address_Box">
                    <div class="hospital_address">
                        <div class="address_icon"><i class="fa-solid fa-location-dot"></i></div>
                        <input class="address_inputBox" type="text" type="submit" placeholder="병원 주소를 입력해주세요.">
                    </div>
                </div>

                            <div class="time_container">
                                <div class="test">
                                    <div class="time_icon"><i class="fa-regular fa-clock"></i></div>
                                    <div class="monday_box"><li class="monday_container"><div class="monday"><strong>월</strong></div><input class="Monday_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                </div>
                                <div class="week_box"><li class="week_container"><strong>화</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container"><strong>수</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container"><strong>목</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container"><strong>금</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container"><strong>토</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container"><strong>일</strong><input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                            </div>
            <div class="phoneNumber_container">
                <div class="hospital_phoneNumber">
                    <div class="phoneNumberBox">
                        <div class="phoneNumber_icon"><i class="fa-solid fa-phone"></i></div>
                        <input class="phoneNumberBox" type="tel" type="submit" placeholder="병원 전화번호를 적어주세요.">
                    </div>
                </div>
            </div>

                    <div class="hospital_link">
                        <div class="link_Box">
                            <div class="link_icon"><i class="fa-solid fa-house"></i></div>
                            <input class="link_urlBox" type="url" type="submit" placeholder="병원의 홈페이지 주소를 적어주세요.">
                        </div>
                    </div>

                <div class="map_Box">
                        <input class="map_input" type="text" type="submit" placeholder="병원 위도, 경도를 적어주세요 Ex)100. 100">
                </div>

                </div>
                <div class="shop_box">
                    <div class="shop_title">shop</div>
                    <div class="shop_radioBtn">
                        <input class="shop_radioBtn_text" type="radio" name="shopBtn" checked="checked" value="yes" /> Yes
                        <input class="shop_radioBtn_text" type="radio" name="shopBtn" value="no" /> No
                    </div>
                </div>
                <div class="Operating_hours_box">
                    <div class="Operating_hours_title">24시 운영</div>
                    <div class="Operating_hours_radioBtn">
                        <input class="Operating_hours_radioBtn_text" type="radio" name="shopBtn" checked="checked" value="yes" /> Yes
                        <input class="Operating_hours_radioBtn_text" type="radio" name="shopBtn" value="no" /> No
                    </div>
                </div>
            <div class="hospital_area_box">
                <div class="hospital_area_title">병원 지역</div>
                    <select class="hospital_area_list_box_1" name="area" >
                        <option value="">인천</option>
                        <option value="">서울</option>
                        <option value="">대전</option>
                        <option value="">부산</option>
                    </select>
                    <select class="hospital_area_list_box_2" name="area" >
                        <option value="">남동구</option>
                        <option value="">서구</option>
                        <option value="">연수구</option>
                        <option value="">구?</option>
                    </select>
                </div>

            <div class="animal_box">
                <label class="label_text">주 진찰 동물 : </label>
                <div class="animal_box_list">
                    <input type="checkbox" name="animal">강아지
                    <input type="checkbox" name="animal">고양이
                    <input type="checkbox" name="animal">햄스터
                    <input type="checkbox" name="animal">기타
                </div>
            </div>

            <div class="finishBtn_Box">
                <input class="finishBtn" type="submit" value="등록하기">
            </div>
            </form>

    </div>



</body>
</html>
