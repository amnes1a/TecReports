<%@ page import="tecreports.TecReports" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.backendless.zamobb.data.Salon" %>
<%@ page import="com.backendless.zamobb.data.Events" %>
<%@ page import="com.backendless.zamobb.data.Day" %>
<%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/19/16
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String roomId = request.getParameter("roomid");
        Salon salon = TecReports.getRoom(roomId);
        System.out.println(salon.getImage());

        out.write("<h1>"+salon.getName()+"</h1>");
        Map<Day, ArrayList<Events>> eventsPerDay = TecReports.getRoomShcedule(roomId);

        for (Map.Entry<Day, ArrayList<Events>> entry : eventsPerDay.entrySet()) {
            Day key = entry.getKey();
            ArrayList<Events> value = entry.getValue();
            out.write("<h2>"+key.getDay()+"</h2>");
            for(Events e: value){
                out.write("<h3>Event: "+e.getEvent_Name()+"</h3>");
                out.write("<p>"+e.getIDr_Hour().getTime_a()+" to "+e.getIDr_Hour().getTime_b()+"<p>");
            }
        }
    %>

    <hr>
    <fieldset>
        <legend>Opciones</legend>
        <form action="report_s.jsp">
            <input type="hidden" name="roomid" value=<%=roomId%>>
            <input type="submit" value="Reportar">
        </form>

        <form action="memo.jsp">
            <input type="hidden" name="roomid" value=<%=roomId%>>
            <input type="submit" value="Memo">
        </form>
    </fieldset>
</body>
</html>
