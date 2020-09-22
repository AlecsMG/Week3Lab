<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 22, 2020, 10:22:00 AM
    Author     : 831690
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            
           <input type="submit" name="operation" value="+">
           <input type="submit" name="operation" value="-">
           <input type="submit" name="operation" value="*">
           <input type="submit" name="operation" value="%">
           
           <p>Result: ${message}</p>
           
           
        </form>
    </body>
</html>
