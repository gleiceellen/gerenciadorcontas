<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Contas</h1>
        <form action="/conta/cadastrar" method="POST">
            <label>descricao</label>
            <input type="text" name="descricao"/>
            <br>
            <label>tipo</label>
            <select name="tipo">
                <c:forEach var="tipo" items="${tipos}">
                    <option value="${tipo}">${tipo}</option>
                </c:forEach>
            </select>
            <br>
            <label>valor</label>
            <input type="text" name="valor"/>
            <br>
            <label>Categoria</label>
            <select name="categoria">
                <c:forEach var="categoria" items="${categorias}">
                    <option value="${categoria.id}">${categoria.descricao}</option>
                </c:forEach>
            </select>
            <br>
            <input type="submit" value="Vai"/>
        </form>
    </body>
</html>
