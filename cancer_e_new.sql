DROP TABLE IF EXISTS `acc_e_new`;
create table acc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `blca_e_new`;
create table blca_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `brca_e_new`;
create table brca_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `cesc_e_new`;
create table cesc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `chol_e_new`;
create table chol_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `coad_e_new`;
create table coad_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `dlbc_e_new`;
create table dlbc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `esca_e_new`;
create table esca_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `gbm_e_new`;
create table gbm_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `hnsc_e_new`;
create table hnsc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `kich_e_new`;
create table kich_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirc_e_new`;
create table kirc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirp_e_new`;
create table kirp_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `laml_e_new`;
create table laml_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lgg_e_new`;
create table lgg_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lihc_e_new`;
create table lihc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `luad_e_new`;
create table luad_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lusc_e_new`;
create table lusc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `meso_e_new`;
create table meso_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ov_e_new`;
create table ov_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `paad_e_new`;
create table paad_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `pcpg_e_new`;
create table pcpg_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `prad_e_new`;
create table prad_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `read_e_new`;
create table read_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `sarc_e_new`;
create table sarc_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `skcm_e_new`;
create table skcm_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `stad_e_new`;
create table stad_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `tgct_e_new`;
create table tgct_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thca_e_new`;
create table thca_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thym_e_new`;
create table thym_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucec_e_new`;
create table ucec_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;


DROP TABLE IF EXISTS `ucs_e_new`;
create table ucs_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `uvm_e_new`;
create table uvm_e_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l`TEXT ,
  `value_n_y`TEXT ,
  `value_t_l`TEXT ,
  `value_t_y`TEXT ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;