<%@ page import="com.backendless.BackendlessUser" %>
<%@ page import="com.backendless.Backendless" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Tickets_Dica" %>
<%@ page import="tecreports.TecReports" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/22/16
  Time: 1:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(Backendless.UserService.isValidLogin()){
        BackendlessUser userLog = Backendless.UserService.CurrentUser();
        Integer type = (Integer)userLog.getProperty("type");
        if(type != 1)
            response.sendRedirect("index.jsp");
%>
<form action="logout.jsp">
    <input type="submit" value="Logout">
</form>

<h1>Tickets</h1>
<%
    ArrayList<Tickets_Dica> tickets = TecReports.getDicaTickets(userLog.getObjectId());
    for(Tickets_Dica t : tickets) {
        out.write("<form action=\"dica_action.jsp\">");
        out.write("Estudiante: " + t.getStudent_ID());
        out.write("<br>");
        out.write("Salón: " + t.getIDr_Schedule().getIDr_Salon().getName());
        out.write("<br>");
        out.write("Día: " + t.getIDr_Schedule().getIDr_Day().getDay());
        out.write("<br>");
        out.write("Horario: " + t.getIDr_Schedule().getIDr_Event().getIDr_Hour().getTime_a() + " a " +
                t.getIDr_Schedule().getIDr_Event().getIDr_Hour().getTime_b());
        out.write("<br>");
        out.write("Evento: " + t.getIDr_Schedule().getIDr_Event().getEvent_Name());
        out.write("<br>");
        out.write("<input type=\"radio\" name=\"ticketOption\" value=\"true\" checked> Aceptar<br>");
        out.write("<input type=\"radio\" name=\"ticketOption\" value=\"false\" checked> Rechazar<br>");

        out.write("<input type=\"hidden\" name=\"ticketId\" value="+t.getObjectId()+">");
        out.write("<input type=\"hidden\" name=\"scheduleId\" value="+t.getIDr_Schedule().getObjectId()+">");

        out.write("<input type=\"submit\" value=\"Submit\">");
        out.write("</form>");
        out.write("<br><br>");
    }
%>
<%
    }else{
        response.sendRedirect("index.jsp");
    }
%>
</body>
</html>
