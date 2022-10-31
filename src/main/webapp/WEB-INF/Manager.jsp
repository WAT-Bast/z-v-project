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
navbar
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
                </div>


            <div class="review_container">
                <div class="visitor_review">
                    <h3 class="review_title">방문자 리뷰</h3>
                </div>


                <div class="review">

                <div style="width:35%;">
                    <canvas id="canvas"></canvas>
                </div>

                <script>
                    new Chart(document.getElementById("canvas"), {
                        type: 'horizontalBar',
                        data: {
                            labels: ['5', '4', '3', '2', '1'],
                            datasets: [{
                                // label: '테스트 데이터셋',
                                data: [10, 3, 30, 23, 10, 5, 15, 25, 2, 4, 1, 13, 52, 23],
                                borderColor: "rgba(255, 201, 14, 1)",
                                backgroundColor: "rgba(255, 201, 14, 0.5)",
                                fill: false,
                            }]
                        },
                        options: {
                            legend: {
                              display: false
                            },
                            responsive: true,
                            title: {
                                display: false,
                                text: '막대 차트 테스트'
                            },
                            tooltips: {
                                mode: 'index',
                                intersect: true,
                            },
                            hover: {
                                mode: 'nearest',
                                intersect: false
                            },
                            scales: {
                                xAxes: [{
                                    display: false,
                                    scaleLabel: {
                                        display: false,

                                    },
                                }],
                                yAxes: [{
                                    display: true,
                                    ticks: {
                                        autoSkip: true,
                                    },
                                    scaleLabel: {
                                        display: true,
                                    }
                                }]
                            }
                        }
                    });

                </script>

                <div class="review_score_container">
                    <div class="ScoreBox">
                        <div class="score">0.0</div>
                        <input type="radio" name="reviewStar1" value="5" id="rate1"><label for="rate1">★</label>
                        <input type="radio" name="reviewStar1" value="5" id="rate2"><label for="rate2">★</label>
                        <input type="radio" name="reviewStar1" value="5" id="rate3"><label for="rate3">★</label>
                        <input type="radio" name="reviewStar1" value="5" id="rate4"><label for="rate4">★</label>
                        <input type="radio" name="reviewStar1" value="5" id="rate5"><label for="rate5">★</label>
                        <div class="review_score">리뷰 0개</div>
                    </div>
                </div>
                </div>
            </div>
        </form>

            <form class="review_star_container">
                <div class="review_comment">
                    <div class="review_comment_Box">
                        <div class="review_name">레오맘</div>
                        <input type="text" class="comment" type="submit" placeholder="리뷰를 작성해주세요.">
                    </div>

                    <div class="user_review_Box">
                        <div class="review_score_container2">
                            <div class="ScoreBox2">
                                    <input type="radio" name="reviewStar1" value="5" id="review1"><label for="review1">★</label>
                                    <input type="radio" name="reviewStar1" value="5" id="review2"><label for="review2">★</label>
                                    <input type="radio" name="reviewStar1" value="5" id="review3"><label for="review3">★</label>
                                    <input type="radio" name="reviewStar1" value="5" id="review4"><label for="review4">★</label>
                                    <input type="radio" name="reviewStar1" value="5" id="review5"><label for="review5">★</label>
                                </div>
                            </div>
                            <div class="review_comment_container"><input type="submit" class="review_comment_btn" value="등록하기"></div>
                    </div>
                </div>
            </form>
    </div>



</body>
</html>