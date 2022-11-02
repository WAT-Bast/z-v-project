<%--
  Created by IntelliJ IDEA.
  User: suim7
  Date: 2022-09-24
  Time: 오전 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="resources/CSS/main.css" rel="stylesheet" type="text/css">
    <script src="https://kit.fontawesome.com/40a67f0cba.js" crossorigin="anonymous"></script>
    <title>Z&V 홈페이지</title>
</head>
<body>
<!-- navbar -->
<div class="main_bar">
    <a href="" class="home">
        <img src="resources/img/로고.png" alt="Z&V 로고">
        <div class="home_str">Z&V</div>
    </a>
    <form action="" method="post">
        <button type="button" class="navyBtn" onClick="location.href=''" type="submit">로그인</button>
    </form>
</div>

<!-- main -->
<div class="main_contents">
    <div class="Search">
        <div class="Search_text">
            <form action="" method="post">
                <input type="text" name="search" value="" type="submit">
                <button type="button" class="search_Btn" onClick="location.href=''">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </button>
            </form>
        </div>
    </div>
    <div class="filter">
        <form method="post" class="filter_list">
            <div class="filter_box">
                <div>지역</div>
                <select class="Area_list" name="area">
                    <option value="">서울</option>
                    <option value="">인천</option>
                    <option value="">대전</option>
                    <option value="">부산</option>
                </select>
            </div>
            <div class="filter_box">
                <div>구</div>
                <select class="District_list" name="area">
                    <option value="">강남구</option>
                    <option value="">구</option>
                    <option value="">구</option>
                    <option value="">구</option>
                </select>
            </div>
            <div class="filter_box">
                <div>옵션</div>
                <select class="Options_list" name="area">
                    <option value="">샵</option>
                    <option value="">24시</option>
                    <option value="">대전</option>
                    <option value="">부산</option>
                </select>
            </div>
        </form>
    </div>
    <!--poster-->
    <div class="poster">
        <img src="resources/img/포스터.png" alt="">
    </div>
    <!-- Advantages -->
    <div class="Advantages">
        <div class="Advantages_str">Z&V, 이런 점이 좋아요!</div>
        <div class="Advantages_bar">
            <div class="Advantages_bar_child"></div>
        </div>
        <div class="Advantages_th">
            <div class="Hospitals">
                <div class="Advantage_img">
                    <img src="resources/img/장점 병원.png" alt="Hospitals">
                </div>
                <div class="big_str">대한민국<br>누적 동물병원 리뷰 수 1위</div>
                <hr>
                <div class="small_str">가 본 사람들의 꿀팁이 가득한<br>418,740개의 리뷰를 만나보세요.</div>
                <form action="" class="go_button" method="post">
                    <button type="button" class="navyBtn" onClick="location.href=''">병원 둘러보기 ></button>
                </form>
            </div>
            <div class="Reviews">
                <div class="Advantage_img">
                    <img src="resources/img/장점 리뷰.png" alt="Reviews">
                </div>
                <div class="big_str">가 본 사람들의 인증으로<br>광고없는 '진짜' 리뷰</div>
                <hr>
                <div class="small_str">Z&V 회원이라면 누구나<br>리뷰를 쓸 수 있어요.</div>
                <form action="" class="go_button" method="post">
                    <button type="button" class="navyBtn" onClick="location.href=''">리뷰 쓰러가기 ></button>
                </form>
            </div>
            <div class="like_List">
                <div class="Advantage_img">
                    <img src="resources/img/장점 관심목록.png" alt="like_List">
                </div>
                <div class="big_str">쉽고, 빠르게 찾는<br>나만의 관심 목록</div>
                <hr>
                <div class="small_str">우리 동물을 위한 병원을 한눈에<br>찾아보세요.</div>
                <form action="" class="go_button" method="post">
                    <button type="button" class="navyBtn" onClick="location.href=''">관심 목록 둘러보기 ></button>
                </form>
            </div>
        </div>
    </div>
    <!--Best_List_bar-->
    <div class="Best_List_bar">
        <div class="name">
            <div class="name_icon">
                <i class="fa-solid fa-paw"></i>
            </div>
            <div class="name_str">동물병원 BEST</div>
        </div>
        <div class="a"></div>
        <div class="a"></div>
    </div>
    <div class="Best_List">
        <div class="Best_Line">

            <div class="Best_Piece">
                <div class="listBox_img">
                    <img src="resources/img/동물병원.png" alt="Z&V 로고" class="Best_img">
                    <form>
                        <button type="submit" class="interest_icon" value="interest" onclick="">
                            <i class="fa-solid fa-heart"></i>
                        </button>
                    </form>
                </div>
                <div class="Description">
                    <div class="hospitalName">24시 유앤미 동물병원</div>
                    <span class="star">
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                    </span>
                    <p class="starText">(4.5)</p>
                </div>
            </div>
            <div class="Best_Piece">
                <div class="listBox_img">
                    <img src="resources/img/동물병원.png" alt="Z&V 로고" class="Best_img">
                    <form>
                        <button type="submit" class="interest_icon" value="interest" onclick="">
                            <i class="fa-solid fa-heart"></i>
                        </button>
                    </form>
                </div>
                <div class="Description">
                    <div class="hospitalName">24시 유앤미 동물병원</div>
                    <span class="star">
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                    </span>
                    <p class="starText">(4.5)</p>
                </div>
            </div>

        </div>
        <div class="Best_Line">

            <div class="Best_Piece">
                <div class="listBox_img">
                    <img src="resources/img/동물병원.png" alt="Z&V 로고" class="Best_img">
                    <form>
                        <button type="submit" class="interest_icon" value="interest" onclick="">
                            <i class="fa-solid fa-heart"></i>
                        </button>
                    </form>
                </div>
                <div class="Description">
                    <div class="hospitalName">24시 유앤미 동물병원</div>
                    <span class="star">
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                    </span>
                    <p class="starText">(4.5)</p>
                </div>
            </div>
            <div class="Best_Piece">
                <div class="listBox_img">
                    <img src="resources/img/동물병원.png" alt="Z&V 로고" class="Best_img">
                    <form>
                        <button type="submit" class="interest_icon" value="interest" onclick="">
                            <i class="fa-solid fa-heart"></i>
                        </button>
                    </form>
                </div>
                <div class="Description">
                    <div class="hospitalName">24시 유앤미 동물병원</div>
                    <span class="star">
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                        <i class="fa-regular fa-star"></i>
                    </span>
                    <p class="starText">(4.5)</p>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
