<%@ page import="com.backendless.zamobb.data.Bano" %>
<%@ page import="tecreports.TecReports" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 12:10 PM
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
    %>
    <h1>Reporte: <%=bano.getDescripcion()%></h1>
    <fieldset>
        <legend>Datos</legend>
        <form action="report_bano.jsp">
                <textarea rows="4" cols="50" name="message">
                </textarea>
            <input type="hidden" name="banoid" value=<%=banoId%>>
            <input type="submit" value="Enviar">
        </form>
    </fieldset>
</body>
</html>
