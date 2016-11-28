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
        <div class="panel panel-default">
            <div class="panel-heading">Acciones</div>
            <div class="panel-body">
        <form action="report_s.jsp">
            <input type="hidden" name="roomid" value=<%=roomId%>>
            <input type="submit" value="Reportar" class="btn btn-default">
        </form>

        <form action="memo.jsp">
            <input type="hidden" name="roomid" value=<%=roomId%>>
            <input type="submit" value="Memo" class="btn btn-default">
        </form>

        </div>
            </div>
        </div>
</body>
</html>
