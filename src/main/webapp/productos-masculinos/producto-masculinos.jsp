<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto Masculino</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
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
                        <a class="nav-link active" href="producto-masculinos.jsp">Productos Maculinos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="formulario-masculinos/agregar-masculinos.jsp">Formulario Productos Masculinos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../masculino-servlet">Listar Productos Masculinos</a>
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
                        <li><a class="dropdown-item" href="../productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a></li>
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
    <div id="carouselExampleCaptions" class="carousel slide">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="../assets/image/InicioProductoMasculino1.png" class="d-block w-100" alt="Ciudad1">
                </div>
            <div class="carousel-item">
                <img src="../assets/image/InicioProductoMasculino2.png" class="d-block w-100" alt="Ciudad2">
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>