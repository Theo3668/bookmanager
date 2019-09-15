CREATE DATABASE IF NOT EXISTS `library_database`;
USE `library_database`;

SET FOREIGN_KEY_CHECKS = 0;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ACCOUNT_idx` (`account_id`),
  CONSTRAINT `FK_ACCOUNT` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) 
  ON DELETE NO ACTION 
  ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `student`
--

INSERT INTO `student` VALUES
	(1,'Leslie','Andrews','leslie@luv2code.com',1),
	(2,'Emma','Baumgarten','emma@luv2code.com',2),
	(3,'Avani','Gupta','avani@luv2code.com',3),
	(4,'Yuri','Petrov','yuri@luv2code.com',4),
    (5,'Yuri','Petrov','yuri@luv2code.com',5),
    (6,'Yuri','Petrov','yuri@luv2code.com',6),
    (7,'Yuri','Petrov','yuri@luv2code.com',7),
    (8,'Yuri','Petrov','yuri@luv2code.com',8),
    (9,'Yuri','Petrov','yuri@luv2code.com',9),
    (10,'Yuri','Petrov','yuri@luv2code.com',10),
    (11,'Yuri','Petrov','yuri@luv2code.com',11),
	(12,'Juan','Vega','juan@luv2code.com',12);



