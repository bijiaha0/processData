DROP TABLE IF EXISTS `acc_c_old`;
create table acc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `blca_c_old`;
create table blca_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `brca_c_old`;
create table brca_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `cesc_c_old`;
create table cesc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `chol_c_old`;
create table chol_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `coad_c_old`;
create table coad_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `dlbc_c_old`;
create table dlbc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `esca_c_old`;
create table esca_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `gbm_c_old`;
create table gbm_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `hnsc_c_old`;
create table hnsc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kich_c_old`;
create table kich_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirc_c_old`;
create table kirc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirp_c_old`;
create table kirp_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `laml_c_old`;
create table laml_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lgg_c_old`;
create table lgg_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lihc_c_old`;
create table lihc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `luad_c_old`;
create table luad_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lusc_c_old`;
create table lusc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `meso_c_old`;
create table meso_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ov_c_old`;
create table ov_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `paad_c_old`;
create table paad_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `pcpg_c_old`;
create table pcpg_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `prad_c_old`;
create table prad_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `read_c_old`;
create table read_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `sarc_c_old`;
create table sarc_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `skcm_c_old`;
create table skcm_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `stad_c_old`;
create table stad_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `tgct_c_old`;
create table tgct_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thca_c_old`;
create table thca_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thym_c_old`;
create table thym_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucec_c_old`;
create table ucec_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucs_c_old`;
create table ucs_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `uvm_c_old`;
create table uvm_c_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;