<%@ page import="com.backendless.BackendlessUser" %>
<%@ page import="com.backendless.Backendless" %>
<%@ page import="com.backendless.zamobb.data.Ticket_Enc_Salon" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="tecreports.TecReports" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Ticket_Enc_Bano" %><%--
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
        if(type != 0)
            response.sendRedirect("index.jsp");
%>
<form action="logout.jsp">
    <input type="submit" value="Logout">
</form>

<h1>Tickets salon</h1>
<%
    Iterator<Ticket_Enc_Salon> tickets = TecReports.getEncTicketsSalon();
    while (tickets.hasNext()){
        Ticket_Enc_Salon t = tickets.next();
        out.write("<form action=\"attendant_action.jsp\">");
        out.write("Salon: "+t.getIDr_Salon().getName());
        out.write("<br>");
        out.write("Detalles: "+t.getDetails());
        out.write("<br>");
        out.write("<input type=\"submit\" value=\"Okay\">");
        out.write("<br>");
        out.write("<input type=\"hidden\" name=\"ticketId\" value="+t.getObjectId()+">");
        out.write("<input type=\"hidden\" name=\"typeTicket\" value=\"salon\">");
        out.write("<br>");
        out.write("<form>");
        out.write("<br><br>");
    }
%>
<br>
<h1>Tickets baño</h1>
<%
    Iterator<Ticket_Enc_Bano> ticketsb = TecReports.getEncTicketsBano();
    while (ticketsb.hasNext()){
        Ticket_Enc_Bano t = ticketsb.next();
        out.write("<form action=\"attendant_action.jsp\">");
        out.write("Baño: "+t.getIDr_Bano().getDescripcion());
        out.write("<br>");
        out.write("Detalles: "+t.getDetails());
        out.write("<br>");
        out.write("<input type=\"submit\" value=\"Okay\">");
        out.write("<br>");
        out.write("<input type=\"hidden\" name=\"ticketId\" value="+t.getObjectId()+">");
        out.write("<input type=\"hidden\" name=\"typeTicket\" value=\"bano\">");
        out.write("<br>");
        out.write("<form>");
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
