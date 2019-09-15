CREATE DATABASE IF NOT EXISTS `library_database`;
USE `library_database`;

SET FOREIGN_KEY_CHECKS = 0;
--
-- Table structure for table `membership`
-- use this to check for library membership

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `accounts`
--

INSERT INTO `account` VALUES
	(1,'admin123'),
    (2,'admin123'),
    (3,'admin123'),
    (4,'admin123'),
	(5,'admin123'),
    (6,'admin123'),
    (7,'admin123'),
    (8,'admin123'),
    (9,'admin123'),
    (10,'admin123'),
    (11,'admin123'),
    (12,'admin123');

