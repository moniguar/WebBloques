<!-- Página JSP para el formulario: formulario.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Consulta de Usuario</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
  <div class="col">
      <img src="images/logo.jpg">
  </div>
</div>
<div class="row" style="background-color:#CCC">
  <div class="col" >
    <h2>Prueba de Selección: Prueba de los Bloques</h2><h3>Objetivo</h3>
      Escribe una función en java que tome una palabra (String) y determine si la palabra se puede escribir con la colección de bloques dada.<br>
      </h3>
    </div>
</div>
<div class="row">
<div class="col" style="background-color: #00B2B2">
    <h2>Digita la palabra para encontrar el resultado</h2>
    <form action="ConsultaServlet" method="post">
        <div class="form-group">
            <label for="userId">Palabra: <small>(Máximo 20 carácteres)</small></label>
            <input type="text" class="form-control" id="palabra" name="palabra" required max="20" maxlength="20">
        </div>
        <button type="submit" class="btn btn-primary">Consultar</button>
        <% if (request.getParameter("error") != null) { %>
            <p class="text-danger"><%= request.getParameter("error") %></p>
        <% } %>
    </form>
</div>

</body>
</html>
