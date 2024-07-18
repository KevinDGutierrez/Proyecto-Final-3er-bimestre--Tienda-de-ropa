<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.alejandrocuxun.webapp.model.Direcciones"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Direccion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    </head>
    <body>
        <nav class="navbar bg-body-tertiary fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="../../assets/image/Logo.png" alt="Kinal-Shop Logo" style="height: 40px; margin-right: 25px;">
          </a>
          <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
            <div class="offcanvas-header">
              <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Menu</h5>
              <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Elija una opción</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="direccion.jsp">Direccion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="formulario-direccion/formulario-direccion.jsp">Formulario Direccion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="../../direccion-servlet">Lista Direccion</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Opciones</a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="../categoria-productos/categoria-productos.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="../clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="../distribuidor/distribuidor.jsp">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="../facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="../pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="../ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="../promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="../productos-femeninos/productos-femenino.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="../productos-masculino/producto-masculino.jsp">Productos Masculinos</a></li>
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
                        <th class="text-center text-bg-dark text-danger" scope="col">Id</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Calle</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Avenida</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Numero Casa</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Ciudad Id</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Direcciones> direcciones = (List)request.getAttribute("direcciones"); %>
                    <% 
                        for(Direcciones direccion:direcciones){ %>
                            <tr>
                                <th class="text-center text-bg-dark text-danger" scope="row"><%=direccion.getDireccionId()%></th>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=direccion.getCalle()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=direccion.getAvenida()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=direccion.getNumeroCasa()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=direccion.getCiudadId()%></td>
                            </tr>
                        <% }
                    %>
                </tbody>
                
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>