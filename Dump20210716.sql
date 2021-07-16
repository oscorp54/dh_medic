CREATE DATABASE  IF NOT EXISTS `dh_medic` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dh_medic`;
-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dh_medic
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `medic`
--

DROP TABLE IF EXISTS `medic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medic` (
  `id_` int NOT NULL,
  `name_` varchar(50) NOT NULL,
  `lastname_` varchar(50) NOT NULL,
  `specialty_` int NOT NULL,
  `birthdate_` date NOT NULL,
  `address_` varchar(200) NOT NULL,
  `photo_` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medic`
--

LOCK TABLES `medic` WRITE;
/*!40000 ALTER TABLE `medic` DISABLE KEYS */;
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (1,'Max','Anduvies',1,'1971-02-26','La Paz - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (2,'Max','Schelder',1,'1971-11-11','La Paz - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (3,'Isabel','Condori',3,'1969-09-20','Cochabamba - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (4,'Pablo','Machicado',1,'1975-08-16','La Paz - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (5,'Frank','Macias',2,'1979-06-05','Pando - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (6,'Dolores','Fuertes',5,'1978-10-26','Cochabamba - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (7,'Jhon','Cena',4,'1980-12-11','La Paz - Bolivia',NULL);
INSERT INTO `medic` (`id_`,`name_`,`lastname_`,`specialty_`,`birthdate_`,`address_`,`photo_`) VALUES (8,'Claudia','Pando',3,'1982-03-21','Santa Cruz - Bolivia',NULL);
/*!40000 ALTER TABLE `medic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical_history`
--

DROP TABLE IF EXISTS `medical_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_history` (
  `id_` int NOT NULL,
  `description_` varchar(200) NOT NULL,
  `consultation_date_` date NOT NULL,
  `fk_patient_` int NOT NULL,
  `fk_medic_` int NOT NULL,
  `prescription_drugs_` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  KEY `fk_patient_idx` (`fk_patient_`),
  KEY `fk_medic_idx` (`fk_medic_`),
  CONSTRAINT `fk_medic` FOREIGN KEY (`fk_medic_`) REFERENCES `medic` (`id_`),
  CONSTRAINT `fk_patient` FOREIGN KEY (`fk_patient_`) REFERENCES `patient` (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_history`
--

LOCK TABLES `medical_history` WRITE;
/*!40000 ALTER TABLE `medical_history` DISABLE KEYS */;
INSERT INTO `medical_history` (`id_`,`description_`,`consultation_date_`,`fk_patient_`,`fk_medic_`,`prescription_drugs_`) VALUES (1,'La paciente presenta sintomas de resfrio severo','2021-07-01',3,1,'vitamina C, paracetamol');
/*!40000 ALTER TABLE `medical_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id_` int NOT NULL,
  `name_` varchar(50) NOT NULL,
  `lastname_` varchar(50) NOT NULL,
  `birthdate_` date NOT NULL,
  `address_` varchar(200) NOT NULL,
  `photo_` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  UNIQUE KEY `id_UNIQUE` (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (1,'Rodrigo','Aguilar','1989-05-24','La Paz - Bolivia',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (2,'Juan','Perez','1990-01-01','Cochabamba',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (3,'Roxana','Fuentes','1985-05-03','La Paz',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (4,'Maria','Quispe','1974-09-10','Santa Cruz',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (5,'Francisca','Mamani','1979-09-10','Oruro',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (6,'Jorge','Pelaes','1992-01-10','La Paz',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (7,'Luis','Catari','1998-09-10','Pando',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (8,'Elena','Luna','1970-06-10','La Paz',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (9,'Nelson','Espinoza','1991-10-05','La Paz',NULL);
INSERT INTO `patient` (`id_`,`name_`,`lastname_`,`birthdate_`,`address_`,`photo_`) VALUES (10,'Marcia','Ramires','1988-10-15','Santa Cruz',NULL);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-16  9:52:34
