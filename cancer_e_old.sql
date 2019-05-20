
DROP TABLE IF EXISTS `acc_e_old`;
create table acc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `blca_e_old`;
create table blca_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `brca_e_old`;
create table brca_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `cesc_e_old`;
create table cesc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `chol_e_old`;
create table chol_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `coad_e_old`;
create table coad_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `dlbc_e_old`;
create table dlbc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `esca_e_old`;
create table esca_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `gbm_e_old`;
create table gbm_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `hnsc_e_old`;
create table hnsc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `kich_e_old`;
create table kich_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirc_e_old`;
create table kirc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirp_e_old`;
create table kirp_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `laml_e_old`;
create table laml_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lgg_e_old`;
create table lgg_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lihc_e_old`;
create table lihc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `luad_e_old`;
create table luad_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lusc_e_old`;
create table lusc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `meso_e_old`;
create table meso_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ov_e_old`;
create table ov_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `paad_e_old`;
create table paad_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `pcpg_e_old`;
create table pcpg_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `prad_e_old`;
create table prad_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `read_e_old`;
create table read_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `sarc_e_old`;
create table sarc_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `skcm_e_old`;
create table skcm_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `stad_e_old`;
create table stad_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `tgct_e_old`;
create table tgct_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thca_e_old`;
create table thca_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thym_e_old`;
create table thym_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucec_e_old`;
create table ucec_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `ucs_e_old`;
create table ucs_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `uvm_e_old`;
create table uvm_e_old(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;