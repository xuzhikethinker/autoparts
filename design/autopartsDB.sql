/*
SQLyog Job Agent Version 9.63 Copyright(c) Webyog Inc. All Rights Reserved.


MySQL - 5.5.28-log : Database - autoparts
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`autoparts` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `autoparts`;

/*Table structure for table `ap_company` */

DROP TABLE IF EXISTS `ap_company`;

CREATE TABLE `ap_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comp_name` varchar(100) NOT NULL COMMENT '��˾����',
  `comp_address` varchar(100) DEFAULT NULL COMMENT '��˾��ַ',
  `comp_principal` varchar(100) DEFAULT NULL COMMENT '��˾������',
  `comp_introduction` varchar(1000) DEFAULT NULL COMMENT '��˾����',
  `email_addr` varchar(100) DEFAULT NULL COMMENT '�����ʼ�',
  `contact_name` varchar(100) DEFAULT NULL COMMENT '��ϵ������',
  `phone_num` varchar(100) DEFAULT NULL COMMENT '�绰����',
  `fax_num` varchar(100) DEFAULT NULL COMMENT '�������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��˾��Ϣ��';

/*Data for the table `ap_company` */

/*Table structure for table `ap_order` */

DROP TABLE IF EXISTS `ap_order`;

CREATE TABLE `ap_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(100) DEFAULT NULL COMMENT '�¶����Ĺ�˾����',
  `address` varchar(100) DEFAULT NULL COMMENT '��˾��ַ',
  `contact_name` varchar(100) DEFAULT NULL COMMENT '��ϵ������',
  `email_addr` varchar(100) NOT NULL DEFAULT '0' COMMENT '��ϵ���ʼ���ַ',
  `phone_num` varchar(100) DEFAULT NULL COMMENT '�绰����',
  `fax_num` varchar(100) DEFAULT NULL COMMENT '����',
  `order_content` varchar(1000) NOT NULL COMMENT '��������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���϶�����Ϣ';

/*Data for the table `ap_order` */

/*Table structure for table `ap_product` */

DROP TABLE IF EXISTS `ap_product`;

CREATE TABLE `ap_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catalog_code` varchar(100) NOT NULL COMMENT '��ƷĿ¼����',
  `product_code` varchar(100) NOT NULL COMMENT '��Ʒ����',
  `product_name` varchar(100) NOT NULL COMMENT '��ƷӢ������',
  `product_name_cn` varchar(100) NOT NULL COMMENT '��Ʒ��������',
  `product_desc` varchar(1000) DEFAULT NULL COMMENT '��˾����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ��Ϣ��';

/*Data for the table `ap_product` */

/*Table structure for table `ap_product_catalog` */

DROP TABLE IF EXISTS `ap_product_catalog`;

CREATE TABLE `ap_product_catalog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catalog_code` varchar(100) NOT NULL COMMENT '��ƷĿ¼����',
  `catalog_name` varchar(100) NOT NULL COMMENT '��ƷĿ¼���ƣ�Ӣ��',
  `catalog_name_cn` varchar(100) NOT NULL COMMENT '��ƷĿ¼���ƣ�����',
  `catalog_file` varchar(100) NOT NULL COMMENT '��ƷĿ¼�ļ����ƣ����û�����',
  `parent_catalog_code` varchar(100) DEFAULT NULL COMMENT '����ƷĿ¼����',
  `catalog_desc` varchar(1000) DEFAULT NULL COMMENT '��˾����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ƷĿ¼��Ϣ';

/*Data for the table `ap_product_catalog` */

/*Table structure for table `ap_user` */

DROP TABLE IF EXISTS `ap_user`;

CREATE TABLE `ap_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL COMMENT '�û�����',
  `login_id` varchar(100) NOT NULL COMMENT '��¼id',
  `password` varchar(100) NOT NULL COMMENT '��¼����',
  `role` int(11) NOT NULL DEFAULT '0' COMMENT '��ɫ��0-��ͨ�û���1-����Ա',
  `email` varchar(100) DEFAULT NULL COMMENT '��ϵ�����ʼ���ַ',
  `contact_phone` varchar(100) DEFAULT NULL COMMENT '��ϵ�绰',
  `msn_num` varchar(100) DEFAULT NULL COMMENT 'MSN',
  `skype_num` varchar(100) DEFAULT NULL COMMENT 'SKYPE',
  `trade_manager_num` varchar(100) DEFAULT NULL COMMENT 'tradeManager',
  `fax_num` varchar(100) DEFAULT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='�û���Ϣ';

/*Data for the table `ap_user` */

insert  into `ap_user` values (1,'Limy Young','limy','798009',1,'yanglm@e-board.com.cn',NULL,NULL,'123456789','cn1001093468',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
