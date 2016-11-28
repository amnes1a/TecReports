<%@ page import="tecreports.TecReports" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String userid = request.getParameter("userid");
        String day = request.getParameter("day");
        String hour = request.getParameter("hour");
        String eventDescrip = request.getParameter("event");
        String salonid = request.getParameter("salonid");
        boolean status = TecReports.setScheduleEvent(hour, eventDescrip, salonid, day, userid);

        if(status){
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("index.jsp");
        }
    %>
</body>
</html>
