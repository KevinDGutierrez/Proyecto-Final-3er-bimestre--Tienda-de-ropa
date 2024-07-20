-- DROP DATABASE IF EXISTS TiendaDeRopa;

CREATE DATABASE IF NOT EXISTS TiendaDeRopa;
USE TiendaDeRopa;

CREATE TABLE  Ciudades(
    ciudadId INT NOT NULL AUTO_INCREMENT,
    nombreCiudad varchar(40) not null,
    PRIMARY KEY PK_ciudadId(ciudadId)
);
 
CREATE TABLE Direcciones(
    direccionId INT NOT NULL AUTO_INCREMENT,
    calle VARCHAR(20) NOT NULL,
    avenida VARCHAR(20) NOT NULL,
    numeroCasa VARCHAR(10) NOT NULL,
    ciudadId INT NOT NULL,
    PRIMARY KEY PK_direccionId(direccionId),
    CONSTRAINT FK_Direcciones_Ciudades FOREIGN KEY(ciudadId)
        REFERENCES Ciudades(ciudadId)
);
 
CREATE TABLE Clientes(
    clienteid INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    direccionId INT NOT NULL,
    PRIMARY KEY PK_clienteId (clienteId),
    CONSTRAINT FK_Clientes_Direcciones FOREIGN KEY(direccionId)
        REFERENCES Direcciones (direccionId)
);

CREATE TABLE CategoriaProductos(
    categoriaProductoId INT NOT NULL AUTO_INCREMENT,
    nombreCategoria VARCHAR(30) NOT NULL,
    descripcionCategoria VARCHAR(100) NOT NULL,
    PRIMARY KEY PK_categoriaProductoId (categoriaProductoId)
);

CREATE TABLE Distribuidores(
    distribuidorId INT NOT NULL AUTO_INCREMENT,
    nombreDistribuidor VARCHAR(30) NOT NULL,
    direccionDistribuidor VARCHAR(200) NOT NULL,
    nitDistribuidor VARCHAR(15) NOT NULL,
    telefonoDistribuidor VARCHAR(15) NOT NULL,
    web VARCHAR(50),
    PRIMARY KEY PK_distribuidorId (distribuidorId)
);

CREATE TABLE ProductosMasculinos(
    productoMasculinoId INT NOT NULL AUTO_INCREMENT,
    nombreProducto VARCHAR(50) NOT NULL,
    precioCompra DECIMAL(10,2),
    descripcionProducto VARCHAR(100),
    cantidadStock INT NOT NULL,
    precioVentaUnitario DECIMAL(10,2),
    imagenProducto LONGBLOB,
    distribuidorId INT NOT NULL,
    categoriaproductoId INT NOT NULL,
    PRIMARY KEY PK_productoMasculinoId (productoMasculinoId),
    CONSTRAINT FK_ProductosMasculinos_Distribuidores FOREIGN KEY (distribuidorId)
        REFERENCES Distribuidores(distribuidorId),
    CONSTRAINT FK_ProductosMasculinos_Categoriaproductos FOREIGN KEY (categoriaproductoId)
        REFERENCES CategoriaProductos(categoriaproductoId)
);


CREATE TABLE ProductosFemeninos(
    productoFemeninoId INT NOT NULL AUTO_INCREMENT,
    nombreProducto VARCHAR(50) NOT NULL,
    precioCompra DECIMAL(10,2),
    descripcionProducto VARCHAR(100),
    cantidadStock INT NOT NULL,
    precioVentaUnitario DECIMAL(10,2),
    imagenProducto LONGBLOB,
    distribuidorId INT NOT NULL,
    categoriaproductoId INT NOT NULL,
    PRIMARY KEY PK_productoFemeninoId (productoFemeninoId),
    CONSTRAINT FK_ProductosFemeninos_Distribuidores FOREIGN KEY (distribuidorId)
        REFERENCES Distribuidores(distribuidorId),
    CONSTRAINT FK_ProductosFemeninos_Categoriaproductos FOREIGN KEY (categoriaproductoId)
        REFERENCES CategoriaProductos(categoriaproductoId)
);



