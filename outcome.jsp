<%-- 
    Document   : outcome
    Created on : 28 Mar 2024, 14:56:08
    Author     : gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String output = (String) session.getAttribute("theMessage");
        %> 
        
        <p>
           <%=output%> <br/>   
        </p>
        <p>
            Click <a href="number_entry.jsp">here</a> to enter number again or click the below button to end session. <br/>
            <!--or <a href="EndSessionServlet.do">here</a> -->
        <form action="EndSessionServlet.do" method="GET">
            <input type="submit" value="END SESSION">
        </form>
            
        </p>
    </body>
</html>
