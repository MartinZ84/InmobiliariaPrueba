-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2019 a las 01:02:52
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmo_ulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `id_contrato` int(11) NOT NULL,
  `id_inmueble` int(11) NOT NULL,
  `dni_inquilino` int(11) NOT NULL,
  `estado_contrato` varchar(50) COLLATE utf8_bin NOT NULL,
  `monto` double NOT NULL,
  `fecha_ini` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`id_contrato`, `id_inmueble`, `dni_inquilino`, `estado_contrato`, `monto`, `fecha_ini`, `fecha_fin`) VALUES
(1, 42, 12345678, 'VIGENTE', 352015, '2019-11-10 00:00:00', '2019-11-22 00:00:00'),
(2, 49, 42315456, 'VIGENTE', 4567, '2019-11-04 00:00:00', '2019-11-03 00:00:00'),
(3, 54, 12345678, 'VIGENTE', 4532, '2019-11-04 00:00:00', '2019-11-06 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `id_inmueble` int(11) NOT NULL,
  `id_tipo_inmueble` int(11) NOT NULL,
  `dni_propietario` int(8) NOT NULL,
  `direccion_inmueble` varchar(100) COLLATE utf8_bin NOT NULL,
  `superficie` double NOT NULL,
  `precio_base` double NOT NULL,
  `estado_inmueble` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `inmueble`
--

INSERT INTO `inmueble` (`id_inmueble`, `id_tipo_inmueble`, `dni_propietario`, `direccion_inmueble`, `superficie`, `precio_base`, `estado_inmueble`) VALUES
(42, 4, 12370189, 'Lejos', 5200, 14000, 'No disponible'),
(49, 4, 25658742, 'Barcelona 2000', 1000, 5000, 'No disponible'),
(51, 1, 25658742, 'aaaa', 5000, 12341, 'No disponible'),
(53, 2, 64646464, 'ADSAD', 5454, 56456, 'No disponible'),
(54, 1, 43620916, 'Hollywood', 1231, 1234, 'No disponible'),
(55, 3, 75878575, 'Chacabuco 1200', 1234, 6300, 'Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `dni_inquilino` int(11) NOT NULL,
  `nombre_inquilino` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido_inquilino` varchar(50) COLLATE utf8_bin NOT NULL,
  `cuit_inquilino` varchar(20) COLLATE utf8_bin NOT NULL,
  `lugar_trabajo_inquilino` varchar(150) COLLATE utf8_bin NOT NULL,
  `nom_garante_inquilino` varchar(150) COLLATE utf8_bin NOT NULL,
  `dni_garante_inquilino` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `inquilino`
--

INSERT INTO `inquilino` (`dni_inquilino`, `nombre_inquilino`, `apellido_inquilino`, `cuit_inquilino`, `lugar_trabajo_inquilino`, `nom_garante_inquilino`, `dni_garante_inquilino`) VALUES
(12345678, 'Pepe', 'Sanchez', '20123456786', 'VEA', 'El primo', 12345679),
(35412842, 'Galileo', 'Galilei', '2035412842', 'Observatorio', 'Nicolas Copernico', 36542154),
(42315456, 'Pedro', 'Millenial', '20423154566', 'La deep web', 'Pepe Millenial', 43214982),
(45789321, 'Taylor', 'Swift', '20457893217', 'Canta', 'No necesita', 37552658),
(57164541, 'Tito', 'Torres', '20571645418', 'Aiello', 'Joe Jonas', 34254184);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `dni_propietario` int(8) NOT NULL,
  `nombre_propietario` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido_propietario` varchar(50) COLLATE utf8_bin NOT NULL,
  `domicilio_propietario` varchar(100) COLLATE utf8_bin NOT NULL,
  `telefono_propietario` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`dni_propietario`, `nombre_propietario`, `apellido_propietario`, `domicilio_propietario`, `telefono_propietario`) VALUES
(10101010, 'Nico', 'Del Caño', 'A la izquierda', '24784848'),
(12345655, 'Eso', 'Eso', 'Alcantarillas', '000'),
(12370189, 'Estela', 'Artois', 'Alemania 2000', '5624863'),
(15465656, 'Propietario', 'De prueba dos', 'Probando', '1234'),
(20457898, 'Fredderick', 'Mercury', 'Inglaterra 1234', '24579875'),
(25487945, 'Vladimir', 'Putin', 'Rusia 1000', '26644038238'),
(25658742, 'Lionel Andrés', 'Messi Cuccittini', 'Algun lugar en Barcelona', '285397'),
(26644038, 'Valentina', 'Velez', 'Belgrano 2222', '654785248'),
(42652646, 'Propietario', 'De prueba', 'Probando', '123'),
(43620916, 'Ariana', 'Grande', 'New York', '65791244'),
(43620917, 'Horacio', 'Pagani', 'Estudio futbol 1', '26464646'),
(44464665, 'Mauricio', 'Macri', 'Refugio de gatos', '15454656'),
(45678925, 'Juan', 'Juanes', 'Chacabuco 1200', '26457847'),
(45787887, 'Brian', 'May', 'Al lado de Freddy', '88725454'),
(54645648, 'Eliana', 'Sosa', 'La Quaica', '445646'),
(55555555, 'Brian', 'Navarro', 'Pera 4232', '75724'),
(55649310, 'Luciano', 'Pereyra', 'No se sabe', '565964'),
(56103546, 'Bebe', 'Recien Nacido', 'Con la madre', '00000'),
(64646464, 'Nina', 'Ricci', 'Bolivar 1234', '2664478978'),
(75258722, 'Pepe', 'Perez', 'Las heras 1234', '2664403916'),
(75875875, 'Teletubi', 'Rojo', 'Magic Kids', '1111111111'),
(75878575, 'Hugh', 'Jackman', 'Wolverine St 100', '47524577');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_inmueble`
--

CREATE TABLE `tipo_inmueble` (
  `id_tipo_inmueble` int(11) NOT NULL,
  `tipo_inmueble` varchar(50) NOT NULL,
  `zona_inmueble` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_inmueble`
--

INSERT INTO `tipo_inmueble` (`id_tipo_inmueble`, `tipo_inmueble`, `zona_inmueble`) VALUES
(1, 'Departamento', 'Centro'),
(2, 'Departamento', 'Rural'),
(3, 'Negocio', 'Ciudad'),
(4, 'Apartamento', 'Centro');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`id_contrato`),
  ADD KEY `id_inmueble` (`id_inmueble`),
  ADD KEY `id_inquilino` (`dni_inquilino`);

--
-- Indices de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`id_inmueble`),
  ADD KEY `dni_propietario` (`dni_propietario`),
  ADD KEY `id_tipo_inmueble` (`id_tipo_inmueble`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`dni_inquilino`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`dni_propietario`);

--
-- Indices de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
  ADD PRIMARY KEY (`id_tipo_inmueble`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contrato`
--
ALTER TABLE `contrato`
  MODIFY `id_contrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `id_inmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `dni_inquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57164542;

--
-- AUTO_INCREMENT de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
  MODIFY `id_tipo_inmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`id_inmueble`) REFERENCES `inmueble` (`id_inmueble`),
  ADD CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`dni_inquilino`) REFERENCES `inquilino` (`dni_inquilino`);

--
-- Filtros para la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD CONSTRAINT `inmueble_ibfk_1` FOREIGN KEY (`dni_propietario`) REFERENCES `propietario` (`dni_propietario`),
  ADD CONSTRAINT `inmueble_ibfk_2` FOREIGN KEY (`id_tipo_inmueble`) REFERENCES `tipo_inmueble` (`id_tipo_inmueble`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
