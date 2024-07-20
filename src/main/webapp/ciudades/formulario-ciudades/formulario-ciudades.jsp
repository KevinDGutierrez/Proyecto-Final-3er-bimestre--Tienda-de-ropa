<%-- 
    Document   : formulario-ciudades
    Created on : 16/07/2024, 15:58:17
    Author     : kevin
--%>
<%@page import = "java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Formulario Ciudades</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-info fixed-top position-relative">
            <div class="container-fluid">
              <a class="navbar-brand" href="../../index.jsp">
                <img src="../../assets/image/KinalShopLogo.png" alt="KinalShop Logo" class="img-fluid" style="height: 60px;">
                KinalShop
              </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="offcanvas offcanvas-end text-bg-info" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
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
                        <a class="nav-link" href="../inicio-ciudades/inicio-ciudades.jsp">Ciudades</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="./formulario-ciudades.jsp">Formulario Ciudades</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../../ciudad-servlet">Lista Ciudades</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Opciones</a>
                        <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="../../direccion/direccion.jsp">Direcciones</a></li>
                        <li><a class="dropdown-item" href="../../categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="../../distribuidor/distribuidor.jsp">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="../../facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="../../pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
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
        <div>
            <% ArrayList<String> ciudad = (ArrayList)request.getAttribute("ciudad"); %>
            
            <%  if(request.getAttribute("mensaje") != null){%>
                <h3 class="text-center mt-5 mb-5"><%= request.getAttribute("mensaje")%></h3>
                <%}
            %>
            
            <%  if(ciudad != null){
                    for(String cid:ciudad){%>
                        <ul class="list-group container mb-3 w-50">
                            <li class="list-group-item list-group-item-warning text-center"><%=cid%></li>
                        </ul>
                    <%}
                }
            %>
        </div>
        <div class="container mt-5 w-75">
            <form action="/KinalShop/ciudad-servlet" method="post" enctype="multipart/form-data" onsubmit="return validarFormulario()">
                <div class="form-floating mb-4">
                    <input type="text" class="form-control" id="nombreCiudad" name="nombreCiudad" placeholder="">
                    <label for="nombreCiudad">Nombre Ciudad</label>
                </div>
                <div>
                    <input class="btn btn-success position-relative" type="submit" value="Agregar">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
            function validarFormulario() {
                const nombreCiudad = document.getElementById('nombreCiudad').value.trim();

                if (!nombreCiudad) {
                    alert('Algunos campos aún no están llenos, favor de verificar.');
                    return false;
                }
                
                return true;
            }
        </script>
    </body>
</html>
