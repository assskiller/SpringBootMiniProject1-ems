CREATE TABLE t_uesr(
	id VARCHAR(40) PRIMARY KEY,
	username VARCHAR(40),
	realname VARCHAR(40),
	PASSWORD VARCHAR(40),
	sex VARCHAR(10)
);

CREATE TABLE t_emp(
	id VARCHAR(40) PRIMARY KEY,
	NAME VARCHAR(40),
	salary DOUBLE(7,2),
	age INT(3)
);