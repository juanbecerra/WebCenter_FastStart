.
CREATE TABLE  "WCS_CUSTOM"."EA_APPLICATIONS" 
   (	"APP_ID" NUMBER NOT NULL ENABLE, 
	"NAME" VARCHAR2(150), 
	"URL" VARCHAR2(300), 
	"LOGO" VARCHAR2(300), 
	 CONSTRAINT "EA_APPLICATIONS_PK" PRIMARY KEY ("APP_ID") ENABLE
   ) ;



CREATE TABLE  "WCS_CUSTOM"."EA_USERAPPLICATIONS" 
   (	"APP_ID" NUMBER, 
	"USERNAME" VARCHAR2(50)
   ) ;


Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (4,'Chemalert','https://chemalert.rmt.com.au/leicon/index/index.do','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/chemalert.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (1,'Keystone','https://www.incite.com.au/','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/keystone.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (2,'ARM','http://lc23rms1.lc.local/arm/','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/arm2.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (3,'EBS','http://ebsprod.lc.local/OA_HTML/AppsLogin','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/oracleebs.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (5,'Global','http://www.saiglobal.com/online/autologin.asp','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/saiglobal.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (6,'Library','http://portal.lc.local:7777/Intranet/GroupFunctions/Library/index.htm','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/sf_library.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (8,'Cintellate','http://lc23fuspapp1.lc.local/Fusion/','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/cintellate.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (9,'Maximo','https://maxprodebs.lc.local/maximo/webclient/login/login.jsp','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/digitalmedia/maximo.jpg');
Insert into WCS_CUSTOM.EA_APPLICATIONS (APP_ID,NAME,URL,LOGO) values (10,'WWS','https://sso.crmondemand.com/router/logon.jsp','/content/conn/UCM_Conn/path/Contribution%20Folders/LCIntranet/Images/MyApplications/digitalmedia/wws.jpg');
