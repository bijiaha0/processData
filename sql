-- 本地文件导入
LOAD DATA LOCAL INFILE '/Users/student/Desktop/c_gene_old.txt'
REPLACE INTO TABLE c_gene_new_all
FIELDS TERMINATED BY '\t'
(gene_name, chr, start, stop, cyto, arm);
--

-- 删除
DELETE FROM c_e_gene_new WHERE id in (SELECT a.id FROM(SELECT id from c_e_gene_new WHERE (gene_name,chr) IN(SELECT gene_name,chr
FROM c_e_gene_new GROUP BY gene_name,chr HAVING COUNT(*)>1) and id not in(SELECT MIN(id) from c_e_gene_new GROUP BY gene_name,chr HAVING COUNT(*)>1)) a);

-- using的使用
select c_gene_new.id AS id_c, e_gene_new.id AS id_e, c_gene_new.gene_name AS gene_name, c_gene_new.chr AS chr
from c_gene_new  join e_gene_new using(gene_name) where c_gene_new.chr = e_gene_new.chr order by c_gene_new.id asc;


DROP TABLE IF EXISTS `c_gene_new`;
CREATE TABLE `c_gene_new`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_name` varchar(30) ,
  `chr` varchar(2) ,
  `start` int(11) ,
  `stop` int(11) ,
  `cyto` varchar(10) ,
  `arm` char(1) ,
  PRIMARY KEY (`id`),
  KEY `chr_index` (`chr`) USING BTREE,
  KEY `chr_gene_name_index` (`chr`,`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `c_gene_old`;
CREATE TABLE `c_gene_old` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_name` varchar(30),
  `chr` varchar(2),
  `start` int(11),
  `stop` int(11),
  `cyto` varchar(10),
  `arm` char(1),
  PRIMARY KEY (`id`),
  KEY `chr_index` (`chr`) USING BTREE,
  KEY `chr_gene_name_index` (`chr`,`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_gene_new`;
CREATE TABLE `e_gene_new`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_name` varchar(30) ,
  `chr` varchar(2) ,
  `start` int(11) ,
  `stop` int(11) ,
  `cyto` varchar(10) ,
  `arm` char(1) ,
  PRIMARY KEY (`id`),
  KEY `chr_index` (`chr`) USING BTREE,
  KEY `chr_gene_name_index` (`chr`,`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_gene_old`;
CREATE TABLE `e_gene_old` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_name` varchar(30),
  `chr` varchar(2),
  `start` int(11),
  `stop` int(11),
  `cyto` varchar(10),
  `arm` char(1),
  PRIMARY KEY (`id`),
  KEY `chr_index` (`chr`) USING BTREE,
  KEY `chr_gene_name_index` (`chr`,`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table c_e_gene_new(
  `gene_id` int(11) not null auto_increment,
  `id_c` int(11) ,
  `id_e` int(11) ,
  `gene_name` varchar(30) ,
  `chr` varchar(2) ,
  primary key(`gene_id`),
  KEY `gene_name_index` (`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_e_gene_old`;
create table c_e_gene_old(
  `gene_id` int(11) not null auto_increment,
  `id_c` int(11) ,
  `id_e` int(11) ,
  `gene_name` varchar(30) ,
  `chr` varchar(2) ,
  primary key(`gene_id`),
  KEY `gene_name_index` (`gene_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




CREATE TABLE `sample_c_new`(
  `cancer_name` varchar(10) ,
  `sample_id_n`  text ,
  `sample_id_t`  text ,
  KEY `cancer_name_index` (`cancer_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

CREATE TABLE `sample_e_new`(
  `cancer_name` varchar(10) ,
  `sample_id_n`  text ,
  `sample_id_t`  text ,
  KEY `cancer_name_index` (`cancer_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

CREATE TABLE `sample_c_old`(
  `cancer_name` varchar(10) ,
  `sample_id_n`  text ,
  `sample_id_t`  text ,
  KEY `cancer_name_index` (`cancer_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

CREATE TABLE `sample_e_old`(
  `cancer_name` varchar(10) ,
  `sample_id_n`  text ,
  `sample_id_t`  text ,
  KEY `cancer_name_index` (`cancer_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;



DROP TABLE IF EXISTS `c_n_l_new_moutain`;
CREATE TABLE `c_n_l_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_n_y_new_moutain`;
CREATE TABLE `c_n_y_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_t_l_new_moutain`;
CREATE TABLE `c_t_l_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_t_y_new_moutain`;
CREATE TABLE `c_t_y_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_n_l_old_moutain`;
CREATE TABLE `c_n_l_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_n_y_old_moutain`;
CREATE TABLE `c_n_y_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_t_l_old_moutain`;
CREATE TABLE `c_t_l_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `c_t_y_old_moutain`;
CREATE TABLE `c_t_y_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(7,4) DEFAULT NULL,
  `mean` double(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_n_l_new_moutain`;
CREATE TABLE `e_n_l_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(10,4) DEFAULT NULL,
  `mean` double(10,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_n_y_new_moutain`;
CREATE TABLE `e_n_y_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(10,4) DEFAULT NULL,
  `mean` double(10,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_t_l_new_moutain`;
CREATE TABLE `e_t_l_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(10,4) DEFAULT NULL,
  `mean` double(10,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `e_t_y_new_moutain`;
CREATE TABLE `e_t_y_new_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(10,4) DEFAULT NULL,
  `mean` double(10,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_n_l_old_moutain`;
CREATE TABLE `e_n_l_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(12,4) DEFAULT NULL,
  `mean` double(12,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_n_y_old_moutain`;
CREATE TABLE `e_n_y_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(12,4) DEFAULT NULL,
  `mean` double(12,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_t_l_old_moutain`;
CREATE TABLE `e_t_l_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(12,4) DEFAULT NULL,
  `mean` double(12,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `e_t_y_old_moutain`;
CREATE TABLE `e_t_y_old_moutain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gene_id` int(11) DEFAULT NULL,
  `cancer_name` varchar(6) DEFAULT NULL,
  `mid` double(12,4) DEFAULT NULL,
  `mean` double(12,4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cancer_name_gene_id_index` (`cancer_name`,`gene_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;







