<%@ page import="com.backendless.Backendless" %>
<%@ page import="com.backendless.zamobb.data.Ticket_Enc_Salon" %>
<%@ page import="com.backendless.zamobb.data.Salon" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/21/16
  Time: 11:34 AM
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
        salon.put( "___class", "Salon" );
        salon.put( "objectId", request.getParameter("roomid") );

        HashMap ticketEncSalon = new HashMap();
        ticketEncSalon.put( "___class", "Ticket_Enc_Salon" );
        ticketEncSalon.put( "details", request.getParameter("message") );
        ticketEncSalon.put( "IDr_Salon", salon );


        Backendless.Persistence.of( "Ticket_Enc_Salon" ).save( ticketEncSalon );
        
    %>
</body>
</html>
