<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">  
        <title>JSP Page</title>
    <script>
        function validarFormularioClientes(event) {
            const nombre = document.getElementById('nombre').value.trim();
            const apellido = document.getElementById('apellido').value.trim();
            const direccionId = document.getElementById('direccionId').value.trim();

            if (nombre === '' || apellido === '' || direccionId === '') {
                alert('Campo Incompleto por favor llenarlo');
                event.preventDefault(); 
            }
        }

    </script>    
    </head>
    <body>
            <nav class="position-relative navbar navbar-dark bg-dark fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="../index.jsp">Formulario Clientes</a>
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
                  <a class="nav-link" aria-current="page" href="../cliente.jsp">Clientes</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="../formulario-clientes/formulario-clientes.jsp">Form Clientes</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../cliente-servlet">Lista Clientes</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
    </nav>
        <br>
        <br>
        <div class="container mt-5 w-75">
                 <% ArrayList<Object> cliente = (ArrayList<Object>) request.getAttribute("cliente"); %>

                <% if (cliente != null) { 
                    for (Object client : cliente) { 
                        if (client instanceof String) { %>
                            <ul class="list-group">
                                <li class="list-group-item list-group-item-primary"><%= client %></li>
                            </ul>
                        <% } else if (client instanceof Integer) { %>
                            <ul class="list-group">
                                <li class="list-group-item list-group-item-primary"><%= client %></li>
                            </ul>
                        <% }
                    } 
                } %>

                <% if (request.getAttribute("mensaje") != null) { %>
                    <dt class="col-sm-3" style="color: green;"><%= request.getAttribute("mensaje") %></dt>
                <% } %>
</div>

        
    
        
        
    <div class="container-floating mt-5 w-75">
        <form action="/KinalShop/cliente-servlet" method="post" enctype="multipart/form-data" onsubmit="validarFormularioClientes(event)">
            <div class="form-floating mb-4">
                <input class="form-control" id="nombre" name="nombre" type="text">
                <label for="nombre">Nombre del Cliente</label>
            </div>
            <div class="form-floating mb-4">
                <textarea class="form-control" id="apellido" name="apellido" placeholder=""></textarea>
                <label for="apellido">Apellido del Cliente</label>
            </div>
            <div class="form-floating mb-4">
                <textarea class="form-control" id="direccionId" name="direccionId" placeholder=""></textarea>
                <label for="direccionId">Direccion Id del Cliente</label>
            </div>
            <div>
                <input class="btn btn-outline-success" type="submit" value="Agregar Cliente">
            </div>
        </form>
    </div>

    
 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
