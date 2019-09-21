/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : 106.52.208.186:3306
 Source Schema         : vns

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 21/09/2019 15:06:52
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
  `mark_callout_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点击图标内容',
  `mark_width` int(5) NULL DEFAULT NULL COMMENT '宽度',
  `mark_height` int(5) NULL DEFAULT NULL COMMENT '高度',
  `mark_info_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点击底部展示内容',
  `mark_label_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '默认图标内容',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of architecture
-- ----------------------------
INSERT INTO `architecture` VALUES (1, '图书馆', '江理图书馆', 115.8755585876, 28.7403383728, 11, '/static/img/图书馆.png', '图书馆 开放时间8点', '图书馆 开放时间9点', 100, 100, '图书馆 开放时间10点', '图书馆 开放时间12点');
INSERT INTO `architecture` VALUES (2, '医务室', '江理医务室', 115.8771085876, 28.7397083728, 11, '/static/img/医务室.png', '医务室 开放时间8点', '医务室 开放时间9点', 80, 80, '医务室 开放时间10点', '医务室 开放时间12点');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `ID` bigint(22) NOT NULL,
  `comment_architecture_ID` bigint(22) NOT NULL,
  `comment_author` bigint(22) NOT NULL,
  `comment_target` bigint(22) NULL DEFAULT NULL,
  `comment_date` datetime NULL DEFAULT NULL,
  `comment_date_gmt` datetime NULL DEFAULT NULL,
  `comment_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comment_status` tinyint(4) NOT NULL,
  `comment_likenum` int(11) NULL DEFAULT NULL,
  `comment_parent` bigint(255) NULL DEFAULT NULL,
  `arg1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `ID` bigint(22) NOT NULL,
  `user_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_wxid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_date` datetime NULL DEFAULT NULL,
  `user_status` tinyint(255) NOT NULL,
  `user_role_id` tinyint(22) NOT NULL,
  `arg1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `arg3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
