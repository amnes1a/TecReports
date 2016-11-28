<%@ page import="tecreports.TecReports" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.backendless.Backendless" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.backendless.zamobb.data.Location" %>
<%@ page import="com.backendless.BackendlessUser" %>
<%@ page import="com.backendless.persistence.local.UserTokenStorageFactory" %><%--
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
      <!-- Latest compiled and minified CSS -->
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
                  <li class="active"><a href="#">Inicio</a></li>
              </ul>
          </div><!--/.nav-collapse -->
      </div>
  </nav>
    <%!
        public void jspInit() {
            Backendless.initApp( TecReports.getAppId(), TecReports.getAppKey(), TecReports.getVERSION() );
        }
    %>
  <div class="container"  style="padding-top: 70px;">

    <%
        // UserTokenStorageFactory is available in the com.backendless.persistence.local package

        String userToken = UserTokenStorageFactory.instance().getStorage().get();
        if( userToken != null && !userToken.equals( "" ) && Backendless.UserService.isValidLogin()) {
            BackendlessUser userLog = Backendless.UserService.CurrentUser();
            Integer type = (Integer)userLog.getProperty("type");
            boolean isActive = false;
            if(type == 1){
    %>
        <div class="panel panel-default">
            <div class="panel-heading">Administracion Dica</div>
            <div class="panel-body">
        <form action="dica_admin.jsp">
            <input type="submit" value="Admin" class="btn btn-default">
        </form>
</div>
            </div>
    <%
            }else{
    %>
        <div class="panel panel-default">
            <div class="panel-heading">Administracion Empleado</div>
            <div class="panel-body">
        <form action="attendant_admin.jsp">
            <input type="submit" value="Admin" class="btn btn-default">
        </form>
                </div>
            </div>
    <%
            }
        }else{
                boolean isActive = true;
    %>
        <div class="panel panel-default">
            <div class="panel-heading">Locaciones</div>
            <div class="panel-body">
        <form action="login.jsp">
            Usuario:<br>
            <input type="text" name="user" value="" required>
            <br>
            Contraseña:<br>
            <input type="password" name="password" value="" required>
            <br><br>
            <input type="submit" value="Submit" class="btn btn-default">
        </form>
                </div>
            </div>
    <%
        }
    %>
    <br>
      <div class="panel panel-default">
          <div class="panel-heading">Locaciones</div>
          <div class="panel-body">
    <%
        Iterator<Location> locations = TecReports.getLocations();
        while( locations.hasNext() )
        {
            Location e = locations.next();
            out.write("<form>");
            out.write("<input type=\"hidden\" name=\"locationid\" value="+e.getObjectId()+">");
            out.write("<button type=\"submit\" formaction=\"location.jsp\" class=\"btn btn-default\">"+e.getName()+"</button>");
            out.write("</form>");
        }
        TecReports.getRoomShcedule("");
    %>
          </div>
      </div>
  </div>
  </body>
</html>
