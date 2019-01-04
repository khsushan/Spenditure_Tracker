CREATE DATABASE  IF NOT EXISTS `spenditure_tracker`;
USE `spenditure_tracker`;

CREATE TABLE `spenditure_tracker`.`category` (
  `CategoryId` INT NOT NULL,
  `CategoryName` VARCHAR(45) NULL,
  PRIMARY KEY (`CategoryId`));
  
  
  CREATE TABLE `spenditure_tracker`.`expenditure` (
  `ExpenditureId` INT NOT NULL AUTO_INCREMENT,
  `Amount` DOUBLE NULL,
  `Date` DATETIME NULL,
  `CategoryId` INT NULL,
  PRIMARY KEY (`ExpenditureId`),
  INDEX `CategoryId_idx` (`CategoryId` ASC) VISIBLE,
  CONSTRAINT `CategoryId`
    FOREIGN KEY (`CategoryId`)
    REFERENCES `spenditure_tracker`.`category` (`CategoryId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	

CREATE TABLE `spenditure_tracker`.`income` (
  `IncomeId` INT NOT NULL AUTO_INCREMENT,
  `Amount` DOUBLE NULL,
  `CategoryId` INT NOT NULL,
  `Date` DATETIME NOT NULL,
  PRIMARY KEY (`IncomeId`),
  INDEX `CategoryId_idx` (`CategoryId` ASC) VISIBLE,
  CONSTRAINT `CategoryId_Income`
    FOREIGN KEY (`CategoryId`)
    REFERENCES `spenditure_tracker`.`category` (`CategoryId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
	
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('1', 'General');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('2', 'Fuel');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('3', 'Clothes');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('4', 'Eating Out');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('5', 'Gifts');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('6', 'Sports');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('7', 'Travel');
INSERT INTO `spenditure_tracker`.`category` (`CategoryId`, `CategoryName`) VALUES ('8', 'Kids');

