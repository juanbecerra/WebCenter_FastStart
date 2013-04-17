DROP TABLE "MYTRAINING_CATEGORIES" ;
DROP TABLE "MYTRAINING_COURSES" ;
DROP TABLE "MYTRAINING_USERTRAINING" ;
DROP SEQUENCE MYTRAINING_USERTRAINING_SEQ;
DROP SEQUENCE "MYTRAINING_CATEGORY_SEQ";
DROP SEQUENCE "MYTRAINING_COURSES_SEQ";
/********************************************************************************************/

CREATE TABLE  "MYTRAINING_CATEGORIES" 
   (	"CATEGORY_ID" NUMBER NOT NULL ENABLE, 
	"NAME" VARCHAR2(150) NOT NULL ENABLE, 
	 CONSTRAINT "MYTRAINING_CATEGORIES_PK" PRIMARY KEY ("CATEGORY_ID") ENABLE
   ) ;

/********************************************************************************************/

CREATE TABLE  "MYTRAINING_COURSES" 
   (	"COURSE_ID" NUMBER NOT NULL ENABLE, 
	"NAME" VARCHAR2(150) NOT NULL ENABLE, 
	"DESCRIPTION" VARCHAR2(1500), 
	"URL" VARCHAR2(250) NOT NULL ENABLE, 
	"CATEGORY_ID" NUMBER NOT NULL ENABLE, 
	"MANDATORY" VARCHAR2(3) NOT NULL ENABLE, 
	"ENABLED" VARCHAR2(3) NOT NULL ENABLE, 
	"MODIFIED_ON" DATE DEFAULT SYSDATE, 
	 CONSTRAINT "MYTRAINING_COURSES_PK" PRIMARY KEY ("COURSE_ID") ENABLE
   ) ;

/************************************************************************************************/

CREATE TABLE  "MYTRAINING_USERTRAINING" 
   (	"USERTRAINING_ID" NUMBER NOT NULL ENABLE, 
	"COURSE_ID" NUMBER NOT NULL ENABLE, 
	"USERNAME" VARCHAR2(50) NOT NULL ENABLE, 
	"ADDED_ON" DATE DEFAULT SYSDATE, 
	 CONSTRAINT "MYTRAINING_USERTRAINING_PK1" PRIMARY KEY ("USERTRAINING_ID") ENABLE
   ) ;

/************************************************************************************************/


CREATE SEQUENCE MYTRAINING_USERTRAINING_SEQ INCREMENT BY 1 START WITH 1;

CREATE OR REPLACE TRIGGER  "BI_MYTRAINING_USERTRAINING" 
  before insert on "MYTRAINING_USERTRAINING"               
  for each row  
begin   
  if :NEW."USERTRAINING_ID" is null then 
    select "MYTRAINING_USERTRAINING_SEQ".nextval into :NEW."USERTRAINING_ID" from dual; 
  end if; 
end;
/
ALTER TRIGGER  "BI_MYTRAINING_USERTRAINING" ENABLE;


/************************************************************************************************/

CREATE SEQUENCE   "MYTRAINING_CATEGORY_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;

CREATE OR REPLACE TRIGGER  "BI_MYTRAINING_CATEGORY" 
  before insert on "MYTRAINING_CATEGORIES"               
  for each row  
begin   
  if :NEW."CATEGORY_ID" is null then 
    select "MYTRAINING_CATEGORY_SEQ".nextval into :NEW."CATEGORY_ID" from dual; 
  end if; 
end;
/

ALTER TRIGGER  "BI_MYTRAINING_CATEGORY" ENABLE;


/************************************************************************************************/
CREATE SEQUENCE   "MYTRAINING_COURSES_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 43 CACHE 20 NOORDER  NOCYCLE ;

CREATE OR REPLACE TRIGGER  "BI_MYTRAINING_COURSES" 
  before insert on "MYTRAINING_COURSES"               
  for each row  
begin   
  if :NEW."COURSE_ID" is null then 
    select "MYTRAINING_COURSES_SEQ".nextval into :NEW."COURSE_ID" from dual; 
  end if; 
end;
/

ALTER TRIGGER  "BI_MYTRAINING_COURSES" ENABLE;
/************************************************************************************************/