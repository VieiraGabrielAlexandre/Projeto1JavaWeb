<%-- 
    Document   : acao
    Created on : 03/04/2018, 23:51:33
    Author     : gabriel
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
      
            request.getRequestDispatcher("thesims.jsp").forward(request, response);
      
        } if(acao.equals("2")){
      
            request.getRequestDispatcher("dragonage.jsp").forward(request, response);
      
        } if(acao.equals("3")){
      
            request.getRequestDispatcher("fifa.jsp").forward(request, response);
      
        }  if(acao.equals("4")){
      
            request.getRequestDispatcher("maddennfl.jsp").forward(request, response);
        }

        
        %>
    </body>
</html>

