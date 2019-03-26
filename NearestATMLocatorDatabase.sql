CREATE USER 'atmlocator'@'localhost' IDENTIFIED BY 'Pass123';

GRANT ALL ON ATMLocator.* TO 'atmlocator'@'localhost';

CREATE DATABASE ATMLocator;

USE ATMLocator;

CREATE TABLE `atmlocations` (
  `ATMID` int(11) NOT NULL,
  `Bank` varchar(128) DEFAULT NULL,
  `Street` varchar(256) DEFAULT NULL,
  `Building` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `Country` varchar(10) DEFAULT NULL,
  `Zip` int(11) DEFAULT NULL,
  `Latitude` varchar(45) DEFAULT NULL,
  `Longitude` varchar(45) DEFAULT NULL,
  `Availability` tinyint(4) DEFAULT NULL,
  `CashAvailable` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ATMID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO demo.atmlocations VALUES
(1,'Wells Fargo','W Airport Fwy','900','IRVING','TX','USA','75062','32.8361659','-96.9572829','1','1');

INSERT INTO demo.atmlocations VALUES
(2,'Wells Fargo','N McArthur Blvd','4040','IRVING','TX','USA','75038','322.8706798','-96.960679','1','1');

INSERT INTO demo.atmlocations VALUES
(3,'Wells Fargo','HWY 114 AND ESTER BLVD','4441','IRVING','TX','USA','75063','232.8706798','-96.960679','1','1');

INSERT INTO demo.atmlocations VALUES
(4,'Chase','TM DEPLOYER SERVICES L.L.C.','1234','NEW YORK','NY','USA','10254','132.8706798','-96.960679','1','1');

INSERT INTO demo.atmlocations VALUES
(5,'Bank Of America','N BRITAIN RD','2015','SAN FRANCISCO','CA','USA','90001','65.8706798','-56.960679','1','1');

INSERT INTO demo.atmlocations VALUES
(6,'Bank Of America','S. MARCUS ST.','105','ALTO','TX','USA','75925','4.87845454','-12.960679','1','1');



COMMIT;
