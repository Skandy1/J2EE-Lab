<%-- 
    Document   : index
    Created on : 3 Jul, 2021, 7:21:12 PM
    Author     : SKANDA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <hr>
        <form action="calc" method="POST">
            Enter First Value: &nbsp;&nbsp;&nbsp;<input type="texy" name="n1" size="25" style="margin: 10px"><br>
            Enter Second Value: &nbsp;&nbsp;&nbsp;<input type="texy" name="n2" size="25" ><br>
            <b>Select your choice:</b>
            <input type="radio" name="operation" value ="add" style="margin: 5px">Addition
            <input type="radio" name="operation" value ="sub" style="margin: 5px">Subtraction
            <input type="radio" name="operation" value ="multi" style="margin: 5px">Multiplication
            <input type="radio" name="operation" value ="div" style="margin: 5px">Division
            <p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset"></p>
        </form>
    </body>
</html>
