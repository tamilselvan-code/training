CREATE TABLE `register` (
  `FIRST_NAME` varchar(45) DEFAULT NULL,
  `MIDDLE_NAME` varchar(45) DEFAULT NULL,
  `LAST_NAME` varchar(45) DEFAULT NULL,
  `GENDER` varchar(45) DEFAULT NULL,
  `CONTACT` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `ADDRESS` varchar(45) DEFAULT NULL,
  `COUNTRY` varchar(45) DEFAULT NULL,
  `STATE` varchar(45) DEFAULT NULL,
  `AADHAR` varchar(45) DEFAULT NULL,
  `ELECTION` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  `USERNAME` varchar(45) DEFAULT NULL,
  `STATUS` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EMAIL`));
  
  
  CREATE TABLE `candidate` (
  `pn` varchar(45) DEFAULT NULL,
  `fn` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `vote` int DEFAULT NULL);
  
  
  CREATE TABLE `oevs`.`campaign` (
  `party` VARCHAR(45) NULL,
  `sn` VARCHAR(45) NULL,
  `sub` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL);
  
  
  CREATE TABLE `oevs`.`event` (
  `PARTY` VARCHAR(45) NULL,
  `EVENT` VARCHAR(45) NULL);
  
  
  CREATE TABLE `nominee` (
  `PARTY` varchar(45) DEFAULT NULL );
  
  
  CREATE TABLE `oevs`.`feedback` (
  `from_email` VARCHAR(45) NULL,
  `to_email` VARCHAR(45) NULL,
  `subject` VARCHAR(45) NULL,
  `message` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL);
  
  
  

