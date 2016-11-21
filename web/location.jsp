<%@ page import="java.util.ArrayList" %>
<%@ page import="tecreports.TecReports" %>
<%@ page import="javax.swing.plaf.synth.SynthTextAreaUI" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Salon" %><%--
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
</head>
<body>
    <h1>Salon:</h1>
    <%
        String locId = request.getParameter("locationid");
        Iterator<Salon> sal = TecReports.getRooms(locId);

        while( sal.hasNext() )
        {
            Salon e = sal.next();
            out.write("<form>");
            out.write("<input type=\"hidden\" name=\"roomid\" value="+e.getObjectId()+">");
            out.write("<button type=\"submit\" formaction=\"room.jsp\">"+e.getName()+"</button>");
            out.write("</form>");
        }
    %>

</body>
</html>
