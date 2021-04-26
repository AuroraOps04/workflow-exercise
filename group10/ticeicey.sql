/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : ticeicey

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2021-04-24 15:32:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(25) DEFAULT NULL COMMENT '书名',
  `author` varchar(25) DEFAULT NULL COMMENT '作者',
  `publish` varchar(255) DEFAULT '' COMMENT '出版社',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES ('1', '《构建之法》', '邹欣', '人民邮电出版社');
INSERT INTO `book_info` VALUES ('2', '《网络爬虫》', '刘硕', '清华大学出版社');
INSERT INTO `book_info` VALUES ('3', '《计算机网络》', '谢希仁', '电子工业出版社');
INSERT INTO `book_info` VALUES ('4', '《C语言程序设计》', '叶东毅', '厦门大学出版社');
INSERT INTO `book_info` VALUES ('5', '《微积分》', '同济大学系', '高等教育出版社');
INSERT INTO `book_info` VALUES ('6', '《证券投资》', '刘元春', '上海财经大学出版社');
