CREATE DATABASE IF NOT EXISTS `book_manager_database`;
USE `book_manager_database`;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;

CREATE TABLE `librarian` (
	`librarian_id` int(11),
	`first_name` varchar(45),
	`second_name` varchar(45), 
	PRIMARY KEY (`librarian_id`)
) ENGINE=InnoDB CHARSET=latin1;

--
-- Data for table `librarian`
--

INSERT INTO `librarian` VALUES
	(1, `Ali`, `Myataza`) -- admin
	(2, `Ntando`, `Mniki`); -- staff

