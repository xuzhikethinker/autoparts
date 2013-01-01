/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
DROP DATABASE IF EXISTS `autoparts`;
CREATE DATABASE `autoparts` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `autoparts`;

CREATE TABLE `ap_company`(
 `id` int NOT NULL AUTO_INCREMENT,
 `comp_name` varchar(100) NOT NULL COMMENT '公司名称',
 `comp_address` varchar(100) NULL COMMENT '公司地址',
 `comp_principal` varchar(100) NULL COMMENT '公司负责人', 
 `comp_introduction` varchar(1000) DEFAULT NULL COMMENT '公司介绍',
 `email_addr` varchar(100) DEFAULT NULL COMMENT '电子邮件',
 `contact_name` varchar(100) DEFAULT NULL COMMENT '联系人名称',
 `phone_num` varchar(100) DEFAULT NULL COMMENT '电话号码',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '传真号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '公司信息表';

CREATE TABLE `ap_product_catalog`(
 `id` int NOT NULL AUTO_INCREMENT,
 `catalog_code` varchar(100) NOT NULL COMMENT '产品目录代码',
 `catalog_name` varchar(100) NOT NULL COMMENT '产品目录名称，英文',
 `catalog_name_cn` varchar(100) NOT NULL COMMENT '产品目录名称，中文',
 `catalog_file` varchar(100) NOT NULL COMMENT '产品目录文件名称，供用户下载',
 `parent_catalog_code` varchar(100) NULL COMMENT '父产品目录代码', 
 `catalog_desc` varchar(1000) DEFAULT NULL COMMENT '公司介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '产品目录信息';


CREATE TABLE `ap_product`(
 `id` int NOT NULL AUTO_INCREMENT,
 `catalog_code` varchar(100) NOT NULL COMMENT '产品目录代码',
 `product_code` varchar(100) NOT NULL COMMENT '产品名称',
 `product_name` varchar(100) NOT NULL COMMENT '产品英文名称',
 `product_name_cn` varchar(100) NOT NULL COMMENT '产品中文名称',
 `product_desc` varchar(1000) DEFAULT NULL COMMENT '公司介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '产品信息表';

CREATE TABLE `ap_user`(
 `id` int NOT NULL AUTO_INCREMENT,
 `user_name` varchar(100) NOT NULL COMMENT '用户名称',
 `login_id` varchar(100) NOT NULL COMMENT '登录id',
 `password` varchar(100) NOT NULL COMMENT '登录密码',
 `role` int NOT NULL DEFAULT 0 COMMENT '角色，0-普通用户；1-管理员',
 `email` varchar(100) DEFAULT NULL COMMENT '联系电子邮件地址',
 `contact_phone` varchar(100) DEFAULT NULL COMMENT '联系电话',
 `msn_num` varchar(100) DEFAULT NULL COMMENT 'MSN',
 `skype_num` varchar(100) DEFAULT NULL COMMENT 'SKYPE',
 `trade_manager_num` varchar(100) DEFAULT NULL COMMENT 'tradeManager',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '传真',
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_id_UK1` (`login_id`)
) ENGINE=InnoDB COMMENT '用户信息';

CREATE TABLE `ap_order`(
 `id` int NOT NULL AUTO_INCREMENT,
 `company_name` varchar(100) DEFAULT NULL COMMENT '下订单的公司名称',
 `address` varchar(100) DEFAULT NULL COMMENT '公司地址',
 `contact_name` varchar(100) DEFAULT NULL COMMENT '联系人名称',
 `email_addr` varchar(100) NOT NULL DEFAULT 0 COMMENT '联系人邮件地址',
 `phone_num` varchar(100) DEFAULT NULL COMMENT '电话号码',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '传真',
 `order_content` varchar(1000) NOT NULL COMMENT '订单内容',
 `status` int NOT NULL DEFAULT 0 COMMENT '订单状态：0-新提交；1-已经查看',
 `create_time` datetime DEFAULT NULL,
 `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '网上订单信息';

