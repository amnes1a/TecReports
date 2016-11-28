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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TecReports</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.jsp">Inicio</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container"  style="padding-top: 70px;">
<%
    if(Backendless.UserService.isValidLogin()){
        BackendlessUser userLog = Backendless.UserService.CurrentUser();
        Integer type = (Integer)userLog.getProperty("type");
        if(type != 0)
            response.sendRedirect("index.jsp");
%>
<form action="logout.jsp">
    <input type="submit" value="Logout" class="btn btn-danger">
</form>

    <div class="panel panel-default">
        <div class="panel-heading">Tickets salon</div>
        <div class="panel-body">
<%
    Iterator<Ticket_Enc_Salon> tickets = TecReports.getEncTicketsSalon();
    while (tickets.hasNext()){
        Ticket_Enc_Salon t = tickets.next();
        out.write("<form action=\"attendant_action.jsp\">");
        out.write("Salon: "+t.getIDr_Salon().getName());
        out.write("<br>");
        out.write("Detalles: "+t.getDetails());
        out.write("<br>");
        out.write("<input type=\"submit\" value=\"Okay\" class=\"btn btn-success\">");
        out.write("<br>");
        out.write("<input type=\"hidden\" name=\"ticketId\" value="+t.getObjectId()+">");
        out.write("<input type=\"hidden\" name=\"typeTicket\" value=\"salon\">");
        out.write("<br>");
        out.write("<form>");
    }
%>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">Tickets baño</div>
        <div class="panel-body">
<%
    Iterator<Ticket_Enc_Bano> ticketsb = TecReports.getEncTicketsBano();
    while (ticketsb.hasNext()){
        Ticket_Enc_Bano t = ticketsb.next();
        out.write("<form action=\"attendant_action.jsp\">");
        out.write("Baño: "+t.getIDr_Bano().getDescripcion());
        out.write("<br>");
        out.write("Detalles: "+t.getDetails());
        out.write("<br>");
        out.write("<input type=\"submit\" value=\"Okay\" class=\"btn btn-success\">");
        out.write("<br>");
        out.write("<input type=\"hidden\" name=\"ticketId\" value="+t.getObjectId()+">");
        out.write("<input type=\"hidden\" name=\"typeTicket\" value=\"bano\">");
        out.write("<br>");
        out.write("<form>");
    }
%>
        </div>
    </div>
<%
    }else{
        response.sendRedirect("index.jsp");
    }
%>
    </div>
</body>
</html>
