<%-- 
    Document   : invalid_password
    Created on : 28 Mar 2024, 12:56:11
    Author     : gee
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid password page</title>
    </head>
    <body>
        <h1>Invalid Login Credentials</h1>
        <%
            String errorMsg = (String) exception.getMessage();
        %>
        <p>
            <%=errorMsg%> <br/>
            Click <a href="login.html">here</a> to go back to login page.
        </p>
    </body>
</html>