CREATE TABLE Facturas(
    facturaId INT NOT NULL AUTO_INCREMENT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    clienteId INT NOT NULL,
    total DECIMAL(10,2),
    productoFemeninoId INT NOT NULL,
    productoMasculinoId INT NOT NULL,
    PRIMARY KEY (facturaId),
    CONSTRAINT FK_Facturas_Clientes FOREIGN KEY (clienteId)
        REFERENCES Clientes(clienteId),
	CONSTRAINT FK_Facturas_ProductosFemeninos FOREIGN KEY (productoFemeninoId)
		REFERENCES ProductosFemeninos(productoFemeninoId),
	CONSTRAINT FK_Facturas_ProductosMasculinos FOREIGN KEY (productoMasculinoId)
		REFERENCES ProductosMasculinos(productoMasculinoId)
);

CREATE TABLE Promociones(
    promocionId INT NOT NULL AUTO_INCREMENT,
    precioPromocion DECIMAL(10,2) NOT NULL,
    descripcionPromocion VARCHAR(100),
    fechaInicio DATE NOT NULL,
    fechaFinalizacion DATE NOT NULL,
    productoFemeninoId INT NOT NULL,
    productoMasculinoId INT NOT NULL,
    PRIMARY KEY PK_promocionId (promocionId),
    CONSTRAINT FK_Promociones_ProductoFemeninos FOREIGN KEY (productoFemeninoId)
        REFERENCES ProductosFemeninos(productoFemeninoId),
	CONSTRAINT FK_Promociones_ProductoMasculinos FOREIGN KEY (productoMasculinoId)
		REFERENCES ProductosMasculinos(productoMasculinoId)
);

CREATE TABLE Pedidos (
    pedidoId INT NOT NULL AUTO_INCREMENT,
    clienteId INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    total DECIMAL(10, 2),
    direccionId INT NOT NULL,
    PRIMARY KEY PK_pedidoId(pedidoId),
    CONSTRAINT FK_Pedidos_Clientes FOREIGN KEY (clienteId) 
		REFERENCES Clientes(clienteId),
	CONSTRAINT FK_Pedidos_Direcciones FOREIGN KEY (direccionId)
		REFERENCES Direcciones(direccionId)
);

CREATE TABLE NivelesAcceso (
    nivelAccesoId INT NOT NULL AUTO_INCREMENT,
    nivelAcceso VARCHAR(40) NOT NULL,
    PRIMARY KEY (nivelAccesoId)
);


CREATE TABLE Usuarios (
    usuarioId INT NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(30) NOT NULL,
    contrasenia VARCHAR(100) NOT NULL,
    nivelAccesoId INT NOT NULL,
    PRIMARY KEY PK_(usuarioId),
    CONSTRAINT FK_Usuarios_NivelesAcceso FOREIGN KEY (nivelAccesoId)
        REFERENCES NivelesAcceso(nivelAccesoId)
);

CREATE TABLE DetalleFacturas(
	detalleFacturaId INT NOT NULL AUTO_INCREMENT,
    facturaId INT NOT NULL,
    productoFemeninoId INT NOT NULL,
    productoMasculinoId INT NOT NULL,
    PRIMARY KEY PK_detalleFacturaId(detalleFacturaId),
    CONSTRAINT FK_DetalleFacturas_Facturas FOREIGN KEY DetalleFacturas(facturaId)
		REFERENCES Facturas(facturaId),
	CONSTRAINT FK_DetalleFacturas_ProductosFemeninos FOREIGN KEY DetalleFacturas(productoFemeninoId)
		REFERENCES ProductosFemeninos(productoFemeninoId) 
);

