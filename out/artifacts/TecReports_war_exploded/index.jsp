<%@ page import="tecreports.TecReports" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.backendless.Backendless" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Location" %><%--
  Created by IntelliJ IDEA.
  User: arturozamora
  Date: 11/19/16
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%!
      public void jspInit() {
          Backendless.initApp( TecReports.getAppId(), TecReports.getAppKey(), TecReports.getVERSION() );
      }
  %>

  <form action="login.jsp">
      Usuario:<br>
      <input type="text" name="user" value="" required>
      <br>
      Contraseña:<br>
      <input type="password" name="password" value="" required>
      <br><br>
      <input type="submit" value="Submit">
    </form>

    <br>

    <%
        Iterator<Location> locations = TecReports.getLocations();

        while( locations.hasNext() )
        {
            Location e = locations.next();
            out.write("<form>");
            out.write("<input type=\"hidden\" name=\"locationid\" value="+e.getObjectId()+">");
            out.write("<button type=\"submit\" formaction=\"location.jsp\">"+e.getName()+"</button>");
            out.write("</form>");
        }
        TecReports.getRoomShcedule("");
    %>

  </body>
</html>
