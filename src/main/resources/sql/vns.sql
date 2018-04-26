/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50508
Source Host           : localhost:3306
Source Database       : vns

Target Server Type    : MYSQL
Target Server Version : 50508
File Encoding         : 65001

Date: 2018-04-21 22:55:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for architecture
-- ----------------------------
DROP TABLE IF EXISTS `architecture`;
CREATE TABLE `architecture` (
  `ID` bigint(22) NOT NULL,
  `architecture_name` varchar(255) NOT NULL,
  `architecture_desc` longtext,
  `architecture_longitude` decimal(10,0) DEFAULT NULL,
  `architecture_latitude` decimal(10,0) DEFAULT NULL,
  `architecture_status` tinyint(4) DEFAULT NULL,
  `arg1` varchar(255) DEFAULT NULL,
  `arg2` varchar(255) DEFAULT NULL,
  `arg3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of architecture
-- ----------------------------
INSERT INTO `architecture` VALUES ('0', '驱蚊器', '请问', '211', '22', '11', null, null, null);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `ID` bigint(22) NOT NULL,
  `comment_architecture_ID` bigint(22) NOT NULL,
  `comment_author` bigint(22) NOT NULL,
  `comment_target` bigint(22) DEFAULT NULL,
  `comment_date` timestamp NULL DEFAULT NULL,
  `comment_date_gmt` timestamp NULL DEFAULT NULL,
  `comment_content` varchar(255) DEFAULT NULL,
  `comment_status` tinyint(4) NOT NULL,
  `comment_likenum` int(11) DEFAULT NULL,
  `comment_parent` bigint(255) DEFAULT NULL,
  `arg1` varchar(255) DEFAULT NULL,
  `arg2` varchar(255) DEFAULT NULL,
  `arg3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` bigint(22) NOT NULL,
  `user_nickname` varchar(255) NOT NULL,
  `user_wxid` varchar(255) NOT NULL,
  `user_date` timestamp NULL DEFAULT NULL,
  `user_status` tinyint(255) NOT NULL,
  `user_role_id` tinyint(22) NOT NULL,
  `arg1` varchar(255) DEFAULT NULL,
  `arg2` varchar(255) DEFAULT NULL,
  `arg3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', 'Nancy', 'wx1sfw231', '2018-04-10 16:51:21', '0', '2', null, null, null);
INSERT INTO `user` VALUES ('1', 'Tony', 'wxaskkl21', '2018-03-28 18:12:44', '2', '1', null, null, null);
INSERT INTO `user` VALUES ('2', 'Monica', 'wxaeklq2l', '2018-03-14 10:28:11', '1', '2', null, null, null);
INSERT INTO `user` VALUES ('3', 'a', 'wxwerll;', '2018-03-07 22:02:12', '1', '2', null, null, null);
INSERT INTO `user` VALUES ('4', '二', 'wxwerq', '2018-04-05 22:02:35', '2', '2', null, null, null);
INSERT INTO `user` VALUES ('5', 'akl', 'wxxwer', '2018-04-27 22:02:49', '2', '1', null, null, null);
INSERT INTO `user` VALUES ('6', 'afnlkal', 'wxknwakle', '2018-03-27 22:14:37', '1', '1', null, null, null);
