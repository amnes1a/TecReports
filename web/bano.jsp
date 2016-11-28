<%@ page import="com.backendless.zamobb.data.Bano" %>
<%@ page import="tecreports.TecReports" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/23/16
  Time: 11:45 PM
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
    String banoId = request.getParameter("banoid");
    Bano bano = TecReports.getBano(banoId);

    out.write("<h1>"+bano.getDescripcion()+"</h1>");

%>


    <div class="panel panel-default">
        <div class="panel-heading">Acciones</div>
        <div class="panel-body">
        <form action="report_b.jsp">
            <input type="hidden" name="banoid" value=<%=banoId%>>
            <input type="submit" value="Reportar" class="btn btn-default">
        </form>
    </div>
        </div>
    </div>
</body>
</html>
