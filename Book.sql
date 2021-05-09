/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : 211806243db

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2021-04-25 08:24:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `Bid` int NOT NULL,
  `Bname` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Author` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '红楼梦', '曹雪芹');
INSERT INTO `book` VALUES ('2', '史记', '司马迁');
INSERT INTO `book` VALUES ('3', '1984', '乔治·奥威尔');
INSERT INTO `book` VALUES ('4', '边城', '沈从文');
INSERT INTO `book` VALUES ('5', '白夜行', '东野圭吾');
INSERT INTO `book` VALUES ('6', '挪威的森林', '村上春树');
INSERT INTO `book` VALUES ('7', '活着', '余华');
INSERT INTO `book` VALUES ('8', '看见', '柴静');
INSERT INTO `book` VALUES ('9', '三体', '刘慈欣');
INSERT INTO `book` VALUES ('10', '我们仨', '杨绛');
INSERT INTO `book` VALUES ('11', '构建之法', '张栋');
