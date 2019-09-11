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
  `book_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_BOOK_idx` (`book_id`),
  CONSTRAINT `FK_BOOK` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`) 
  ON DELETE NO ACTION 
  ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `accounts`
--

INSERT INTO `account` VALUES
	(1,'admin123',1),
    (2,'admin123',2),
    (3,'admin123',3),
    (4,'admin123',4),
	(5,'admin123',5);

