CREATE DATABASE IF NOT EXISTS flightData;
use flightData;


CREATE TABLE flightData.userdetail (
    uid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
	role  VARCHAR(255),
    age integer ,
    sex VARCHAR(255) ,
   mealpreference VARCHAR(255) ,
    email VARCHAR(255) 
);

CREATE TABLE flightData.flight (
    fid INT AUTO_INCREMENT PRIMARY KEY,
    fname VARCHAR(255) NOT NULL,
	availabledate Date NOT NULL,
    source  VARCHAR(255) NOT NULL,
     destination  VARCHAR(255) NOT NULL,
     availableseats int,
     price double 
);

CREATE TABLE flightData.passenger (
    pid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    gender VARCHAR(255) NOT NULL,
    age int not null);

CREATE TABLE flightData.bookinginfo (
    bid INT AUTO_INCREMENT PRIMARY KEY,
    uid int not null,
    fid int not null,
    pid int not null,
   FOREIGN KEY (uid) REFERENCES  userdetail(uid),
   FOREIGN KEY (fid) REFERENCES  flight(fid),
   FOREIGN KEY (pid) REFERENCES  passenger(pid)
);
