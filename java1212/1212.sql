
/* Drop Tables */

DROP TABLE board1212 CASCADE CONSTRAINTS;
DROP TABLE member1212 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board1212
(
	no number NOT NULL,
	btitle varchar2(100 char) NOT NULL,
	bcontent varchar2(200 char) NOT NULL,
	nickname varchar2(20 char) NOT NULL,
	btime date NOT NULL,
	bwriterId varchar2(20 char) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE member1212
(
	userId varchar2(20 char) NOT NULL,
	userPw varchar2(20 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userId)
);



/* Create Foreign Keys */

ALTER TABLE board1212
	ADD FOREIGN KEY (bwriterId)
	REFERENCES member1212 (userId)
;



