<%-- 
    Document   : resultado
    Created on : 10/01/2024, 5:31:29 p. m.
    Author     : moniguar
--%>

<!-- Página JSP para mostrar el resultado: resultado.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado de Consulta</title>
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
  <div class="col" style="background-color: #00B2B2">
    <h2>Palabra de Consulta: <%= session.getAttribute("palabra") %></h2>
    <div>
        <p><h3><font color="red">Resultado : <%= session.getAttribute("bloques") %></font></h3></p>

    </div>
  </div>
</div>
        <BR>
    
<div class="row">
<form action="formulario.jsp" method="post">

  <div class="col-6" style="background-color: #ffffff">
        <button type="submit" class="btn btn-primary">Regresar</button>
</div>
</form>
<form action="ListadoServlet" method="post">

    <div class="col-12" style="background-color: #ffffff">
        <button type="submit" class="btn btn-secondary">Ver Datos</button>
</div>
</form>
</div>

</body>
</html>

</html>
