CREATE DATABASE  IF NOT EXISTS `proyectotask` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `proyectotask`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: proyectotask
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas` (
  `fechaCita` varchar(45) NOT NULL,
  `email_usuario` varchar(45) NOT NULL,
  `nombreServicio` varchar(45) NOT NULL,
  PRIMARY KEY (`fechaCita`,`email_usuario`,`nombreServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` VALUES ('JUEVES 12:00','berta@gmail.com','Manitas a domicilio'),('JUEVES 13:00','rafa@gmail.com','Chef a domicilio'),('LUNES 14:00','rafa@gmail.com','Paseo'),('MARTES 12:00','berta@gmail.com','Limpieza a domicilio'),('MIERCOLES 12:00','berta@gmail.com','coach'),('MIERCOLES 13:00','maria@gmail.com','Manicura'),('MIERCOLES 13:00','rafa@gmail.com','Profesor de musica'),('MIERCOLES 14:00','maria@gmail.com','Manicura'),('VIERNES 12:00','maria@gmail.com','Manicura'),('VIERNES 13:00','berta@gmail.com','Limpieza a domicilio'),('VIERNES 13:00','maria@gmail.com','Profe de mates');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios` (
  `nombreCategoria` varchar(40) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `subcategoria` varchar(45) DEFAULT NULL,
  `nombreServicio` varchar(45) NOT NULL,
  PRIMARY KEY (`nombreServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES ('HOGAR',65,'Más de 12 años de experiencia','CHEF','Chef a domicilio'),('COLEGIO',20,'Clases de lengua a domicilio','LENGUA','Clases de lengua'),('DEPORTE',65,'coach a domicilio','COACH','coach'),('DEPORTE',40,'Entrenador de futbol','FUTBOL','Entrenador'),('BELLEZA',50,'Estilista profesional','ESTILISMO','Estilista'),('BELLEZA',50,'Tratamiento facial a domicilio','FACIAL','Facial'),('HOGAR',20,'Persona de confianza','LIMPIEZA','Limpieza a domicilio'),('BELLEZA',50,'Manicura a domicilio','MANICURA','Manicura'),('HOGAR',20,'Manitas de confianza','MANITAS','Manitas a domicilio'),('DEPORTE',20,'Profesor de padel','PADEL','Padel'),('MASCOTA',50,'Paseo perros de lunes a domingo','PASEO','Paseo'),('MASCOTA',80,'Peluqueria canina en casa','MEDICO','Peluqueria canina'),('COLEGIO',25,'Profe de lengua a domicilio','LENGUA','Profe de lengua'),('COLEGIO',50,'Profe de mates a domicilio','MATES','Profe de matematicas'),('COLEGIO',25,'A domicilio','MATES','Profe de mates'),('COLEGIO',80,'Clases a domicilio','MÚSICA','Profesor de musica');
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios_usuarios`
--

DROP TABLE IF EXISTS `servicios_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios_usuarios` (
  `nombreServicio` varchar(45) NOT NULL,
  `email_usuario` varchar(45) NOT NULL,
  `compra` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`nombreServicio`,`email_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios_usuarios`
--

LOCK TABLES `servicios_usuarios` WRITE;
/*!40000 ALTER TABLE `servicios_usuarios` DISABLE KEYS */;
INSERT INTO `servicios_usuarios` VALUES ('Chef a domicilio','rafa@gmail.com','0'),('Clases de lengua','maria@gmail.com','0'),('coach','berta@gmail.com','0'),('edgthzdgf','rafa@gmail.com','0'),('Entrenador','rafa@gmail.com','0'),('Estilista','rafa@gmail.com','0'),('Facial','rafa@gmail.com','0'),('Limpieza a domicilio','berta@gmail.com','0'),('Limpieza en casa','hola@','0'),('Manicura','maria@gmail.com','0'),('Manicura1','hola@','0'),('Manitas','hola@','0'),('Manitas a domicilio','berta@gmail.com','0'),('Manitas a domicilio','hola@','0'),('Manitas a tu casa','hola@','0'),('Padel','rafa@gmail.com','0'),('paseando','rafa@gmail.com','0'),('Paseo','rafa@gmail.com','0'),('Paseo perros','hola@','0'),('Peluqueria canina','rafa@gmail.com','0'),('Profe de lengua','berta@gmail.com','0'),('Profe de matematicas','pablo@gmail.com','0'),('Profe de mates','maria@gmail.com','0'),('Profesor de musica','rafa@gmail.com','0'),('Profesor de padel','hola@','0'),('Veterinario','rafa@gmail.com','0');
/*!40000 ALTER TABLE `servicios_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `email` varchar(40) NOT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `cartera` float DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('','','','',NULL,'MALAGA'),('berta@gmail.com','1234','Berta','Calle Bolivia 103',NULL,'MALAGA'),('delahermossa@gmail.com','1234','Berta Ruiz','Calle Bolivia',NULL,'MALAGA'),('maria@gmail.com','1234','Maria','Calle Sauce',NULL,'VALENCIA'),('pablo@gmail.com','1234','Pablo','Calle Mayorazgo',NULL,'MALAGA'),('rafa@gmail.com','1234','Rafa','Calle Malaga',NULL,'MADRID');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valoraciones`
--

DROP TABLE IF EXISTS `valoraciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valoraciones` (
  `valoraciones_id` int DEFAULT NULL,
  `numeroEstrellas` int DEFAULT NULL,
  `email_usuario` varchar(45) DEFAULT NULL,
  `comentario` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valoraciones`
--

LOCK TABLES `valoraciones` WRITE;
/*!40000 ALTER TABLE `valoraciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `valoraciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-13  8:50:19
