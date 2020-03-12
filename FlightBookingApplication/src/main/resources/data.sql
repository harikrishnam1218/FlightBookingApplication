
CREATE DATABASE IF NOT EXISTS flightData;
use flightData;


CREATE TABLE flightData.userdetail (
    uid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
	role  VARCHAR(255) NOT NULL,
    age integer ,
    sex VARCHAR(255) NOT NULL,
   mealpreference VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);


CREATE TABLE flightData.flight (
    fid INT AUTO_INCREMENT PRIMARY KEY,
    fname VARCHAR(255) NOT NULL,
	availabledate Date NOT NULL,
    source  VARCHAR(255) NOT NULL,
     destination  VARCHAR(255) NOT NULL,
     price double not null
);


CREATE TABLE flightData.bookinginfo (
    bid INT AUTO_INCREMENT PRIMARY KEY,
    uid int not null,
    fid int not null,
   FOREIGN KEY (uid) REFERENCES  userdetail(uid),
   FOREIGN KEY (fid) REFERENCES  flight(fid)
);

CREATE TABLE flightData.passenger (
    pid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    gender VARCHAR(255) NOT NULL,
    age int not null,
    bid int not null,
   FOREIGN KEY (bid) REFERENCES  bookinginfo(bid)
);


