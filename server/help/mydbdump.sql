/*
SQLyog Ultimate v9.50 
MySQL - 5.0.51b-community-nt : Database - mydb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mydb`;

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL auto_increment,
  `firstName` varchar(100) default NULL,
  `lastName` varchar(100) default NULL,
  `phone` varchar(100) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `contact` */

insert  into `contact`(`id`,`firstName`,`lastName`,`phone`,`email`) values (3,'Most Important ','Person','093 55 88 99 22','a1@gmail.com'),(4,'Most  Likely','Person','060 88 77 00 77','a2@gmail.com'),(5,'VIP','Person','099 33 77 22 66','a3@gmail.com'),(6,'34t5ty','45t45t','45t45t45t45',NULL);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `role` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`name`,`role`) values (16,'qwAAAAA','0'),(20,'cdcdcdc','0'),(21,'dcdcdc','0'),(22,'AAAA','0'),(23,'CCCCCCC','0'),(24,'Carlos Gntnik','0');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(11) NOT NULL auto_increment,
  `firstname` varchar(255) default NULL,
  `lastname` varchar(255) default NULL,
  `username` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `status` int(11) default '0',
  `role` int(11) default '0',
  `registeredDate` datetime default NULL,
  `lastloginDate` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`firstname`,`lastname`,`username`,`email`,`password`,`status`,`role`,`registeredDate`,`lastloginDate`) values (1,'fname1461763625786','lname1461763625786',NULL,'mail@1461763625786.com','password',1,NULL,'2016-04-27 17:27:05',NULL),(2,'fname1461763638317','lname1461763638317',NULL,'mail@1461763638317.com','password',1,NULL,'2016-04-27 17:27:18',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
