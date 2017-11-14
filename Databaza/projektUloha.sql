CREATE DATABASE projektUloha;
USE projektUloha;

CREATE TABLE Tasks( 
	id INTEGER AUTO_INCREMENT,
	taskname VARCHAR(30) NOT NULL,
	description VARCHAR(144) NOT NULL,
	deadline DATETIME NOT NULL,
	dateCreated DATE NOT NULL,
	PRIMARY KEY (id) 
);
