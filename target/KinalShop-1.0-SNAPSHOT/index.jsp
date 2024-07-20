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
        <nav class="navbar navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
              <a class="navbar-brand" href="index.jsp">
                <img src="assets/image/KinalShopLogoClaro.png" alt="KinalShop Logo" class="img-fluid" style="height: 60px;">
                KinalShop
              </a>
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
                      <a class="nav-link active" aria-current="page">Elija una opción</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link active" href="./index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./ciudades/inicio-ciudades/inicio-ciudades.jsp">Ciudades</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./direccion/direccion.jsp">Direcciones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="clientes/cliente.jsp">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="distribuidor/distribuidor.jsp">Distribuidores</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="categoria-productos/categoria-producto.jsp">CategoriaProductos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./facturas/inicio-factura/inicio-factura.jsp">Facturas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./promociones/inicio-promociones/inicio-promociones.jsp">Promociones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="productos-femeninos/productos-femeninos.jsp">Productos Femeninos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="productos-masculinos/producto-masculinos.jsp">Productos Masculinos</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
        </nav>
        
        <div class="position-relative mt-5 pt-5">
            <div class="row">
                <div class="col-md-5">
                    <div class="card" style="width: 18rem;">
                        <img src="assets/image/KinalLogoInicio.jpg" class="card-img-top" alt="Logo Inicio">
                        <div class="card-body">
                            <h1 class="card-title">"Vístete con Confianza, Brilla con Estilo"</h1>
                            <h2>¿Quiénes Somos?</h2>
                            <p>
                              Bienvenidos a <strong>KinalShop</strong>, tu destino ideal para encontrar ropa que refleja tu esencia y personalidad. Somos una tienda de ropa apasionada por la moda y comprometida con la calidad, el estilo y la satisfacción de nuestros clientes.
                            </p>
                            <p>
                                Nuestra historia comienza en 2010, cuando un grupo de amigos apasionados por la moda y el diseño decidió convertir su amor por la ropa en un proyecto que pudiera hacer la diferencia. Con un pequeño local en el corazón de la ciudad, iniciamos nuestra travesía con la visión de ofrecer prendas únicas que no solo siguieran las últimas tendencias, sino que también permitieran a cada cliente expresar su individualidad.
                            </p>
                            <p>
                                En <strong>KinalShop</strong>, creemos que la moda es una forma de arte y autoexpresión. Cada prenda en nuestra tienda es cuidadosamente seleccionada, poniendo énfasis en la calidad de los materiales, la atención al detalle y la autenticidad del diseño. Trabajamos con diseñadores locales e internacionales para traerte lo mejor de ambos mundos, siempre buscando piezas que resalten y hagan sentir especial a quien las lleve puestas.
                            </p>
                            <p>
                                Nos enorgullecemos de nuestro servicio al cliente, y nos esforzamos por crear una experiencia de compra única y personalizada. Nuestro equipo está siempre listo para ayudarte a encontrar el outfit perfecto, ofreciendo asesoría de estilo y recomendaciones basadas en tus preferencias y necesidades.
                            </p>
                            <p>
                                En <strong>KinalShop</strong>, no solo vendemos ropa, sino que creamos experiencias y construimos relaciones. Nuestro objetivo es que cada cliente se sienta parte de nuestra familia y salga de nuestra tienda sintiéndose más seguro y empoderado.
                            </p>
                            <p>
                                Gracias por visitarnos y ser parte de nuestra historia. ¡Esperamos verte pronto y ayudarte a encontrar ese look que te hará brillar con confianza y estilo!
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-5">
                    <div id="carouselExampleIndicators" class="carousel slide">
                        <div class="carousel-indicators">
                          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        </div>
                        <div class="carousel-inner">
                          <div class="carousel-item active">
                              <a href="productos-masculino/producto-masculino.jsp">
                                <img src="assets/image/OufitHombreInicio.png" class="d-block w-100" alt="Hombre">
                                <div class="carousel-caption d-none d-md-block">
                                    <p>Haz clic en la imagen para saber más</p>
                                </div>
                            </a>
                          </div>
                          <div class="carousel-item">
                            <a href="productos-femeninos/productos-femenino.jsp">
                                <img src="assets/image/OufitMujerInicio.jpg" class="d-block w-100 h-60" alt="Mujer">
                                <div class="carousel-caption d-none d-md-block">
                                    <p>Haz clic en la imagen para saber más</p>
                                </div>
                            </a>
                          </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                          <span class="carousel-control-next-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Next</span>
                        </button>
                    </div>

                    <div id="carouselExampleIndicators2" class=" carousel slide mt-3 pt-5">
                        <div class="carousel-indicators">
                          <button type="button" data-bs-target="#carouselExampleIndicators2" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                          <button type="button" data-bs-target="#carouselExampleIndicators2" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        </div>
                        <div class="carousel-inner">
                          <div class="carousel-item active">
                              <a href="promociones/inicio-promociones/inicio-promociones.jsp">
                                <img src="assets/image/promocion1Inicio.png" class="d-block w-100" alt="Promocion1">
                                <div class="carousel-caption d-none d-md-block">
                                    <p>Haz clic en la imagen para saber más</p>
                                </div>
                            </a>
                          </div>
                          <div class="carousel-item">
                            <a href="promociones/inicio-promociones/inicio-promociones.jsp">
                                <img src="assets/image/Promocion2Inicio.png" class="d-block w-100 h-60" alt="Promocion2">
                                <div class="carousel-caption d-none d-md-block">
                                    <p>Haz clic en la imagen para saber más</p>
                                </div>
                            </a>
                          </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators2" data-bs-slide="prev">
                          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators2" data-bs-slide="next">
                          <span class="carousel-control-next-icon" aria-hidden="true"></span>
                          <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
