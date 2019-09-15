CREATE DATABASE IF NOT EXISTS `library_database`;
USE `library_database`;

SET FOREIGN_KEY_CHECKS = 0;
--
-- Table structure for table `Book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` blob,
  `isbn` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `TITLE_UNIQUE` (`title`),
  KEY `FK_STUDENT_idx` (`student_id`),
  CONSTRAINT `FK_STUDENT` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `Book`
--

INSERT INTO `book` VALUES
	(1,'/images/book_1.jpg','99-7281-754-1', 'The Twilight Saga: New Moon', 'Stephanie Meyer',1),
	(2,'/images/book2.jpg','99-7282-754-2', 'Learn Java In One Day and Learn It Well', 'Jamie Chan',2),
	(3,'/images/book3.jpg','99-7283-754-3', 'What Is Chemistry?', 'Peter Atkins',3),
	(4,'/images/book4.jpg','99-7284-754-4', 'A Brief History of Time', 'Stephen Hawking',4),
	(5,'/images/book5.jpg','99-7285-754-5', 'The Joy of X', 'Steven Strogatz',5),
  (6,'/images/book6.jpg','99-7286-754-6', 'Superintelligence', 'Nick Bostrom',6),
	(7,'/images/book7.jpg','99-7287-754-7', 'Life 3.0', 'Max Tegmark',7),
	(8,'/images/book8.jpg','99-7288-754-8', 'Freakonomics', 'Steven D Levitt',8),
  (9,'/images/book9.jpg','99-7289-754-9', 'Property Law', 'Dr Poonam Pradhan Saxena',9),
	(10,'/images/book10.jpg','99-7210-754-10', 'Thinking Fast And Slow', 'Daniel Kahneman',10),
	(11,'/images/book11.jpg','99-7211-754-11', 'The Awkward Human, Survival Guide', 'Adam Dachis',11),
  (12,'/images/book12.jpg','99-7212-754-12', 'The Man Who Mistook His Wife For A Hat', 'Oliver Sacks',12);

