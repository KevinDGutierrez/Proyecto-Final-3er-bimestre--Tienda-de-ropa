<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto Femenino</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script>
            function validarFormularioCategoria(event) {
            const nombreProducto = document.getElementById('nombreProducto').value.trim();
            const precioCompra = document.getElementById('precioCompra').value.trim();
            const descripcionProducto = document.getElementById('descripcionProducto').value.trim();
            const cantidadStock = document.getElementById('cantidadStock').value.trim();
            const precioVentaUnitario = document.getElementById('precioVentaUnitario').value.trim();
            const distribuidorId = document.getElementById('distribuidorId').value.trim();
            const categoriaproductoId = document.getElementById('categoriaproductoId').value.trim();

            if (nombreProducto === '' || precioCompra === ''|| descripcionProducto === '' || cantidadStock === ''|| precioVentaUnitario === ''|| distribuidorId === ''|| categoriaproductoId === '') {
                alert('Campo Incompleto por favor llenarlo');
                event.preventDefault(); 
            }
        }
        </script>
    </head>
    <body>
        <nav class="navbar bg-body-tertiary fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="../index.jsp">
            <img src="../assets/image/Logo.png" alt="Kinal-Shop Logo" style="height: 40px; margin-right: 25px;">
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
                      <a class="nav-link" href="../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="productos-femeninos.jsp">Productos Femeninos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Formulario Productos Femeninos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../femenino-servlet">Listar Productos Femeninos</a>
                    </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Opciones</a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="../clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="../categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="../direccion/direccion.jsp">Direcciones</a></li>
                        <li><a class="dropdown-item" href="../facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="../pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="../ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="../promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="../distribuidor/distribuidor.jsp">Distribuidores</a></li>
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
        <br>
        <br>
        <div class="container mt-5 w-75">
            <% ArrayList<String> femenino = (ArrayList)request.getAttribute("femenino"); %>
            
            <%
                if(femenino != null) {
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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>