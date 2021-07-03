<%-- 
    Document   : welcome
    Created on : 15 May, 2021, 10:49:53 AM
    Author     : SKANDA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <h3>Login Successful</h3>
        Welcome &nbsp; <%=request.getParameter("username")%>
                
    </body>
</html>
