CREATE DATABASE ClinicDB;
USE ClinicDB;

CREATE TABLE Patient (
  PatientID INT PRIMARY KEY AUTO_INCREMENT,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Phone VARCHAR(15)
);

CREATE TABLE Doctor (
  DoctorID INT PRIMARY KEY AUTO_INCREMENT,
  Name VARCHAR(100),
  Specialization VARCHAR(50)
);

CREATE TABLE Appointment (
  AppointmentID INT PRIMARY KEY AUTO_INCREMENT,
  PatientID INT,
  DoctorID INT,
  AppointmentDate DATE,
  AppointmentTime TIME,
  FOREIGN KEY (PatientID) REFERENCES Patient(PatientID),
  FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID)
);