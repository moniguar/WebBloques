-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-01-2024 a las 06:16:57
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebabloques`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bloquecito`
--

CREATE TABLE `bloquecito` (
  `id` int(4) NOT NULL,
  `palabra` varchar(20) NOT NULL,
  `resultado` varchar(5) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bloquecito`
--

INSERT INTO `bloquecito` (`id`, `palabra`, `resultado`, `fecha`) VALUES
(1, 'A', 'true', '2024-01-11 00:04:53'),
(2, 'LIBRO', 'true', '2024-01-11 00:05:28'),
(3, 'BOZO', 'false', '2024-01-11 00:05:33'),
(4, 'TRAJE', 'true', '2024-01-11 00:05:40'),
(5, 'COMUN', 'true', '2024-01-11 00:05:46'),
(6, 'CAMPANA', 'false', '2024-01-11 00:05:53'),
(7, 'DORITO', 'true', '2024-01-11 00:05:58'),
(8, 'ARLEQUIN', 'true', '2024-01-11 00:06:06'),
(9, 'TEXTO', 'true', '2024-01-11 00:12:33'),
(10, 'E', 'true', '2024-01-11 06:13:48');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bloquecito`
--
ALTER TABLE `bloquecito`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bloquecito`
--
ALTER TABLE `bloquecito`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