CREATE TABLE DetallePedidos(
	detallePedidoId INT NOT NULL AUTO_INCREMENT,
    cantidadComprada INT NOT NULL,
    productoMasculinoId INT NOT NULL,
    productoFemeninoId INT NOT NULL,
    pedidoId INT NOT NULL,
    PRIMARY KEY PK_detallePedidoId(detallePedidoId),
    CONSTRAINT FK_DetallePedidos_ProductosFemeninos FOREIGN KEY DetallePedidos(productoFemeninoId)
		REFERENCES ProductosFemeninos(productoFemeninoId),
	CONSTRAINT FK_DetallePedidos_ProductosMasculinos FOREIGN KEY DetallePedidos(productoMasculinoId)
		REFERENCES ProductosMasculinos(productoMasculinoId),
	CONSTRAINT FK_DetallePedidos_Pedidos FOREIGN KEY DetallePedidos(pedidoId)
		REFERENCES Pedidos(pedidoId)
);



-- CIUDADES --

INSERT INTO Ciudades (nombreCiudad) VALUES
	('Ciudad de Guatemala'),
	('Quetzaltenango'),
	('Coban'),
	('Villa Nueva'),
	('Mixco');

-- DIRECCIONES --

INSERT INTO Direcciones (calle, avenida, numeroCasa, ciudadId) VALUES 
	('Las Rosas', '2da Avenida ', '123', 1),
	('El Molino', '3ra Avenida ', '456', 2),
	('Antigua', '4ta Avenida ', '789', 3),
	('San Benito', '5ta Avenida ', '101', 4),
	('Calle Real', ' 6ta Avenida ', '112', 5);

-- CLIENTES --
INSERT INTO Clientes (nombre, apellido, direccionId) VALUES
	('Juan', 'Pérez', 1),
	('María', 'López', 2),
	('Carlos', 'González', 3),
	('Ana', 'Martínez', 4),
	('Luis', 'Rodríguez', 5);

-- CATEGORIA PRODUCTOS --

INSERT INTO CategoriaProductos (nombreCategoria, descripcionCategoria) VALUES 
	('Camisas', 'Camisas de diferentes estilos y colores'),
	('Pantalones', 'Pantalones de vestir, casuales y jeans'),
	('Vestidos', 'Vestidos formales e informales para toda ocasión'),
	('Chaquetas', 'Chaquetas y abrigos para todas las estaciones'),
	('Accesorios', 'Accesorios de moda como cinturones, sombreros y bufandas');

-- DISTRIBUIDORES --

INSERT INTO Distribuidores (nombreDistribuidor, direccionDistribuidor, nitDistribuidor, telefonoDistribuidor, web) VALUES
	('Distribuidora Fashion', 'Calle 123, Ciudad de Guatemala', 'GT123456789', '5554-1234', 'www.fashiondistribuidora.com'),
	('Ropa Moderna', 'Avenida 45, Quetzaltenango', 'GT987654321', '3334-5678', 'www.ropamoderna.com'),
	('Distribuciones Elite', 'Boulevard 789, Coban', 'GT123123123', '8138-8765', 'www.distribucioneselite.com'),
	('Moda y Estilo', 'Calle 567, Villa Nueva', 'GT321321321', '2252-4321', 'www.modayestilo.com'),
	('Tendencias Globales', 'Avenida 234, Mixco', 'GT654654654', '6654-9876', 'www.tendenciasglobales.com');


-- PRODUCTOS MASCULINOS --

INSERT INTO ProductosMasculinos (nombreProducto, precioCompra, descripcionProducto, cantidadStock, precioVentaUnitario, distribuidorId, categoriaproductoId) VALUES
	('Camisa Casual', 15.50, 'Camisa de algodón para uso diario', 50, 25.00, 1, 1),
	('Pantalón de Vestir', 20.00, 'Pantalón de vestir elegante', 30, 40.00, 2, 2),
	('Chaqueta de Cuero', 50.00, 'Chaqueta de cuero genuino', 10, 100.00, 3, 4),
	('Jeans', 25.00, 'Jeans de mezclilla de alta calidad', 40, 50.00, 4, 2),
	('Cinturón de Cuero', 5.00, 'Cinturón de cuero marrón', 100, 15.00, 5, 5);

-- PRODUCTOS FEMENINOS --

