CREATE DATABASE IF NOT EXISTS `book_manager_database`;
USE `book_manager_database`;
--
-- Table structure for table `membership`
-- use this to check for library membership

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `account_number` int(11) NOT NULL AUTO_INCREMENT,
	`student_number` int(11),
	`password` varchar(45),
	PRIMARY KEY (`account_number`),
	FOREIGN KEY (`student_number`) references student(student_number)
) ENGINE=InnoDB CHARSET=latin1;

--
-- Data for table `accounts`
--

INSERT INTO `accounts` VALUES
	(3676,`acc3676` ,`admin123`),
	(1246, `acc1246`,`password`);

