<%-- 
    Document   : index
    Created on : 02/04/2015, 23:47:12
    Author     : Neuschwanstein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta elecciones presidenciales 2015</title>
    </head>
    <body>
        <form action="ServletEncuestaPresidencial" method="POST">
        <table border="1">
            
            
                <tr>
                    <td colspan="2">Encuesta</td>
                   
                </tr>
                <tr>
                    <td colspan="2">Seleccione el candidato a votar</td>
                    
                </tr>
                <tr>
                    <td><input type="radio" name="opcion" value="1" />Daniel Scioli</td>
                    <td>Frente para la Victoria</td>
                </tr>
                <tr>
                    <td><input type="radio" name="opcion" value="2" />Mauricio Macri</td>
                    <td>PRO</td>
                </tr>
                <tr>
                    <td><input type="radio" name="opcion" value="3" />Sergio Massa</td>
                    <td>Frente Renovador</td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Enviar" /></td>
                </tr>
        </table>
        </form>
    </body>
</html>
