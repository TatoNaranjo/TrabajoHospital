<%-- 
    Document   : Datos
    Created on : 29/09/2022, 8:24:15 a. m.
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Pacientes HOSPITAL SAN RAFAEL</title>
    </head>
    <body>
        <%@ page import = "hospital.Hospital1" %>
        <%@ page import = "hospital.IImprimir" %>
       <%@ page import = "hospital.ListaClientes" %>
       <%
            IImprimir sanRafael = new Hospital1();    
       %>
       <p>Lista: </p>
       <br>
       <p><%= sanRafael.impresion() %></p>
    </body>
</html>
