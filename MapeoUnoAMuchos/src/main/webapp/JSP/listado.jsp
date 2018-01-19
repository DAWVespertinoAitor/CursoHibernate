<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
    </head>
    <body>

        <div id="principal">
            <h2>Listado de profesores</h2>




            <dl>
                <c:forEach var="item" items="${listado}">


                    <dt>${item.nombre}</dt>
                    <dd>
                        Libros ${item.libro.calle}, ${item.libro.numero} - ${item.libro.poblacion}
                        <c:forEach var="listaLibro" items="${item.libro}">
                            <c:out value="${listaLibro}"/>
                        </c:forEach>
                    </dd>

                </c:forEach>
            </dl>
            <br />
            <p><a href="${contexto}/" class="enlace">Men&uacute; inicial</a></p>
        </div>


    </body>
</html>