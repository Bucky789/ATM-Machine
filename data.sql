-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `accno` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `accounttype` varchar(20) DEFAULT NULL,
  `balance` float DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'test','saving',10549,'2'),(2,'test1','',1001,'2'),(10000,'Suraj','Savings',45000,'1000'),(11111,'Manthan','Savings',250000,'1111'),(22222,'Muthuraj','Current',100000,'2222'),(33333,'Kaushik','Current',400000,'3333'),(44444,'Rutuja','Savings',175000,'4444'),(55555,'Zaid','Savings',525000,'5555'),(66666,'Jyoti','Current',2000000,'6666'),(77777,'Chirag','Savings',800,'7777'),(88888,'Rahila','Current',80000,'8888'),(99999,'Pankaj','Savings',170000,'9999');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactions` (
  `accno` int(11) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `balance` float DEFAULT NULL,
  KEY `accno` (`accno`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`accno`) REFERENCES `account` (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (11111,'Deposit',25000,175000),(11111,'Deposit',100000,275000),(11111,'Withdrawl',25000,250000),(10000,'Deposit',5000,30000),(10000,'Deposit',10000,40000),(10000,'Deposit',5000,45000),(22222,'Withdrawl',15000,75000),(22222,'Withdrawl',25000,50000),(22222,'Deposit',50000,100000),(33333,'Withdrawl',20000,70000),(33333,'Deposit',75000,145000),(33333,'Withdrawl',45000,100000),(33333,'Deposit',300000,400000),(44444,'Deposit',25000,65000),(44444,'Deposit',75000,140000),(44444,'Deposit',35000,140000),(55555,'Deposit',100000,350000),(55555,'Withdrawl',25000,325000),(55555,'Deposit',200000,525000),(66666,'Deposit',1500000,1750000),(66666,'Withdrawl',1000000,750000),(66666,'Deposit',1250000,2000000),(77777,'Withdrawl',25000,20000),(77777,'Withdrawl',15000,5000),(77777,'Withdrawl',4200,800),(88888,'Deposit',30000,130000),(88888,'Withdrwal',10000,120000),(88888,'Withdrwal',40000,80000),(99999,'Deposit',45000,165000),(99999,'Withdrawl',20000,145000),(99999,'Deposit',25000,145000),(1,'Withdrawl',100,1100),(1,'Withdrawl',100,900),(1,'Withdrawl',100,900),(1,'Withdrawl',100,900),(1,'Withdrawl',200,1200),(1,'Withdrawl',100,1100),(1,'Withdrawl',100,1100),(1,'Withdrawl',100,1200),(1,'Withdrawl',100,1200),(1,'Withdrawl',100,1200),(1,'Withdrawl',100,1200),(1,'Withdrawl',100,1200),(1,'Withdrawl',100,1300),(1,'Withdrawl',100,1200),(1,'Withdrawl',1200,0),(1,'Withdrawl',1200,0),(1,'Withdrawl',100,1000),(1,'Withdrawl',100,900),(1,'Withdrawl',100,800),(1,'Withdrawl',100,700),(1,'Withdrawl',100,600),(1,'Withdrawl',4000,4600),(1,'Withdrawl',80,1080),(1,'Deposit',80000,80920),(1,'Deposit',9100,10100),(1,'Deposit',50,10150),(1,'Withdrawl',100,10050),(1,'Deposit',500,10550),(1,'Withdrawl',1,10549),(2,'Withdrawl',1,1001);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-19 11:05:41
