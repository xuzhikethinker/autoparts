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
 `comp_name` varchar(100) NOT NULL COMMENT '��˾����',
 `comp_address` varchar(100) NULL COMMENT '��˾��ַ',
 `comp_principal` varchar(100) NULL COMMENT '��˾������', 
 `comp_introduction` varchar(1000) DEFAULT NULL COMMENT '��˾����',
 `email_addr` varchar(100) DEFAULT NULL COMMENT '�����ʼ�',
 `contact_name` varchar(100) DEFAULT NULL COMMENT '��ϵ������',
 `phone_num` varchar(100) DEFAULT NULL COMMENT '�绰����',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '�������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '��˾��Ϣ��';

CREATE TABLE `ap_product_catalog`(
 `id` int NOT NULL AUTO_INCREMENT,
 `catalog_code` varchar(100) NOT NULL COMMENT '��ƷĿ¼����',
 `catalog_name` varchar(100) NOT NULL COMMENT '��ƷĿ¼���ƣ�Ӣ��',
 `catalog_name_cn` varchar(100) NOT NULL COMMENT '��ƷĿ¼���ƣ�����',
 `catalog_file` varchar(100) NOT NULL COMMENT '��ƷĿ¼�ļ����ƣ����û�����',
 `parent_catalog_code` varchar(100) NULL COMMENT '����ƷĿ¼����', 
 `catalog_desc` varchar(1000) DEFAULT NULL COMMENT '��˾����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '��ƷĿ¼��Ϣ';


CREATE TABLE `ap_product`(
 `id` int NOT NULL AUTO_INCREMENT,
 `catalog_code` varchar(100) NOT NULL COMMENT '��ƷĿ¼����',
 `product_code` varchar(100) NOT NULL COMMENT '��Ʒ����',
 `product_name` varchar(100) NOT NULL COMMENT '��ƷӢ������',
 `product_name_cn` varchar(100) NOT NULL COMMENT '��Ʒ��������',
 `product_desc` varchar(1000) DEFAULT NULL COMMENT '��˾����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '��Ʒ��Ϣ��';

CREATE TABLE `ap_user`(
 `id` int NOT NULL AUTO_INCREMENT,
 `user_name` varchar(100) NOT NULL COMMENT '�û�����',
 `login_id` varchar(100) NOT NULL COMMENT '��¼id',
 `password` varchar(100) NOT NULL COMMENT '��¼����',
 `role` int NOT NULL DEFAULT 0 COMMENT '��ɫ��0-��ͨ�û���1-����Ա',
 `email` varchar(100) DEFAULT NULL COMMENT '��ϵ�����ʼ���ַ',
 `contact_phone` varchar(100) DEFAULT NULL COMMENT '��ϵ�绰',
 `msn_num` varchar(100) DEFAULT NULL COMMENT 'MSN',
 `skype_num` varchar(100) DEFAULT NULL COMMENT 'SKYPE',
 `trade_manager_num` varchar(100) DEFAULT NULL COMMENT 'tradeManager',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '����',
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_id_UK1` (`login_id`)
) ENGINE=InnoDB COMMENT '�û���Ϣ';

CREATE TABLE `ap_order`(
 `id` int NOT NULL AUTO_INCREMENT,
 `company_name` varchar(100) DEFAULT NULL COMMENT '�¶����Ĺ�˾����',
 `address` varchar(100) DEFAULT NULL COMMENT '��˾��ַ',
 `contact_name` varchar(100) DEFAULT NULL COMMENT '��ϵ������',
 `email_addr` varchar(100) NOT NULL DEFAULT 0 COMMENT '��ϵ���ʼ���ַ',
 `phone_num` varchar(100) DEFAULT NULL COMMENT '�绰����',
 `fax_num` varchar(100) DEFAULT NULL COMMENT '����',
 `order_content` varchar(1000) NOT NULL COMMENT '��������',
 `status` int NOT NULL DEFAULT 0 COMMENT '����״̬��0-���ύ��1-�Ѿ��鿴',
 `create_time` datetime DEFAULT NULL,
 `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '���϶�����Ϣ';

