<%@page import = "java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Direccion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar bg-body-tertiary fixed-top position-relative">
        <div class="container-fluid">
          <a class="navbar-brand" href="../../index.jsp">
            <img src="../../assets/image/Logo.png" alt="Kinal-Shop Logo" style="height: 40px; margin-right: 25px;">
            KinalShop
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
                      <p class="nav-link active" aria-current="page">Elija una opción</p>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="../../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../direccion.jsp">Direcciones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="formulario-Direcciones.jsp">Formulario Direcciones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../../direccion-servlet">Listar Direcciones</a>
                    </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Opciones</a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="../clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="../categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="../distribuidor/distribuidor.jsp">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="../facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="../pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="../ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="../promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="../productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="../productos-masculinos/producto-masculinos.jsp">Productos Masculinos</a></li>
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
        <% ArrayList<String> direccion = (ArrayList)request.getAttribute("direccion"); %>
            
        <%  if(request.getAttribute("mensaje") != null){%>
            <h3 class="text-center mt-5 mb-5"><%= request.getAttribute("mensaje")%></h3>
            <%}
        %>
            
        <%  if(direccion != null){
                for(String dir:direccion){%>
                    <ul class="list-group container mb-3 w-50">
                        <li class="list-group-item list-group-item-warning text-center"><%=dir%></li>
                    </ul>
                <%}
            }
        %>
        </div>
        <div class="container mt-5 w-75">
            <form action="/KinalShop/direccion-servlet" method="post" enctype="multipart/form-data" onsubmit="return validarFormulario()">
                <div class="form-floating mb-4">
                    <input type="text" class="form-control" id="calle" name="calle" placeholder="">
                    <label for="calle">Calle</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="text" class="form-control" id="avenida" name="avenida" placeholder="">
                    <label for="avenida">Avenida</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="text" class="form-control" id="numeroCasa" name="numeroCasa" placeholder="">
                    <label for="numeroCasa">Numero de Casa</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="number" class="form-control" id="ciudadId" name="ciudadId" placeholder="">
                    <label for="ciudadId">Ingrese el Id de la Ciudad</label>
                </div>
                <div>
                    <input class="btn btn-success position-relative" type="submit" value="Agregar">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
            function validarFormulario() {
                const calle = document.getElementById('calle').value.trim();
                const avenida = document.getElementById('avenida').value.trim();
                const numeroCasa = document.getElementById('numeroCasa').value.trim();
                const ciudadId = document.getElementById('ciudadId').value.trim();

                if (!calle || !avenida || !numeroCasa || !ciudadId) {
                    alert('Algunos campos aún no están llenos, favor de verificar.');
                    return false;
                }
                
                if (isNaN(ciudadId)) {
                    alert('Por favor, ingrese valores numéricos válidos en los campos correspondientes.');
                    return false;
                }
                
                return true;
            }
        </script>
    </body>
</html>