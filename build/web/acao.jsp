<%-- 
    Document   : acao
    Created on : 03/04/2018, 23:51:33
    Author     : yan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String acao = (request.getParameter("escolha")); %>
        
        <%  
        if(acao.equals("1")){
      
            request.getRequestDispatcher("rocketleague.html").forward(request, response);
      
        } if(acao.equals("2")){
      
            request.getRequestDispatcher("Dota.html").forward(request, response);
      
        }  

        
        %>
    </body>
</html>