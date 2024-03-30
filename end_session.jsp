<%-- 
    Document   : end_session
    Created on : 30 Mar 2024, 05:56:59
    Author     : gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>End Session Page</title>
    </head>
    <%
        int numOfPalindromes = (Integer) request.getAttribute("numOfPalindromes");
        int numOfNonPalindromes = (Integer) request.getAttribute("numOfNonPalindromes");
    %>
    <body>
        <h1>Session Ended</h1>
        <h2>Session details</h2>
        <p>
           Total number of palindromes: <%=numOfPalindromes%> <br/>
           Total number of non palindromes: <%=numOfNonPalindromes%> </br>
           Click <a href="index.html">here</a> to go back to the login page.
        </p>
    </body>
</html>
