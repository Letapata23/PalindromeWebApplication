<%-- 
    Document   : number_entry
    Created on : 30 Mar 2024, 02:34:09
    Author     : gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Entry Page</title>
    </head>
    <body>
         <h1>Required input</h1>
         <%
             String compName=(String) session.getAttribute("comp_name");
             String message = (String) session.getAttribute("message");
         %>
        <p>
            <%=message%>, my name is <%=compName%> Please provide a number below to be checked as a palindrome.
        </p>
        <form action="PalindromeServlet.do" method="POST">
            <table>
                <tr>
                    <td>Number:</td>
                    <td><input type="text" name="number" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="CHECK"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
