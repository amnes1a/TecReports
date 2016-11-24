<%@ page import="com.backendless.Backendless" %>
<%@ page import="com.backendless.BackendlessUser" %>
<%@ page import="tecreports.TecReports" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/23/16
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(Backendless.UserService.isValidLogin()) {
        BackendlessUser userLog = Backendless.UserService.CurrentUser();
        Integer type = (Integer) userLog.getProperty("type");
        if (type != 1)
            response.sendRedirect("index.jsp");

        String ticketId = request.getParameter("ticketId");
        String typeTicket = request.getParameter("typeTicket");


        TecReports.solveTicketEnc(typeTicket, ticketId);
    }else{
        response.sendRedirect("index.jsp");
    }
%>
</body>
</html>
