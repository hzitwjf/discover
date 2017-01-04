/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.0.22-community-nt : Database - decovre
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`decovre` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `decovre`;

/*Table structure for table `answer` */

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `ansId` int(11) NOT NULL auto_increment COMMENT '答案ID',
  `ansContent` varchar(100) default NULL COMMENT '答案内容',
  `ansSc` int(11) default NULL COMMENT '答案分数',
  `proId` int(11) default NULL COMMENT '所属题目',
  PRIMARY KEY  (`ansId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `answer` */

insert  into `answer`(`ansId`,`ansContent`,`ansSc`,`proId`) values (1,'男',2,1),(2,'女',2,1),(3,'非常满意',5,2),(4,'满意',3,2),(5,'不满意',2,2),(6,'偏多',3,3),(7,'刚好',5,3),(8,'偏少',2,3),(9,'偏多',3,4),(10,'刚好',5,4),(11,'偏少',2,4),(12,'非常满意',5,5),(13,'满意',3,5),(14,'不满意',2,5),(15,'麻辣',3,6),(16,'中辣',3,6),(17,'微辣',3,6),(18,'不辣',3,6),(19,'一直能做到',5,8),(20,'偶尔没做到',3,8),(21,'偶尔能做到',1,8),(22,'一直没做到',0,8),(23,'一直能准时下课',5,9),(24,'偶尔提前或延后',3,9),(25,'经常提前或延后',1,9),(26,'一直是提前下课',0,9),(27,'案例和授课用具充分',5,10),(28,'案例和授课用具一般',3,10),(29,'案例不够详细',1,10),(30,'备课不充分',0,10),(31,'每天的课程都有回顾和小结 ',5,11),(32,'几天一次回顾和小结',3,11),(33,'偶尔会回顾和小结一次',1,11),(34,'没有回顾和小结 ',0,11),(35,'每周实施上台回顾次数4次',5,12),(36,'每周实施上台回顾次数3次',3,12),(37,'每周实施上台回顾次数2次',2,12),(38,'每周实施上台回顾次数0到1次',0,12),(39,'完全达到，非常喜欢这位老师',5,13),(40,'达到，但讲课方法希望提升',4,13),(41,'达到, 但是我听不懂 ',3,13),(42,'不是所有技能点都能达到，教学方法有待提升',2,13),(43,'没有达到',0,13),(44,'思路清晰，重点突出，点赞！',7,14),(45,'思路清晰，重点不突出',5,14),(46,'思路不清晰，重现突出',3,14),(47,'思路不清晰，重点不突出',0,14),(48,'经常互动，提问学员',5,15),(49,'经常互动，但缺乏提问',3,15),(50,'不经常互动，偶尔提问',1,15),(51,'不经常互动，从不提问',0,15),(52,'关注课堂纪律并能及时纠正违纪行为',5,16),(53,'关注课堂纪律但不能纠正违纪行为',3,16),(54,'偶尔关注课堂纪律和纠正违纪行为',1,16),(55,'不关注课堂纪律也不纠正课堂行为',0,16),(56,'一直都是，很有责任心，而且是技术大牛',10,17),(57,'一直都是，但偶尔因为问题多而忽略了',8,17),(58,'能正确的解答问题，但一般不是很及时',6,17),(59,'我不敢提问老师问题。',4,17),(60,'不能及时，正确的回答问题',0,17),(61,'适当布置，并且认真批改',3,18),(62,'作业布置了，但没有批改',2,18),(63,'没有布置过作业',0,18),(64,'经常用极域机房控制软件,查看全场学员的屏幕，并及时给予指导',5,19),(65,'经常用极域机房控制软件,查看全场学员的屏幕，偶尔给予指导',4,19),(66,'很少用机房控制软件查看学员电脑，我们一般也不主动提问问题',3,19),(67,'很少用机房控制软件查看学员电脑，很少主动指导学员',2,19),(68,'一般不用查看学员机器。也不主动给予指导',0,19),(69,'上课老师能及时关注上机进度，并且引导和解决学员问题',10,20),(70,'上课老师能及时关注上机进度，但解决问题的能力需要加强',8,20),(71,'上课老师不能及时关注上机进度，但可以解决问题',6,20),(72,'我能够自己解决问题。不需要老师指导 ',4,20),(73,'上课老师不能及时关注上机进度，也不能解决学员问题',0,20),(74,'有耐心，有责任心',10,21),(75,'有责任心，但需要加强耐心',8,21),(76,'有耐心，但缺乏责任心',6,21),(77,'我一般不和老师沟通。所以不清楚',4,21),(78,'没有耐心，也没有责任心。',0,21),(79,'很喜欢这个老师，对课程也很有有兴趣',5,22),(80,'很喜欢这个老师，对课程有一点兴趣',3,22),(81,'很喜欢这个老师，对课程没有兴趣 ',2,22),(82,'不喜欢这个老师，对课程有兴趣 ',1,22),(83,'能跟上老师的授课进度，并能完成作业',5,23),(84,'能跟上老师的授课进度，但不能及时完成老师作业',3,23),(85,'不能跟上老师的授课进度，也不能完成老师作业',0,23),(86,'有明确的学习目标和上机任务',5,24),(87,'有明确的学习目标，但是没有上机任务',3,24),(88,'目标不是很明确，能跟着老师做',1,24),(89,'没有明确的学习目标',0,24),(90,NULL,NULL,7),(91,NULL,NULL,35),(92,'不喜欢这个老师，对课程也没有兴趣 ',0,22),(93,'很差',1,220),(94,'非常满意',5,230),(95,'满意',4,230),(96,'一般',3,230),(97,'差',2,230),(98,'很差',1,230),(99,'非常清楚',10,25),(100,'了解',7,25),(101,'不太清楚',4,25),(102,'完全不清楚',0,25),(103,'非常喜欢 ',10,26),(104,'比较喜欢',7,26),(105,'不太喜欢',4,26),(106,'很不喜欢',0,26),(107,'非常关心 ',10,27),(108,'关心',7,27),(109,'不太关心',4,27),(110,'完全不关心',0,27),(111,'非常明确 ',10,28),(112,'比较明确 ',7,28),(113,'一般',4,28),(114,'不明确',0,28),(115,'经常',10,29),(116,'一般',7,29),(117,'偶尔',4,29),(118,'没有',0,29),(119,'很乐意',10,30),(120,'比较乐意',7,30),(121,'不太乐意',4,30),(122,'不乐意',0,30),(123,'很好',10,31),(124,'比较好',7,31),(125,'一般',4,31),(126,'很差',0,31),(127,'总是',10,32),(128,'经常',7,32),(129,'偶尔',4,32),(130,'很少',0,32),(131,'非常有帮助',10,33),(132,'有帮助',7,33),(133,'一般',4,33),(134,'没有帮助',0,33),(135,'很好',10,34),(136,'比较好',7,34),(137,'一般',4,34),(138,'很差',0,34);

/*Table structure for table `check` */

DROP TABLE IF EXISTS `check`;

CREATE TABLE `check` (
  `checkId` int(11) NOT NULL auto_increment COMMENT 'ID自增长',
  `checkClass` varchar(20) default NULL COMMENT '评价的班级',
  `checkTeacher` varchar(20) default NULL COMMENT '评价的老师',
  `checkPwd` int(11) default NULL COMMENT '密码',
  `createTime` date default NULL COMMENT '创建时间',
  `checkModule` int(11) default NULL COMMENT '考察模块，0代表餐饮 1代表讲师 2 代表班主任',
  PRIMARY KEY  (`checkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `check` */

insert  into `check`(`checkId`,`checkClass`,`checkTeacher`,`checkPwd`,`createTime`,`checkModule`) values (1,'NP1601','吴华',1173,'2017-01-04',1),(2,'BT1604','吴剑',3866,'2017-01-04',1),(3,'BJ1603','餐饮',5664,'2017-01-04',0),(4,'BW1604','焦尚姝',2222,'2017-01-04',2),(5,'BW1601','王田',3310,'2017-01-04',1),(6,'BJ1601','吴佳峰',6662,'2017-01-04',1),(7,'BJ1601','马香',8638,'2017-01-04',1);

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comId` int(11) NOT NULL auto_increment COMMENT '评论ID',
  `comuuId` varchar(64) default NULL COMMENT '评论业务ID',
  `comTime` timestamp NULL default NULL COMMENT '评论时间',
  `comPeople` varchar(50) default NULL COMMENT '评论人',
  `comModule` varchar(10) default NULL COMMENT '评论的模块',
  `comScore` int(11) default NULL COMMENT '当前模块的总得分',
  `codPeople` varchar(20) default NULL COMMENT '被评论人',
  `comClass` varchar(20) default NULL COMMENT '评论来自的班级',
  PRIMARY KEY  (`comId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`comId`,`comuuId`,`comTime`,`comPeople`,`comModule`,`comScore`,`codPeople`,`comClass`) values (1,'ba032674-5362-402f-a146-8e6eb4f45a7d','2017-01-04 13:42:25','盖伦','1',NULL,'吴佳峰','BJ1601'),(5,'ed392856-3fcd-48e8-a92a-71f6a4b4225f','2017-01-04 18:06:05','呵呵哒','教员',100,'吴佳峰','BJ1601'),(6,'d243199c-18f9-414d-bae8-2d7080551e9c','2017-01-04 18:07:48','好','教员',100,'吴佳峰','BJ1601');

