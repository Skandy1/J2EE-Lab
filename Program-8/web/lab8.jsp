<%-- 
    Document   : lab8
    Created on : 9 Jun, 2021, 12:46:24 PM
    Author     : SKANDA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <jsp:useBean id="student" scope="request" class="Test.StudentBean"/>
        <jsp:setProperty name="student" property="*"/>
    <center>
        Name: <jsp:getProperty name="student" property="sname" /><br>
        USN: <jsp:getProperty name="student" property="susnno" /><br>
        Branch: <jsp:getProperty name="student" property="sbranch" /><br>
    </center>
            
    </body>
</html>
