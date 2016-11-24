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
</head>
<body>
<%
    String banoId = request.getParameter("banoid");
    Bano bano = TecReports.getBano(banoId);

    out.write("<h1>"+bano.getDescripcion()+"</h1>");

%>

<hr>
<fieldset>
    <legend>Opciones</legend>
    <form action="report_b.jsp">
        <input type="hidden" name="banoid" value=<%=banoId%>>
        <input type="submit" value="Reportar">
    </form>
</fieldset>
</body>
</html>
