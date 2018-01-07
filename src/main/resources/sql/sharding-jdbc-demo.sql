/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : sharding-jdbc-demo

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-07 11:23:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order_0
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_1
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_2
-- ----------------------------
DROP TABLE IF EXISTS `t_order_2`;
CREATE TABLE `t_order_2` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_3
-- ----------------------------
DROP TABLE IF EXISTS `t_order_3`;
CREATE TABLE `t_order_3` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=154553722372882434 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_4
-- ----------------------------
DROP TABLE IF EXISTS `t_order_4`;
CREATE TABLE `t_order_4` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_5
-- ----------------------------
DROP TABLE IF EXISTS `t_order_5`;
CREATE TABLE `t_order_5` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=154553722259636226 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_6
-- ----------------------------
DROP TABLE IF EXISTS `t_order_6`;
CREATE TABLE `t_order_6` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_7
-- ----------------------------
DROP TABLE IF EXISTS `t_order_7`;
CREATE TABLE `t_order_7` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_8
-- ----------------------------
DROP TABLE IF EXISTS `t_order_8`;
CREATE TABLE `t_order_8` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_9
-- ----------------------------
DROP TABLE IF EXISTS `t_order_9`;
CREATE TABLE `t_order_9` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
