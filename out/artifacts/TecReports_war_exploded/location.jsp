<%@ page import="java.util.ArrayList" %>
<%@ page import="tecreports.TecReports" %>
<%@ page import="javax.swing.plaf.synth.SynthTextAreaUI" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Salon" %>
<%@ page import="com.backendless.zamobb.data.Bano" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/19/16
  Time: 7:21 PM
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
    <div class="panel panel-default">
        <div class="panel-heading">Salon</div>
        <div class="panel-body">
    <%
        String locId = request.getParameter("locationid");
        Iterator<Salon> sal = TecReports.getRooms(locId);

        while( sal.hasNext() )
        {
            Salon e = sal.next();
            out.write("<form>");
            out.write("<input type=\"hidden\" name=\"roomid\" value="+e.getObjectId()+">");
            out.write("<button type=\"submit\" formaction=\"room.jsp\" class=\"btn btn-default\">"+e.getName()+"</button>");
            out.write("</form>");
        }
    %>
            </div>
        </div>

    <div class="panel panel-default">
        <div class="panel-heading">Baño</div>
        <div class="panel-body">
    <%
        Iterator<Bano> ban = TecReports.getBathrooms(locId);

        while( ban.hasNext() )
        {
            Bano b = ban.next();
            out.write("<form>");
            out.write("<input type=\"hidden\" name=\"banoid\" value="+b.getObjectId()+">");
            out.write("<button type=\"submit\" formaction=\"bano.jsp\" class=\"btn btn-default\">"+b.getDescripcion()+"</button>");
            out.write("</form>");
        }
    %>
            </div>
        </div>
    </div>
</body>
</html>
