/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.32.129
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : 192.168.32.129:3306
 Source Schema         : vns

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 20/09/2019 21:41:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for architecture
-- ----------------------------
DROP TABLE IF EXISTS `architecture`;
CREATE TABLE `architecture`  (
  `ID` bigint(22) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '建筑名',
  `desc` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '建筑描述',
  `longitude` decimal(13, 10) NULL DEFAULT NULL COMMENT '经度',
  `latitude` decimal(12, 10) NULL DEFAULT NULL COMMENT '维度',
  `status` int(4) NULL DEFAULT NULL COMMENT '状态',
  `mark_icon_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标路径',
  `mark_icon_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片内容',
  `mark_callout_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点击内容',
  `mark_width` int(5) NULL DEFAULT NULL COMMENT '宽度',
  `mark_height` int(5) NULL DEFAULT NULL COMMENT '高度',
  `mark_info_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `mark_label_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of architecture
-- ----------------------------
INSERT INTO `architecture` VALUES (1, '驱蚊器', '请问', 115.8755385876, 28.7405983728, 11, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `ID` bigint(22) NOT NULL,
  `comment_architecture_ID` bigint(22) NOT NULL,
  `comment_author` bigint(22) NOT NULL,
  `comment_target` bigint(22) NULL DEFAULT NULL,
  `comment_date` timestamp(0) NULL DEFAULT NULL,
  `comment_date_gmt` timestamp(0) NULL DEFAULT NULL,
  `comment_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comment_status` tinyint(4) NOT NULL,
  `comment_likenum` int(11) NULL DEFAULT NULL,
  `comment_parent` bigint(255) NULL DEFAULT NULL,
  `arg1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `ID` bigint(22) NOT NULL,
  `user_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_wxid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_date` timestamp(0) NULL DEFAULT NULL,
  `user_status` tinyint(255) NOT NULL,
  `user_role_id` tinyint(22) NOT NULL,
  `arg1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (0, 'Nancy', 'wx1sfw231', '2018-04-10 16:51:21', 0, 2, NULL, NULL, NULL);
INSERT INTO `user` VALUES (1, 'Tony', 'wxaskkl21', '2018-03-28 18:12:44', 2, 1, NULL, NULL, NULL);
INSERT INTO `user` VALUES (2, 'Monica', 'wxaeklq2l', '2018-03-14 10:28:11', 1, 2, NULL, NULL, NULL);
INSERT INTO `user` VALUES (3, 'a', 'wxwerll;', '2018-03-07 22:02:12', 1, 2, NULL, NULL, NULL);
INSERT INTO `user` VALUES (4, '二', 'wxwerq', '2018-04-05 22:02:35', 2, 2, NULL, NULL, NULL);
INSERT INTO `user` VALUES (5, 'akl', 'wxxwer', '2018-04-27 22:02:49', 2, 1, NULL, NULL, NULL);
INSERT INTO `user` VALUES (6, 'afnlkal', 'wxknwakle', '2018-03-27 22:14:37', 1, 1, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
