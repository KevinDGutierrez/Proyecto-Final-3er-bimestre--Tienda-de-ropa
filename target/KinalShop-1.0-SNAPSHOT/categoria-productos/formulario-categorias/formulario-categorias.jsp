<<<<<<< HEAD
<%-- 
    Document   : formulario-categorias
    Created on : 16/07/2024, 22:19:39
    Author     : alfar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
=======
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
=======
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">  
        <title>JSP Page</title>
        <script>
            function validarFormularioCategoria(event) {
            const nombreCategoria = document.getElementById('nombreCategoria').value.trim();
            const descripcionCategoria = document.getElementById('descripcionCategoria').value.trim();

            if (nombreCategoria === '' || descripcionCategoria === '') {
                alert('Campo Incompleto por favor llenarlo');
                event.preventDefault(); 
            }
        }
        </script>
        
        
     
    </head>
    <body>
            <nav class="position-relative navbar navbar-dark bg-dark fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="../index.jsp">Formulario Categoria Productos</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
            <div class="offcanvas-header">
              <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Menú</h5>
              <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
              <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                <li class="nav-item">
                  <a class="nav-link" aria-current="page" href="../../index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" aria-current="page" href="../distribuidor.jsp">Categoria Producto</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="../formulario-categorias/formulario-categorias.jsp">Form Categoria Productos</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../categoria-servlet">Lista Categoria Producto</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
    </nav>
        <br>
        <br>
        <div class="container mt-5 w-75">
            <% ArrayList<String> categoria = (ArrayList)request.getAttribute("categoria"); %>
            
            <%
                if(categoria != null) {
                    for(String ct:categoria){%>
                    <ul class="list-group">
                        <li class="list-group-item list-group-item-primary" _msttexthash="1411449" _msthash="308"><%=ct%></li>
                    </ul>
                    <%}
                }
            %>
            
            <% if(request.getAttribute("mensaje") != null) {%>
            <dt class="col-sm-3" style="color: green;"><%= request.getAttribute("mensaje") %></p>
           <% } %> 
        </div>
        
    
        
        
    <div class="container-floating mt-5 w-75">
        <form action="/KinalShop/categoria-servlet" method="post" enctype="multipart/form-data" onsubmit="validarFormularioCategoria(event)">
            <div class="form-floating mb-4">
                <input class="form-control" id="nombreCategoria" name="nombreCategoria" type="text">
                <label for="nombreCategoria">Nombre de la Categoria del Producto</label>
            </div>

            <div class="form-floating mb-4">
                <textarea class="form-control" id="descripcionCategoria" name="descripcionCategoria" placeholder=""></textarea>
                <label for="descripcionCategoria">Descripcion de la categoria del Producto</label>
            </div>
            <div>
                <input class="btn btn-outline-success" type="submit" value="Agregar Categoria del Producto">
            </div>
        </form>
    </div>

    
 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    </body>
</html>
