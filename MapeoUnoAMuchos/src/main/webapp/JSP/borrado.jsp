<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
    </head>
    <body>

        <div id="principal">
            <h2>Elige uno para eliminar</h2>



            <form method="post" action="control?op=delete">
                <table>
                    <c:forEach var="item" items="${listadoPer}">
                        <tr>
                            <td><input type="radio" name="registro" value="${item.id}" /></td>
                            <td><c:out value="${item.nombre}"/></td>
                            <c:forEach var="listaLibro" items="${item.libros}">
                                <td><c:out value="${listaLibro.titulo}"/></td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="2"><input type="submit" value="Eliminar" class="boton" /></td>
                    </tr>
                </table>
            </form>

        </div>


    </body>
</html>