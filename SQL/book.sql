CREATE DATABASE IF NOT EXISTS `book_manager_database`;
USE `book_manager_database`;
--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
	`isbn` varchar(45) NOT NULL,
	`title` varchar(45) NOT NULL,
	`category` varchar(45),
	`student_number` int(11) NOT NULL,
	PRIMARY KEY (`isbn`),
	FOREIGN KEY (`student_number`) references student(student_number)
) ENGINE=InnoDB CHARSET=latin1;

--
-- Data for table `book`
--

INSERT INTO `book` VALUES
	(1,`12345`, `introduction to science`, `science`, 0, 3678321, 2019-09-25),
	(2,`42345`, `introduction to arts`, `arts`, 0, 1242, 2019-09-25),
	(3,`75456`, `introduction to education`, `education`, 0, 5616, 2019-09-25),
	(4,`98941`, `introduction to ems`, `ems`, 0, 1246, 2019-09-25),
	(5,`18768`, `introduction to politics`, `politics`, 1, 0);

