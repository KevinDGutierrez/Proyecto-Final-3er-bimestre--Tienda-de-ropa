<%-- 
    Document   : formulario-pedidos
    Created on : 16/07/2024, 17:49:21
    Author     : kevin
--%>
<<<<<<< HEAD

=======
<%@page import="java.util.ArrayList"%>
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Formulario Pedido</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    
    <body>
<<<<<<< HEAD
        <nav class="navbar navbar-dark bg-danger fixed-top">
=======
        <nav class="navbar navbar-dark bg-danger fixed-top position-relative">
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
            <div class="container-fluid">
              <a class="navbar-brand" href="../../index.jsp">
                <img src="../../assets/image/KinalShopLogoClaro.png" alt="KinalShop Logo" class="img-fluid" style="height: 60px;">
                KinalShop
              </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="offcanvas offcanvas-end text-bg-danger" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                <div class="offcanvas-header">
                  <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Menú</h5>
                  <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div class="offcanvas-body">
                  <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                      <p class="nav-link active" aria-current="page">Elija una opción</p>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="../../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../inicio-pedidos/inicio-pedidos.jsp">Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="./formulario-pedidos.jsp">Formulario Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../../pedido-servlet">Lista Pedidos</a>
                    </li>
                     <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                          Opciones
                        </a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="../../direccion/direccion.jsp">Direcciones</a></li>
                        <li><a class="dropdown-item" href="../../categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="../../distribuidor/distribuidor.jsp">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="../../facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="../../ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="../../clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="../../promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="../../productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="../../productos-masculinos/producto-masculinos.jsp">Productos Masculinos</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                    </ul>
                  </li>
                </ul>
                </div>
              </div>
            </div>
        </nav>
<<<<<<< HEAD
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
=======
        <div>
            <% ArrayList<String> pedido = (ArrayList)request.getAttribute("pedido"); %>
            
            <%  if(request.getAttribute("mensaje") != null){%>
                <h3 class="text-center mt-5 mb-5"><%= request.getAttribute("mensaje")%></h3>
                <%}
            %>
            
            <%  if(pedido != null){
                    for(String ped:pedido){%>
                        <ul class="list-group container mb-3 w-50">
                            <li class="list-group-item list-group-item-warning text-center"><%=ped%></li>
                        </ul>
                    <%}
                }
            %>
        </div>
        <div class="container mt-5 w-75">
            <form action="/KinalShop/pedido-servlet" method="post" enctype="multipart/form-data" onsubmit="return validarFormulario()">
                <div class="form-floating mb-4">
                    <input type="number" class="form-control" id="clienteId" name="clienteId" placeholder="">
                    <label for="clienteId">Ingresar el Id del Cliente</label>
                </div>
                <div class="form-floating mb-4">
                    <input class="form-control" id="fecha" name="fecha" type="date" placeholder="">
                    <label for="fecha">Fecha del Pedido</label>
                </div>
                <div class="form-floating mb-4">
                    <input class="form-control" id="hora" name="hora" type="time" placeholder="">
                    <label for="hora">Hora del Pedido</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="number" class="form-control" id="direccionId" name="direccionId" placeholder="">
                    <label for="direccionId">Ingresar el Id de la Direccion</label>
                </div>
                <div class="input-group mb-4">
                    <span class="input-group-text">Q</span>
                    <input type="text" class="form-control" id="total" name="total">
                    <span class="input-group-text">.00</span>
                </div>
                <div>
                    <input class="btn btn-success position-relative" type="submit" value="Agregar">
                </div>
                <a href="../../detalles-pedidos/formulario-detalles-pedidos/formulario-detalles-pedidos.jsp"><button class="btn btn-danger" type="button">Agregar DetallePedido</button></a>
            </form>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>
        function validarFormulario() {
            const clienteId = document.getElementById('clienteId').value.trim();
            const fecha = document.getElementById('fecha').value;
            const hora = document.getElementById('hora').value;
            const total = document.getElementById('total').value.trim();
            const direccionId = document.getElementById('direccionId').value.trim();

            if (!clienteId || !fecha || !hora || !total || !direccionId) {
                alert('Algunos campos aún no están llenos, favor de verificar.');
                return false;
            }

            if (isNaN(clienteId) || isNaN(total) || isNaN(direccionId)) {
                alert('Por favor ingrese valores numéricos válidos en los campos correspondientes.');
                return false;
            }

            return true;
        }
    </script>
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    </body>
</html>
