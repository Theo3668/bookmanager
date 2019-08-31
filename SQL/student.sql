CREATE DATABASE IF NOT EXISTS `book_manager_database`;
USE `book_manager_database`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_number` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`student_number`)
-- put a string array to hold isbn of borrowed books
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `student`
--

INSERT INTO `student` VALUES
	(3676,'Leslie','Andrews','leslie@luv2code.com'),
	(1246,'Emma','Baumgarten','emma@luv2code.com'),
	(5616,'Avani','Gupta','avani@luv2code.com'),
	(9045,'Yuri','Petrov','yuri@luv2code.com'),
	(1242,'Juan','Vega','juan@luv2code.com');



