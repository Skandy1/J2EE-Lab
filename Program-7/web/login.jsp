<%-- 
    Document   : login
    Created on : 15 May, 2021, 10:44:51 AM
    Author     : SKANDA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redirect Page</title>
    </head>
    <body>
        <% String s2=request.getParameter("password");
        if(s2.equals("admin123")){
            %>
            <jsp:forward page="welcome.jsp"/>
        <% } else {%>
        <h3>Please re-enter valid password</h3>
        <jsp:include page="index.html" flush="true"/>
        <%}%>
    </body>
</html>
