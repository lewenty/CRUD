CREATE DATABASE 'membership' ;


DROP TABLE IF EXISTS 'crudcustomer';

CREATE TABLE 'crudcustomer' (
  'id' int(11) NOT NULL AUTO_INCREMENT,
  'tckn' varchar(11) DEFAULT NULL,
  'adi' varchar(25) DEFAULT NULL,
  'soyadi' varchar(25) DEFAULT NULL,
  'unvani' varchar(25) DEFAULT NULL,
  PRIMARY KEY ('id')
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=latin1;