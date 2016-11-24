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
        String salonid = request.getParameter("roomid");
        Salon salon = TecReports.getRoom(salonid);
    %>
    <h1>Memo: <%=salon.getName()%></h1>
    <fieldset>
        <legend>Datos</legend>
        <form action="memo_gen.jsp">
            Matrícula:
            <input type="text" name="userid" value="" required><br>
            Día:
            <select name="day">
                <option value="39F108D3-4B02-7161-FF1E-0954837C4800" selected>Lunes</option>
                <option value="2E1F8ECB-7AB1-5DD3-FF79-33C870D72600">Martes</option>
                <option value="CA96712F-DC41-C255-FF86-F763F8292500">Miércoles</option>
                <option value="971AFDB9-D2B8-4C68-FF46-E56EBFF25C00">Jueves</option>
                <option value="FCACA159-DB23-5785-FF5C-B61F70639000">Viernes</option>
                <option value="D56F5AFC-290C-A1A9-FF1B-72390DFFC000">Sábado</option>
                <option value="735CA67B-7EA8-39BD-FFA0-40073EB0E500">Domingo</option>
            </select><br>
            Hora:
            <select name="hour">
                <option value="69D90080-A51B-45ED-FF8F-2EDCEA212E00" selected>7:00 - 8:30</option>
                <option value="CA8A4395-F768-BB10-FFD3-8CAD312BB500">8:30 - 10:00</option>
                <option value="6649759D-CB3D-122E-FFD8-0ACE2BF1E100">10:00 - 11:30</option>
                <option value="219487AB-D487-287B-FF58-0A2B953E8500">11:30 - 13:00</option>
                <option value="76C1CD9F-281B-EAEF-FF91-59930A10FB00">13:00 - 14:30</option>
                <option value="8F770C2C-C21A-AC5A-FFDD-C0B206EB3600">14:30 - 16:00</option>
                <option value="C2DD10E0-FF0A-2EDD-FF3D-400DF265D800">16:00 - 17:30</option>
                <option value="B64AE411-8D2B-65B8-FF80-770214D02000">17:30 - 19:00</option>
                <option value="F2BA9DC1-DE2F-5CC0-FFFC-EC1B4B1E1E00">19:00 - 20:30</option>
                <option value="ACDDBF85-467B-4510-FF96-9F3C29618500">20:30 - 22:00</option>
                <option value="83887C6D-741F-DEA7-FF1F-704BB092D100">Todo el día</option>
            </select><br>
            Descripción evento:
            <input type="text" name="event" value="" required><br>

            <input type="hidden" name="salonid" value=<%=salonid%>>

            <input type="submit" value="Enviar">
        </form>
    </fieldset>
</body>
</html>
