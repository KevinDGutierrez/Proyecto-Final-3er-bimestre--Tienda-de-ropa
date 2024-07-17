<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>KinalShop</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    
    <body>
        <nav class="navbar navbar-dark bg-info fixed-top">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">
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
                      <a class="nav-link active" aria-current="page" href="#">Elija una opción</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="../../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./inicio-ciudades.jsp">Ciudades</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../formulario-ciudades/formulario-ciudades.jsp">formulario Ciudades</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../listar-ciudades/listar-ciudades.jsp">listar Ciudades</a>
                    </li>
                     <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                          Opciones
                        </a>
                    <ul class="dropdown-menu dropdown-menu-dark">
                        <li><a class="dropdown-item" href="">Direcciones</a></li>
                        <li><a class="dropdown-item" href="">Clientes</a></li>
                        <li><a class="dropdown-item" href="">Distribuidores</a></li>
                        <li><a class="dropdown-item" href="">Categoria Productos</a></li>
                        <li><a class="dropdown-item" href="./facturas/inicio-factura/inicio-factura.jsp">Facturas</a></li>
                        <li><a class="dropdown-item" href="./promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a></li>
                        <li><a class="dropdown-item" href="./pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="">Usuarios</a></li>
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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
