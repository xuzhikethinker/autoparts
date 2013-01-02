INSERT INTO ap_user (user_name, login_id, password, role, email, skype_num, trade_manager_num,comp_contact) VALUES ('Limy Young', 'limy', '798009', 1, 'yanglm@e-board.com.cn', '123456789', 'cn1001093468',1);

INSERT INTO ap_product_catalog (catalog_code,catalog_name) values ('WheelBearings','Wheel Bearings');
INSERT INTO ap_product_catalog (catalog_code,catalog_name) values ('ShockAbsorber','Shock Absorber');
INSERT INTO ap_product_catalog (catalog_code,catalog_name) values ('AutoParts','Auto Parts');

INSERT INTO ap_product_catalog (parent_catalog_code,catalog_code,catalog_name,catalog_file) values ('WheelBearings','ToyotaWheel','Toyota Series','ToyotaWheel.pdf');
INSERT INTO ap_product_catalog (parent_catalog_code,catalog_code,catalog_name,catalog_file) values ('WheelBearings','BMWWheel','BMW Series','BMWWheel.pdf');

INSERT INTO ap_product_catalog (parent_catalog_code,catalog_code,catalog_name,catalog_file) values ('ShockAbsorber','HondaShock','Honda Series','HondaShock.pdf');
INSERT INTO ap_product_catalog (parent_catalog_code,catalog_code,catalog_name,catalog_file) values ('ShockAbsorber','BMWShock','BMW Series','BMWShock.pdf');

INSERT INTO ap_product_catalog (parent_catalog_code,catalog_code,catalog_name,catalog_file) values ('AutoParts','HondaAuto','Honda Series','HondaAuto.pdf');

insert into ap_company(comp_name) values ("company name");