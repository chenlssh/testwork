DROP TABLE IF EXISTS Spittle;
create table Spitter
(
	id bigint not null auto_increment
		primary key,
	userName  varchar(50) not null comment '用户名',
	password  varchar(50) null comment '用户名',
  firstName varchar(50) null,
  lastName  varchar(50) null
);



INSERT Spitter(userName,password,firstName,lastName)
	VALUES
		('ChenLongshun','123456','Chen','Longshun'),
		('ChenLongshun2','123456','Chen2','Longshun2');



DROP TABLE IF EXISTS Spittle;
create table Spittle
(
	id 				 bigint not null auto_increment primary key,
	message    varchar(50) NOT NULL comment '消息内容',
	time  		 DATE        NOT NULL comment '消息产生时间',
  latitude   DOUBLE null,
  longitude  DOUBLE null
);



INSERT Spittle(message,time,latitude,longitude)
	VALUES
		('王尼玛炸了','2018-04-16',NULL ,NULL ),
('试验001','2018-04-16',NULL ,NULL ),
('试验002','2018-04-16',NULL ,NULL ),
('试验003','2018-04-16',NULL ,NULL ),
('试验004','2018-04-16',NULL ,NULL ),
('试验005','2018-04-16',NULL ,NULL ),
('试验006','2018-04-16',NULL ,NULL ),
('试验007','2018-04-16',NULL ,NULL ),
('试验008','2018-04-16',NULL ,NULL ),
('试验009','2018-04-16',NULL ,NULL ),
('试验010','2018-04-16',NULL ,NULL ),
('试验011','2018-04-16',NULL ,NULL ),
('试验012','2018-04-16',NULL ,NULL ),
('试验013','2018-04-16',NULL ,NULL ),
('试验014','2018-04-16',NULL ,NULL ),
('试验015','2018-04-16',NULL ,NULL ),
('试验016','2018-04-16',NULL ,NULL ),
('试验017','2018-04-16',NULL ,NULL ),
('试验018','2018-04-16',NULL ,NULL ),
('试验019','2018-04-16',NULL ,NULL ),
('试验020','2018-04-16',NULL ,NULL ),
('试验021','2018-04-16',NULL ,NULL ),
('试验022','2018-04-16',NULL ,NULL ),
('试验023','2018-04-16',NULL ,NULL ),
('试验024','2018-04-16',NULL ,NULL ),
('试验025','2018-04-16',NULL ,NULL ),
('试验026','2018-04-16',NULL ,NULL ),
('试验027','2018-04-16',NULL ,NULL ),
('试验028','2018-04-16',NULL ,NULL ),
('试验029','2018-04-16',NULL ,NULL ),
('试验030','2018-04-16',NULL ,NULL ),
('试验031','2018-04-16',NULL ,NULL ),
('试验032','2018-04-16',NULL ,NULL ),
('试验033','2018-04-16',NULL ,NULL ),
('试验034','2018-04-16',NULL ,NULL ),
('试验035','2018-04-16',NULL ,NULL ),
('试验036','2018-04-16',NULL ,NULL ),
('试验037','2018-04-16',NULL ,NULL ),
('试验038','2018-04-16',NULL ,NULL ),
('试验039','2018-04-16',NULL ,NULL ),
('试验040','2018-04-16',NULL ,NULL );

drop table if exists DailyReport;

create table DailyReport(
	serialNo int auto_increment primary key ,
	userName varchar(20) not null comment '用户名',
	jobContent varchar(500) comment '工作内容',
	startDate	date not null comment '任务开始时间',
	finishDate date not null comment '任务结束时间',
	duration	varchar(20) not null comment '任务持续时间',
	timeUint	varchar(2) not null comment '时间单位(D：天，H：小时)',
	eventType	varchar(2) not null comment '时间类型'
);

drop table if exists user;

create table user(
	id int auto_increment primary key not null ,
	userName	varchar(20) not null comment '用户名',
	password	varchar(50) not null ,
	nickName varchar(100) not null comment '昵称'
)
