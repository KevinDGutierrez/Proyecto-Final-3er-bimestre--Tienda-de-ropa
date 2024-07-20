<%-- 
    Document   : formulario-promociones
    Created on : 16/07/2024, 17:57:03
    Author     : kevin
--%>
<%@page import = "java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Formulario Promociones</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    
    <body>
        <nav class="navbar navbar-dark bg-warning fixed-top position-relative">
            <div class="container-fluid">
              <a class="navbar-brand" href="../../index.jsp">
                <img src="../../assets/image/KinalShopLogo.png" alt="KinalShop Logo" class="img-fluid" style="height: 60px;">
                KinalShop
              </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="offcanvas offcanvas-end text-bg-warning" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
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
                        <a class="nav-link" href="../inicio-promociones/inicio-promociones.jsp">Promociones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="./formulario-promociones.jsp">Formulario Promociones</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./promocion-servlet">Lista Promociones</a>
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
                        <li><a class="dropdown-item" href="../../pedidos/inicio-pedidos/inicio-pedidos.jsp">Pedidos</a></li>
                        <li><a class="dropdown-item" href="../../productos-femeninos/productos-femenino.jsp">Productos Femeninos</a></li>
                        <li><a class="dropdown-item" href="../../productos-masculino/producto-masculino.jsp">Productos Masculinos</a></li>
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
            <% ArrayList<String> promocion = (ArrayList)request.getAttribute("promocion"); %>
            
            <%  if(request.getAttribute("mensaje") != null){%>
                <h3 class="text-center mt-5 mb-5"><%= request.getAttribute("mensaje")%></h3>
                <%}
            %>
            
            <%  if(promocion != null){
                for(String prom:promocion){%>
                        <ol class="list-group container mb-3 w-25">
                            <li class="list-group-item list-group-item-warning text-center"><%=prom%></li>
                        </ol>
                    <%}
                }
            %>
        </div>
        <div class="container mt-5 w-75">
            <form id="promocionForm" action="/KinalShop/promocion-servlet" method="post" enctype="multipart/form-data" onsubmit="return validarFormulario()">
                
                <div class="input-group mb-4">
                    <span class="input-group-text">Q</span>
                    <input type="text" class="form-control" id="precioPromocion" name="precioPromocion">
                    <span class="input-group-text">.00</span>
                </div>
                <div class="form-floating mb-4">
                    <textarea class="form-control" id="descripcionPromocion" name="descripcionPromocion" placeholder=""></textarea>
                    <label for="descripcionPromocion">Descripción</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="date" class="form-control" id="fechaInicio" name="fechaInicio" placeholder="">
                    <label for="fechaInicio">Fecha de Inicio</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="date" class="form-control" id="fechaFinalizacion" name="fechaFinalizacion" placeholder="">
                    <label for="fechaFinalizacion">Fecha final</label>
                </div>
                <div>
                    <div class="form-floating mb-4">
                    <input type="number" class="form-control" id="productoFemeninoId" name="productoFemeninoId" placeholder="">
                    <label for="productoFemeninoId">Producto femenino</label>
                </div>
                <div>
                    <div class="form-floating mb-4">
                    <input type="number" class="form-control" id="productoMasculinoId" name="productoMasculinoId" placeholder="">
                    <label for="productoMasculinoId">Producto Masculino</label>
                </div>
                    <input class="btn btn-success" type="submit" value="Agregar">
                </div>
            </form>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>
        function validarFormulario() {
            const precioPromocion = document.getElementById('precioPromocion').value.trim();
            const descripcionPromocion = document.getElementById('descripcionPromocion').value.trim();
            const fechaInicio = document.getElementById('fechaInicio').value;
            const fechaFinalizacion = document.getElementById('fechaFinalizacion').value;
            const productoFemeninoId = document.getElementById('productoFemeninoId').value.trim();
            const productoMasculinoId = document.getElementById('productoMasculinoId').value.trim();

            if (!precioPromocion || !descripcionPromocion || !fechaInicio || !fechaFinalizacion || !productoFemeninoId || !productoMasculinoId) {
                alert('Por favor, complete todos los campos.');
                return false;
            }

            if (isNaN(precioPromocion) || isNaN(productoFemeninoId) || isNaN(productoMasculinoId)) {
                alert('Por favor, ingrese valores numéricos válidos en los campos correspondientes.');
                return false;
            }

            return true;
        }
    </script>
    </body>
</html>
