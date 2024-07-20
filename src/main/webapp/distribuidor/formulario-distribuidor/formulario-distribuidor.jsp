<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">  
        <title>JSP Page</title>
        <script>
        function validarFormulario(event) {
            const nombre = document.getElementById('nombreDistribuidor').value.trim();
            const direccion = document.getElementById('direccionDistribuidor').value.trim();
            const nit = document.getElementById('nitDistribuidor').value.trim();
            const telefono = document.getElementById('telefonoDistribuidor').value.trim();
            const web = document.getElementById('web').value.trim();

            if (nombre === '' || direccion === '' || nit === '' || telefono === '' || web === '') {
                alert('Campo Incompleto por favor llenarlo');
                event.preventDefault(); // Prevenir el envío del formulario
            }
        }
    </script>
    </head>
    <body>
            <nav class="position-relative navbar navbar-dark bg-dark fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="../index.jsp">Formulario Distribuidores</a>
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
                  <a class="nav-link" aria-current="page" href="../cliente.jsp">Distribuidores</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="../formulario-distribuidor/formulario-distribuidor.jsp">Form Distribuidores</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../distribuidor-servlet">Lista Distribuidores</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
    </nav>
        <br>
        <br>
        <div class="container mt-5 w-75">
            <% ArrayList<String> distribuidor = (ArrayList)request.getAttribute("distribuidor"); %>
            
            <%
                if(distribuidor != null) {
                    for(String dt:distribuidor){%>
                    <ul class="list-group">
                        <li class="list-group-item list-group-item-primary" _msttexthash="1411449" _msthash="308"><%=dt%></li>
                    </ul>
                    <%}
                }
            %>
            
            <% if(request.getAttribute("mensaje") != null) {%>
            <dt class="col-sm-3" style="color: green;"><%= request.getAttribute("mensaje") %></p>
           <% } %> 
        </div>
        
    
        
        
    <div class="container-floating mt-5 w-75">
        <form action="/KinalShop/distribuidor-servlet" method="post" enctype="multipart/form-data" onsubmit="validarFormulario(event)">
            <div class="form-floating mb-4">
                <input class="form-control" id="nombreDistribuidor" name="nombreDistribuidor" type="text">
                <label for="nombreDistribuidor">Nombre del Distribuidor</label>
            </div>

            <div class="form-floating mb-4">
                <input class="form-control" id="direccionDistribuidor" name="direccionDistribuidor" type="text" placeholder="">
                <label for="direccionDistribuidor">Direccion del Distribuidor</label>
            </div>

            <div class="form-floating mb-4">
                <textarea class="form-control" id="nitDistribuidor" name="nitDistribuidor" placeholder=""></textarea>
                <label for="nitDistribuidor">Nit del Distribuidor</label>
            </div>

            <div class="form-floating mb-4">
                <input class="form-control" id="telefonoDistribuidor" name="telefonoDistribuidor" type="text" placeholder="">
                <label for="telefonoDistribuidor">Telefono del Distribuidor</label>
            </div>

            <div class="form-floating mb-4">
                <input class="form-control" id="web" name="web" type="text" placeholder="">
                <label for="web">Web del Distribuidor</label>
            </div>

            <div>
                <input class="btn btn-outline-success" type="submit" value="Agregar Distribuidor">
            </div>
        </form>
    </div>

    
 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
