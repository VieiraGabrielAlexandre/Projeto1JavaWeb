<%@page contentType="text/html" pageEncoding="UTF-8"%>

	
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plataforma de Jogos</title>
        <link rel="stylesheet" href="css.css" type="text/css" />
        <style>
            *{
                 box-sizing: border-box;
            }
            .conteudo{
               text-align: center;
               position:absolute; 
               top:40%;
               left:40%;
               margin-top:-60px;
               margin-left:-60px;
               border: 1px solid black;
               padding: 10px;
            }
            li{
                padding: 0 0 10px 0;
            }
        </style>
            
            
        
    </head>
    <body>
        <div class="conteudo" >
        <h1>Escolha o Jogo da sua preferencia</h1>
        
        <ol type="123">
            <li>The Sims</li>
            <li>Dragon Age</li>
            <li>FIFA</li>
            <li>Madden NFL</li>
            <ul></ul>
            <form action="acao2.jsp" method="get">
                <input type="text"  name="escolha" placeholder="Digite o N* da opcao"/> <br><br>
                <input type="submit"  value="entrar"/>
            </form>
        </ol>
        </div>
    </body>