INSERT INTO ProductosFemeninos (nombreProducto, precioCompra, descripcionProducto, cantidadStock, precioVentaUnitario, distribuidorId, categoriaproductoId) VALUES
	('Blusa Elegante', 12.00, 'Blusa de seda con encaje', 50, 25.00, 1, 1),
	('Falda Casual', 8.00, 'Falda de mezclilla para uso diario', 60, 20.00, 2, 2),
	('Vestido de Fiesta', 30.00, 'Vestido largo de gala', 20, 60.00, 3, 3),
	('Chaqueta de Moda', 18.00, 'Chaqueta de cuero sintético', 40, 35.00, 4, 4),
	('Sombrero Elegante', 5.00, 'Sombrero de ala ancha', 100, 15.00, 5, 5);

-- FACTURAS -- 

INSERT INTO Facturas (fecha, hora, clienteId, total, productoFemeninoId, productoMasculinoId) VALUES
    ('2024-07-01', '10:30:00', 1, 100.50, 2, 5),
    ('2024-07-02', '11:45:00', 2, 200.75, 1, 4),
    ('2024-07-03', '12:00:00', 3, 150.00, 3, 3),
    ('2024-07-04', '13:15:00', 4, 250.25, 4, 2),
    ('2024-07-05', '14:30:00', 5, 300.50, 5, 1);


-- PROMOCIONES --
INSERT INTO Promociones (precioPromocion, descripcionPromocion, fechaInicio, fechaFinalizacion, productoFemeninoId, productoMasculinoId) VALUES
	(20.00, 'Descuento en Blusa Elegante y Camisa Casual', '2024-07-01', '2024-07-15', 1, 1),
	(15.00, 'Descuento en Falda Casual y Pantalón de Vestir', '2024-07-05', '2024-07-20', 2, 2),
	(50.00, 'Descuento en Vestido de Fiesta y Chaqueta de Cuero', '2024-07-10', '2024-07-25', 3, 3),
	(25.00, 'Descuento en Chaqueta de Moda y Jeans', '2024-07-15', '2024-07-30', 4, 4),
	(10.00, 'Descuento en Sombrero Elegante y Cinturón de Cuero', '2024-07-20', '2024-08-05', 5, 5);

-- PEDIDOS --

INSERT INTO Pedidos (clienteId, fecha, hora, total, direccionId) VALUES
	(1, '2024-07-01', '10:30:00', 100.50, 1),
	(2, '2024-07-02', '11:45:00', 200.75, 2),
	(3, '2024-07-03', '12:00:00', 150.00, 3),
	(4, '2024-07-04', '13:15:00', 250.25, 4),
	(5, '2024-07-05', '14:30:00', 300.50, 5);

-- NIVEL ACCESO --

INSERT INTO NivelesAcceso (nivelAcceso) VALUES
('Admin'),
('Usuario');

-- USUARIOS --

INSERT INTO Usuarios (usuario, contrasenia, nivelAccesoId) VALUES 
	 ('Pablo Castillo', 'admin1', 1),
	 ('Kevin Gutierrez', 'admin2', 1),
	 ('Alejandro Cuxum', 'admin3', 1),
	 ('Ian Alfaro', 'admin4', 1),
	 ('Jesus Sis', 'admin5', 1),
	 ('Jose Cortez', 'admin6', 1),
	 ('Usuario Prueba', 'usuario1', 2);
     
-- DETALLE FACTURAS --
INSERT INTO DetalleFacturas (facturaId, productoFemeninoId, productoMasculinoId) VALUES 
	(1, 1, 1),
	(2, 2, 2),
	(3, 3, 3),
	(4, 4, 2),
	(5, 3, 5);

-- DETALLE PEDIDOS --
INSERT INTO DetallePedidos (cantidadComprada, productoMasculinoId, productoFemeninoId, pedidoId) VALUES 
	(10, 1, 2, 1),
	(20, 2, 1, 2),
	(15, 3, 3, 3),
	(25, 4, 4, 4),
	(30, 3, 5, 5);