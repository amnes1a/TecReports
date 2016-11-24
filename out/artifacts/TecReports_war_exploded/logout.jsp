<%@ page import="com.backendless.Backendless" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/22/16
  Time: 1:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.getAttribute("currentUser");
    session.invalidate();
    Backendless.UserService.logout();
    response.sendRedirect("index.jsp");
%>
</body>
</html>
