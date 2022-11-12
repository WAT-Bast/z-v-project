<%@ page import="java.io.PrintWriter" %>
<%@ page import="DAO.UserDAO" %><%--
  Created by IntelliJ IDEA.
  User: lby99
  Date: 2022-11-12
  Time: 오후 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="UserDB.User" scope="page"/>
<jsp:setProperty name="user" property="user_number" />
<jsp:setProperty name="user" property="user_ID" />
<jsp:setProperty name="user" property="user_PW" />
<jsp:setProperty name="user" property="user_name" />
<jsp:setProperty name="user" property="user_email" />
<jsp:setProperty name="user" property="animal" />
<jsp:setProperty name="user" property="Area" />
<html>
<head>
    <title>$Title$</title>
</head>
<body>
  <%
    if(user.getUser_ID() == null || user.getUser_PW() == null || user.getUser_email() == null || user.getUser_name() == null || user.getAnimal() == null || user.getArea() == null){
      PrintWriter script = response.getWriter();
      script.println("<script>");
      script.println("alert('입력이 안 된 사항이 있습니다.')");
      script.println("history.back()");
      script.println("</script>");
    } else {
      UserDAO userDAO = new UserDAO();
      int result = userDAO.join(user);
      if(result == -1) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('이미 존재하는 아이디입니다.')");
        script.println("history.back()");
        script.println("</script>");
      } else {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("location.href = 'main.jsp'");
        script.println("</script>");
      }
    }
  %>
</body>
</html>
