<%-- 
    Document   : telacategoria
    Created on : 05/11/2017, 19:03:35
    Author     : gleiceellen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Categorias</h1>
        
        <a href="/categoria/tela/cadastrar">Nova Categoria</a>
        
        <table border="1">
            <tr>
                <td>Id</td>
                <td>Descrição</td>
            </tr>
            
            <c:forEach var="categoria" items="${lista}">
                <tr>
                    <td>${categoria.id}</td>
                    <td>${categoria.descricao}</td>
                </tr>
            </c:forEach>
                
        </table>
    </body>
</html>
