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
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
</head>
<body>
<%--navbar--%>
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
        <!--<div class="title_box">
            <div class="title">
                <div class="title_str">병원명을 적어주세요.</div>
                <div class="a"></div>
                <div class="a"></div>
            </div>
        </div>
        -->
</div>



    <div class="hospital_title">
        <form class="hospital_form_container">
            <div class="all">
            <div class="hospital_title_name_box">
                <input type="text" type="submit" class="hospital_name_input" placeholder="병원명을 입력해주세요.">
            </div>
            </div>


            <div class="hospital_img_box">
                <div class="hospital_img_container">
                    <i class="fa-regular fa-images"></i>
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
                                    <div class="monday_box"><li class="monday_container"><div class="monday">월</div><input class="Monday_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                </div>
                                <div class="week_box"><li class="week_container">화<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container">수<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container">목<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container">금<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container">토<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                                <div class="week_box"><li class="week_container">일<input class="week_title" type="text" type="submit" placeholder="병원 운영시간을 적어주세요."></li></div>
                            </div>

                <div class="hospital_phoneNumber">
                    <div class="phoneNumberBox">
                        <div class="phoneNumber_icon"><i class="fa-solid fa-phone"></i></div>
                        <input class="phoneNumberBox" type="tel" type="submit" placeholder="병원 전화번호를 적어주세요.">
                    </div>
                </div>
            <div>
                <div class="hospital_link">
                    <div class="link_Box"><i class="fa-solid fa-house"></i></div>
                    <input class="link_urlBox" type="url" type="submit" placeholder="병원의 홈페이지 주소를 적어주세요.">
                </div>
            </div>
            </div>
        </form>
    </div>


    <div class="review_container">
        <div class="visitor_review">
            <h4 class="review_title">방문자 리뷰</h4>
        </div>

        <script type="text/javascript">
            google.charts.load('current', {'packages':['bar']});
            google.charts.setOnLoadCallback(drawStuff);

            function drawStuff() {
                var data = new google.visualization.arrayToDataTable([
                    [' ', ' '],
                    ["5", 1000],
                    ["4", 20],
                    ["3", 15],
                    ["2", 10],
                    ['1', 5]
                ]);

                var options = {
                    title: 'Chess opening moves',
                    width: 450,
                    legend: { position: 'none' },
                    /*chart: { title: 'Chess opening moves',
                             subtitle: 'popularity by percentage' },*/
                    bars: 'horizontal', // Required for Material Bar Charts.
                    axes: {
                        x: {
                            0: { side: 'top', label: ' ' } // Top x-axis.
                        }
                    },
                    bar: { groupWidth: "90%"},

                    /*hAxis: { textPostition : 'none'},
                    vAxis: { textPostition : 'none'}*/


                };

                var chart = new google.charts.Bar(document.getElementById('top_x_div'));
                chart.draw(data, options);
            };
        </script>
        <div id="top_x_div" style="width: 900px; height: 200px;"></div>
    </div>
</body>
</html>
