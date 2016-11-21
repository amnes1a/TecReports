<%@ page import="java.util.HashMap" %>
<%@ page import="com.backendless.Backendless" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        HashMap salon = new HashMap();
        salon.put( "___class", "Bano" );
        salon.put( "objectId", request.getParameter("banoid") );

        HashMap ticketEncBano = new HashMap();
        ticketEncBano.put( "___class", "Ticket_Enc_Bano" );
        ticketEncBano.put( "details", request.getParameter("message") );
        ticketEncBano.put( "IDr_Bano", salon );

        try{
            Backendless.Persistence.of( "Ticket_Enc_Bano" ).save( ticketEncBano );
    %>
    <h2>Reporte guardado satisfactoriamente.</h2>
    <%
    }catch(Exception e){

    %>
    <h2>Tu reporte falló :V LOL xD GG.</h2>
    <%
        }
    %>
</body>
</html>
