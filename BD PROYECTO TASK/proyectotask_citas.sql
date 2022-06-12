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
INSERT INTO `citas` VALUES ('DOMINGO 10:00','hola@','Manicura1'),('DOMINGO 12:00','hola@','Manicura1'),('JUEVES 13:00','hola@','Manitas'),('JUEVES 15:00','hola@','Manicura1'),('LUNES 10:00','hola@','Manicura1'),('LUNES 14:00','hola@','Manicura1'),('LUNES 15:00','hola@','Manicura1'),('LUNES 16:00','hola@','Manicura1'),('LUNES 21:00','hola@','Manicura1'),('MARTES 12:00','berta@gmail.com','Limpieza a domicilio'),('MARTES 13:00','berta@gmail.com','Limpieza a domicilio'),('MIERCOLES 10:00','hola@','Manicura1'),('MIERCOLES 12:00','hola@','Manicura1'),('MIERCOLES 12:00','hola@','Manitas a tu casa'),('MIERCOLES 15:00','hola@','Manicura1'),('MIERCOLES 16:00','hola@','Manicura1'),('SABADO 14:00','hola@','Manicura1'),('VIERNES 12:00','hola@','Manicura1'),('VIERNES 13:00','hola@','Manitas a tu casa'),('VIERNES 14:00','hola@','Manicura1'),('VIERNES 15:00','hola@','Manitas');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-07 20:57:06
