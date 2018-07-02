# Host: localhost  (Version: 5.5.40)
# Date: 2018-07-02 18:31:42
# Generator: MySQL-Front 5.3  (Build 4.120)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "content"
#

DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT '' COMMENT '文章或分类名称',
  `type` varchar(255) DEFAULT 'art' COMMENT 'art or moddle',
  `content` text,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发布或最后更新时间',
  `publish` int(11) DEFAULT '0' COMMENT '发布人id',
  `deletetag` int(1) DEFAULT '0' COMMENT '0 未删除 1 已删除',
  `img` varchar(255) DEFAULT NULL,
  `orderp` int(11) DEFAULT '0',
  `prent` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "content"
#

/*!40000 ALTER TABLE `content` DISABLE KEYS */;
/*!40000 ALTER TABLE `content` ENABLE KEYS */;

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `usergroup` int(11) NOT NULL DEFAULT '1',
  `address` varchar(255) DEFAULT NULL,
  `tel` int(11) NOT NULL DEFAULT '0',
  `salt` varchar(255) NOT NULL DEFAULT '',
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'1','',1,NULL,0,'',NULL),(2,'这是2','',1,NULL,0,'',NULL),(3,'这是3','',1,NULL,0,'',NULL),(4,'这是4','',1,NULL,0,'',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

#
# Structure for table "usergroup"
#

DROP TABLE IF EXISTS `usergroup`;
CREATE TABLE `usergroup` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `groupname` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "usergroup"
#

/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
INSERT INTO `usergroup` VALUES (1,'系统管理员'),(2,'文章管理员');
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;
