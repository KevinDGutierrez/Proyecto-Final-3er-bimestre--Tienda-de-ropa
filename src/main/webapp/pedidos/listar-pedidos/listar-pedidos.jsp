<%-- 
    Document   : listar-pedidos
    Created on : 16/07/2024, 17:50:04
    Author     : kevin
--%>
<%@page import="java.util.List"%>
<%@page import="org.kevingutierrez.webapp.model.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Lista Pedidos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    
    <body>
        <nav class="navbar navbar-dark bg-danger fixed-top position-relative">
            <div class="container-fluid">
              <a class="navbar-brand" href="index.jsp">
                <img src="assets/image/KinalShopLogoClaro.png" alt="KinalShop Logo" class="img-fluid" style="height: 60px;">
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
                      <a class="nav-link" href="index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="pedidos/formulario-pedidos/formulario-pedidos.jsp">Formulario Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="./pedido-servlet">Lista Pedidos</a>
                    </li>
                     <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                          Opciones
                        </a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="direccion/direccion.jsp">Direcciones</a></li>
                        <li><a class="dropdown-item" href="categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="distribuidor/distribuidor.jsp">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="productos-masculinos/producto-masculinos.jsp">Productos Masculinos</a></li>
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
        <div class="container mt-5">
            <table class="table" border="2px">
                <thead>
                    <tr>
                        <th class="text-center text-bg-dark text-danger" scope="col">#</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Cliente</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Fecha</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Hora</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Total</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Direccion</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Pedido> pedidos = (List)request.getAttribute("pedidos"); %>
                    <% 
                        for(Pedido pedido:pedidos){ %>
                        <tr>
                            <th class="text-center text-bg-dark text-danger" scope="row"><%=pedido.getPedidoId()%></th>
                            <th class="text-center text-bg-secondary text-light" scope="row"><%=pedido.getClienteId()%></th>
                            <th class="text-center text-bg-secondary text-light" scope="row"><%=pedido.getFecha()%></th>
                            <th class="text-center text-bg-secondary text-light" scope="row"><%=pedido.getHora()%></th>
                            <th class="text-center text-bg-secondary text-light" scope="row"><%=pedido.getTotal()%></th>
                            <th class="text-center text-bg-secondary text-light" scope="row"><%=pedido.getDireccionId()%></th>
                        </tr>
                        <% }
                    %>
                </tbody>
            </table>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
