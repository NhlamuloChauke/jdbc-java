CREATE DATABASE IF NOT EXISTS assignment;
use assignment;

CREATE TABLE if not exists Person (
    idNumber BIGINT(20),
    firstname varchar(255),
    lastname varchar(255)
    );

CREATE TABLE if not exists Contacts (
    contactNo varchar(255),
    email varchar(255),
    address varchar(255)
    );

CREATE TABLE if not exists Employee (
    employeeId INTEGER,
    employeeTitle varchar(255)
    );