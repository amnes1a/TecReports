<%@ page import="tecreports.TecReports" %>
<%@ page import="com.backendless.zamobb.data.Salon" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 1:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String salonid = request.getParameter("salonid");
        Salon salon = TecReports.getRoom(salonid);
    %>
    <h1>Memo: <%=salon.getName()%></h1>
    <fieldset>
        <legend>Datos</legend>
        <form action="report_bano.jsp">
                    <textarea rows="4" cols="50" name="message">
                    </textarea>
            <input type="hidden" name="salonid" value=<%=salonid%>>
            <input type="submit" value="Enviar">
        </form>
    </fieldset>
</body>
</html>
