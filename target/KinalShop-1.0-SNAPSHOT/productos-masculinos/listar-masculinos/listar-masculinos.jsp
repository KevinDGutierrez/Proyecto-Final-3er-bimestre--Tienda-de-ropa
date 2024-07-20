<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.alejandrocuxun.webapp.model.ProductoMasculinos"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto Masculinos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    </head>
    <body>
        <nav class="navbar bg-body-tertiary fixed-top position-relative">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.jsp">
            <img src="assets/image/Logo.png" alt="Kinal-Shop Logo" style="height: 40px; margin-right: 25px;">
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
                    <a class="nav-link" href="index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="productos-masculinos/producto-masculinos.jsp">Producto Masculinos</a>
                </li>
                <li class="nav-item">
<<<<<<< HEAD
                    <a class="nav-link" href="#">Formulario Masculinos</a>
=======
                    <a class="nav-link" href="productos-masculinos/formulario-masculinos/agregar-masculinos.jsp">Formulario Masculinos</a>
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="masculino-servlet">Lista Masculinos</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Opciones</a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="categoria-productos/categoria-producto.jsp">Categorias Productos</a></li>
                        <li><a class="dropdown-item" href="clientes/cliente.jsp">Clientes</a></li>
                        <li><a class="dropdown-item" href="direccion/direccion.jsp">Direcciones</a></li>
                        <li><a class="dropdown-item" href="facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a></li>
                        <li><a class="dropdown-item" href="promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="distribuidor/distribuidor.jsp">Distribuidores</a></li>
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
                        <th class="text-center text-bg-dark text-danger" scope="col">Nombre</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Precio</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Descripcion</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Stock</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Precio</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Id Distribuidor</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Id Categoria</th>
                        <th class="text-center text-bg-dark text-danger" scope="col">Imagen</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<ProductoMasculinos> productoMasculinos = (List)request.getAttribute("productoMasculinos"); %>
                    <% 
                        for(ProductoMasculinos productoMasculino:productoMasculinos){ %>
                            <tr>
                                <th class="text-center text-bg-dark text-danger" scope="row"><%=productoMasculino.getProductoMasculinoId()%></th>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getNombreProducto()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getPrecioCompra()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getDescripcionProducto()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getCantidadStock()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getPrecioVentaUnitario()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getDistribuidorId()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getCategoriaproductoId()%></td>
                                <td class="text-center text-bg-secondary text-light" scope="row"><%=productoMasculino.getImagenProducto()%></td>
                            </tr>
                        <% }
                    %>
                </tbody>
                
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
