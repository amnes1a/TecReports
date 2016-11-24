<%@ page import="com.backendless.Backendless" %>
<%@ page import="com.backendless.BackendlessUser" %>
<%@ page import="com.backendless.exceptions.BackendlessException" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <%
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        try{
            BackendlessUser userLog = Backendless.UserService.login(user, password, true);
            session.setAttribute("currentUser", userLog);
            response.sendRedirect("index.jsp");
        }catch(BackendlessException e){
            response.sendRedirect("error.jsp");
        }


    %>
</body>
</html>
