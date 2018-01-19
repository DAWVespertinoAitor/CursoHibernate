<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
    </head>
    <body>

        <div id="principal">
            <h2>Entrada de datos</h2>
            <form method="post" action="control?op=add" id="1">
            <table>
                <tr>
                    <td><b>Datos Persona</b></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre" /></td>
                </tr>
                <tr>
                    <td>Libro 1</td>
                    <td><input type="text" name="libro1"/></td>
                </tr>
                <tr>
                    <td>Libro 2</td>
                    <td><input type="text" name="libro2"/></td>
                </tr>
                <tr>
                    <td>Libro 3</td>
                    <td><input type="text" name="libro3"/></td>
                </tr>
                <!--<input type="hidden" name="idDirec" value="1" />-->
                <tr>
                    <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="boton" /></td>
                </tr>
            </table>
        </form>
        </div>


    </body>
</html>