/*Table structure for table `discuss` */

DROP TABLE IF EXISTS `discuss`;

CREATE TABLE `discuss` (
  `disId` int(11) NOT NULL auto_increment COMMENT '评论详情Id',
  `comUuid` varchar(64) default NULL COMMENT '评论的业务id',
  `proId` int(11) default NULL COMMENT '评论的题目ID',
  `disResult` text COMMENT '评论结果',
  `disScore` varchar(50) default NULL COMMENT '得分项',
  PRIMARY KEY  (`disId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `discuss` */

insert  into `discuss`(`disId`,`comUuid`,`proId`,`disResult`,`disScore`) values (1,'ba032674-5362-402f-a146-8e6eb4f45a7d',1,'德玛西亚','50'),(2,'ba032674-5362-402f-a146-8e6eb4f45a7d',2,'诺克萨斯','50'),(5,'',8,'一直能做到','5'),(6,'',9,'一直能准时下课','5'),(7,'',10,'案例和授课用具充分','5'),(8,'',11,'每天的课程都有回顾和小结 ','5'),(9,'',12,'每周实施上台回顾次数4次','5'),(10,'',13,'完全达到，非常喜欢这位老师','5'),(11,'',14,'思路清晰，重点突出，点赞！','7'),(12,'',15,'经常互动，提问学员','5'),(13,'',16,'关注课堂纪律并能及时纠正违纪行为','5'),(14,'',17,'一直都是，很有责任心，而且是技术大牛','10'),(15,'',18,'适当布置，并且认真批改','3'),(16,'',19,'经常用极域机房控制软件,查看全场学员的屏幕，并及时给予指导','5'),(17,'',20,'上课老师能及时关注上机进度，并且引导和解决学员问题','10'),(18,'',21,'有耐心，有责任心','10'),(19,'',22,'很喜欢这个老师，对课程也很有有兴趣','5'),(20,'',23,'能跟上老师的授课进度，并能完成作业','5'),(21,'',24,'有明确的学习目标和上机任务','5'),(22,'',35,'哈哈','此题无法评分，就是这样'),(23,'d243199c-18f9-414d-bae8-2d7080551e9c',8,'一直能做到','5'),(24,'d243199c-18f9-414d-bae8-2d7080551e9c',9,'一直能准时下课','5'),(25,'d243199c-18f9-414d-bae8-2d7080551e9c',10,'案例和授课用具充分','5'),(26,'d243199c-18f9-414d-bae8-2d7080551e9c',11,'每天的课程都有回顾和小结 ','5'),(27,'d243199c-18f9-414d-bae8-2d7080551e9c',12,'每周实施上台回顾次数4次','5'),(28,'d243199c-18f9-414d-bae8-2d7080551e9c',13,'完全达到，非常喜欢这位老师','5'),(29,'d243199c-18f9-414d-bae8-2d7080551e9c',14,'思路清晰，重点突出，点赞！','7'),(30,'d243199c-18f9-414d-bae8-2d7080551e9c',15,'经常互动，提问学员','5'),(31,'d243199c-18f9-414d-bae8-2d7080551e9c',16,'关注课堂纪律并能及时纠正违纪行为','5'),(32,'d243199c-18f9-414d-bae8-2d7080551e9c',17,'一直都是，很有责任心，而且是技术大牛','10'),(33,'d243199c-18f9-414d-bae8-2d7080551e9c',18,'适当布置，并且认真批改','3'),(34,'d243199c-18f9-414d-bae8-2d7080551e9c',19,'经常用极域机房控制软件,查看全场学员的屏幕，并及时给予指导','5'),(35,'d243199c-18f9-414d-bae8-2d7080551e9c',20,'上课老师能及时关注上机进度，并且引导和解决学员问题','10'),(36,'d243199c-18f9-414d-bae8-2d7080551e9c',21,'有耐心，有责任心','10'),(37,'d243199c-18f9-414d-bae8-2d7080551e9c',22,'很喜欢这个老师，对课程也很有有兴趣','5'),(38,'d243199c-18f9-414d-bae8-2d7080551e9c',23,'能跟上老师的授课进度，并能完成作业','5'),(39,'d243199c-18f9-414d-bae8-2d7080551e9c',24,'有明确的学习目标和上机任务','5'),(40,'d243199c-18f9-414d-bae8-2d7080551e9c',35,'好','此题无法评分，就是这样');

/*Table structure for table `problem` */

DROP TABLE IF EXISTS `problem`;

CREATE TABLE `problem` (
  `proId` int(11) NOT NULL auto_increment COMMENT '题目ID',
  `proContent` varchar(200) default NULL COMMENT '问题内容',
  `proModule` int(11) default NULL COMMENT '所属模块0代表餐饮 1代表讲师 2代表班主任',
  PRIMARY KEY  (`proId`),
  KEY `p_id` (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `problem` */

insert  into `problem`(`proId`,`proContent`,`proModule`) values (1,'1、您的性别?',0),(2,'2、食品的味道?',0),(3,'3、菜的分量?',0),(4,'4、饭的分量?',0),(5,'5、食品的样式?',0),(6,'6、您对食品味道的期望?',0),(7,'7、您的其他建议或意见?',0),(8,'一、	老师早上(8:25)和中午(13:25)是否能做提前来到教室提醒学员准备上课 (5分)',1),(9,'二、老师中午(12:00)和晚上(17:30)是否能做到准时下课？(5分)',1),(10,'三、老师上课时的上课案例，备课是否充分？（5分）',1),(11,'四、老师在课堂上是否针对性进行小结和回顾？(5分)',1),(12,'五、每天的授课前30分钟是否有学员上讲台回顾授课知识点。(5分)',1),(13,'六、老师的技术能力是否满足该课程的教学要求？(5分)',1),(14,'七、老师上课时候理论知识，是否能做到思路清晰、重点突出？(7分)',1),(15,'八、老师上课时，是否经常和学员互动，提问题？(5)',1),(16,'九、老师是否关注课堂纪律，及时纠正学生违纪行为？(5)',1),(17,'十、老师是否很能及时，正确的解答问题？(10分)',1),(18,'十一、老师是否适当布置作业，认真批改作业？(3分)',1),(19,'十二、	机房上课老师是否做到通过机房控制软件查看全场机器，并给予学员指导？ (5)',1),(20,'十三、上课老师是否关注你的上机进度，引导和解决问题？(10)',1),(21,'十四、你感觉老师是否对班级很有耐心和责任心？(10)',1),(22,'十五、通过学习，你对所学的这门课程是否感兴趣？(5)',1),(23,'十六、你是否能跟上老师授课进度，并及时完成作业？（5分）',1),(24,'十七、每天的学习是否有明确学习目标，和上机任务   (5分)',1),(25,'1、你对班级行为规范是否清楚？',2),(26,'2、你对班主任的印象如何？',2),(27,'3、你的班主任是否关心班级同学的思想、学习等方面？',2),(28,'4、你认为班主任每次开班会的目的是否明确？',2),(29,'5、你的班主任是否会经常找班级同学进行沟通交流？',2),(30,'6、在你遇到困难的时候你的班主任是否乐意提供帮助和指导？',2),(31,'7、你的班主任在教育学生的过程中，是否严以律己，以身作则？',2),(32,'8、你需要帮助是能给及时找到班主任老师吗？',2),(33,'9、你的班主任上的《班级行为规范课》、《职业素养课》等对你是否有帮助？',2),(34,'10、你的班主任是否尊重学生人格，公正平等的对待每一个学生？',2),(35,'十八、你对老师授课方式有什么意见，建议或疑惑？',1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(11) default NULL COMMENT '用户ID',
  `userName` varchar(20) default NULL COMMENT '用户名字',
  `userPwd` varchar(64) default NULL COMMENT '用户密码',
  `userRole` int(11) default NULL COMMENT '负责模块 0代表管理员 1代表教务'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`userPwd`,`userRole`) values (1,'吴文杰','McbBJpXUDFsWXUnKBfyRfQ==',0),(2,'吴佳峰','McbBJpXUDFsWXUnKBfyRfQ==',0),(3,'黄晓燕','duuuEKEMhDhqUwJ8v3LbVg==',1),(4,'焦尚姝','duuuEKEMhDhqUwJ8v3LbVg==',1);

/*Table structure for table `vediscuss` */

DROP TABLE IF EXISTS `vediscuss`;

CREATE TABLE `vediscuss` (
  `vdId` int(11) NOT NULL auto_increment COMMENT '评论详情Id',
  `vcUuid` varchar(64) default NULL COMMENT '评论的业务id',
  `vcVid` int(11) default NULL COMMENT '评论的菜品id',
  `vdResult` text COMMENT '评论结果',
  PRIMARY KEY  (`vdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vediscuss` */

/*Table structure for table `vegetable` */

DROP TABLE IF EXISTS `vegetable`;

CREATE TABLE `vegetable` (
  `veId` int(11) NOT NULL auto_increment COMMENT '菜品ID',
  `veType` varchar(20) default NULL COMMENT '菜品类型',
  `veName` varchar(50) default NULL COMMENT '菜品名称',
  `veParent` int(11) default NULL COMMENT '菜品父模块',
  `veLevel` int(11) default NULL COMMENT '菜品等级',
  PRIMARY KEY  (`veId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vegetable` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
