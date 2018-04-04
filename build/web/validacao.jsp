<%-- 
    Document   : home
    Created on : 29/03/2018, 21:41:59
    Author     : yan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

	
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plataforma de Jogos</title>
        <link rel="stylesheet" href="css.css" type="text/css" />
        
        
    </head>
    <body>
        
          
           <% String email= ( request.getParameter("email"));%>
           <% String senha= ( request.getParameter("senha"));%>
     
           <%
           
      if(email.equalsIgnoreCase("123@123.com") && senha.equals("123")){
      out.println("LOGIN FEITO");
      request.getRequestDispatcher("steam.jsp").forward(request, response);
      
      } else {
       out.println("ERRO NO LOGIN");
      }
      %>
    </body>
</html>
