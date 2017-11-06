<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Categoria</h1>
        <form action="/categoria/cadastrar" method="POST">
            <label>descricao</label>
            <input type="text" name="descricao"/>
            <br>
            <input type="submit" value="Vai"/>
        </form>
    </body>
</html>
