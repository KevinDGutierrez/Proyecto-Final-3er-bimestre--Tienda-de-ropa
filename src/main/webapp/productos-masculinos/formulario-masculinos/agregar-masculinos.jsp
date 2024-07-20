<%@page import = "java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Masculino</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    </head>
    <body>
        <nav class="position-relative navbar navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="../../index.jsp">
                    <img src="../../assets/image/Logo.png" alt="Kinal-Shop Logo" style="height: 40px; margin-right: 25px;">
                    KinalShop
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end bg-dark" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
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
                                <a class="nav-link" aria-current="page" href="../producto-masculinos.jsp">Producto Masculinos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" href="agregar-masculinos.jsp">Formulario Masculinos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" aria-current="page" href="../../masculino-servlet">Lista Masculinos</a>
                            </li>
                            </ul>
                            </div>
                            </div>
                            </nav>
                            <div class="container mt-5 w-75">
                                <% ArrayList<String> masculino = (ArrayList)request.getAttribute("masculino"); %>

                                <%
                                    if(masculino != null) {
                                        for(String ct:masculino){%>
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

                            <div class="container-floating mt-5 w-75">
                                <form action="/KinalShop/masculino-servlet" method="post" enctype="multipart/form-data" onsubmit="validarFormularioMasculino(event)">
                                    <div class="form-floating mb-4">
                                        <input class="form-control" id="nombreProducto" name="nombreProducto" type="text">
                                        <label for="nombre">Nombre del producto Masculino</label>
                                    </div>
                                    <div class="form-floating mb-4">
                                        <textarea class="form-control" id="precioCompra" name="precioCompra" placeholder=""></textarea>
                                        <label for="apellido">Precio del Producto Masculino</label>
                                    </div>
                                    <div class="form-floating mb-4">
                                        <textarea class="form-control" id="descripcionProducto" name="descripcionProducto" placeholder=""></textarea>
                                        <label for="direccionId">Descripcion del Producto Masculino</label>
                                    </div>
                                    <div class="form-floating mb-4">
                                        <textarea class="form-control" id="cantidadStock" name="cantidadStock" placeholder=""></textarea>
                                        <label for="direccionId">Cantidad de Stock</label>
                                    </div>
                    <div class="form-floating mb-4">
                        <textarea class="form-control" id="precioVentaUnitario" name="precioVentaUnitario" placeholder=""></textarea>
                        <label for="direccionId">Precio de Venta Unitario</label>
                    </div>
                    <div class="form-floating mb-4">
                        <textarea class="form-control" id="distribuidorId" name="distribuidorId" placeholder=""></textarea>
                        <label for="direccionId">ID del Distribuidor</label>
                    </div>
                    <div class="form-floating mb-4">
                        <textarea class="form-control" id="categoriaproductoId" name="categoriaproductoId" placeholder=""></textarea>
                        <label for="direccionId">ID de la Categoria del Producto</label>
                    </div>
                    <div>
                        <input class="btn btn-outline-success" type="submit" value="Agregar Producto Masculino">
                    </div>
                </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
            function validarFormularioMasculino(event) {
            const nombreProducto = document.getElementById('nombreProducto').value.trim();
            const precioCompra = document.getElementById('precioCompra').value.trim();
            const descripcionProducto = document.getElementById('descripcionProducto').value.trim();
            const cantidadStock = document.getElementById('cantidadStock').value.trim();
            const precioVentaUnitario = document.getElementById('precioVentaUnitario').value.trim();
            const distribuidorId = document.getElementById('distribuidorId').value.trim();
            const categoriaproductoId = document.getElementById('categoriaproductoId').value.trim();

            if (nombreProducto === '' || precioCompra === ''|| descripcionProducto === ''|| cantidadStock === ''|| precioVentaUnitario === ''|| distribuidorId === ''|| categoriaproductoId === '') {
                alert('Campo Incompleto por favor llenarlo');
                event.preventDefault(); 
            }
        }
        </script>
    </body>
</html>