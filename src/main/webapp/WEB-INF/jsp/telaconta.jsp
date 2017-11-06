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
        <h1>Lista de Contas</h1>
        
        <a href="/conta/tela/cadastrar">Nova Conta</a>
        
        <table border="1">
            <tr>
                <td>Id</td>
                <td>Descrição</td>
                <td>Tipo</td>
                <td>Valor</td>
                <td>Categoria</td>
            </tr>
            
            <c:forEach var="conta" items="${contas}">
                <tr>
                    <td>${conta.id}</td>
                    <td>${conta.descricao}</td>
                    <td>${conta.tipo}</td>
                    <td>${conta.valor}</td>
                    <td>${conta.categoria.descricao}</td>
                </tr>
            </c:forEach>
                
        </table>
    </body>
</html>
