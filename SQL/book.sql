CREATE DATABASE IF NOT EXISTS `library_database`;
USE `library_database`;

SET FOREIGN_KEY_CHECKS = 0;
--
-- Table structure for table `Book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(128) DEFAULT NULL,
  `isbn` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `Book`
--

INSERT INTO `book` VALUES
	(1,'book1.png','99-7281-754-1', 'introduction to science', 'Grosvenor Miranda Alcantar'),
	(2,'book1.png','99-7282-754-2', 'introduction to economics', 'Macèo Reynoso Cintron'),
	(3,'book1.png','99-7283-754-3', 'introduction to accounting', 'Osmaro Henriquez Naranjo'),
	(4,'book1.png','99-7284-754-4', 'introduction to biotechnology', 'Nicanor Gutierrez Aguayo'),
	(5,'book1.png','99-7285-754-5', 'introduction to robotics', 'Zhenechka Armijo Olivarez');

