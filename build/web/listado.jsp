<%-- 
    Document   : listado
    Created on : 10/01/2024
    Author     : moniguar
--%>
<%@page import="DTO.Bloquecito"%>
<%@page import="java.util.ArrayList"%>

<!-- Página JSP para mostrar el resultado: resultado.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de datos almacenados</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class="row">
  <div class="col">
      <img src="images/logo.jpg">
  </div>
</div>

<div class="row">
  <div class="col">
    <h2>Listado de los datos almacenados</h2>
    <div>
       
 
    <table border="1" class="table" >
        <tr class="table-active">
            <th>Id</th>
            <th>Palabra</th>
            <th>Resultado</th>
            <th>Fecha</th>
            
        </tr>
        
        <%
      HttpSession session2 = request.getSession();
            
      ArrayList<Bloquecito> lista = (ArrayList<Bloquecito>)session2.getAttribute("list");
    
      for (Bloquecito e : lista) 
      {
        out.println("<tr>" +
                     "<td class='text-start'> "+e.getId()+"         </td>"+
                     "<td class='text-start'> "+e.getPalabra()+"    </td>"+
                     "<td class='text-start'> "+e.getResultado()+"  </td>"+
                     "<td class='text-start'> "+e.getFecha()+"      </td>"+
                   "</tr>");
      }
      %>
        
    </table>

    </div>
  </div>
</div>
        <BR>
    
<div class="row">

<form action="formulario.jsp" method="post">

  <div class="col-6" style="background-color: #ffffff">
        <button type="submit" class="btn btn-secondary">Regresar</button>
</div>
</form>
    
</div>

</body>
</html>
