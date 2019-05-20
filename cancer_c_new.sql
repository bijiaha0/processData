
DROP TABLE IF EXISTS `acc_c_new`;
create table acc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `blca_c_new`;
create table blca_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `brca_c_new`;
create table brca_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `cesc_c_new`;
create table cesc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `chol_c_new`;
create table chol_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `coad_c_new`;
create table coad_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `dlbc_c_new`;
create table dlbc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `esca_c_new`;
create table esca_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `gbm_c_new`;
create table gbm_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `hnsc_c_new`;
create table hnsc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kich_c_new`;
create table kich_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirc_c_new`;
create table kirc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `kirp_c_new`;
create table kirp_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `laml_c_new`;
create table laml_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lgg_c_new`;
create table lgg_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lihc_c_new`;
create table lihc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `luad_c_new`;
create table luad_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `lusc_c_new`;
create table lusc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `meso_c_new`;
create table meso_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ov_c_new`;
create table ov_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `paad_c_new`;
create table paad_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `pcpg_c_new`;
create table pcpg_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `prad_c_new`;
create table prad_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `read_c_new`;
create table read_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `sarc_c_new`;
create table sarc_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `skcm_c_new`;
create table skcm_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `stad_c_new`;
create table stad_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `tgct_c_new`;
create table tgct_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thca_c_new`;
create table thca_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `thym_c_new`;
create table thym_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucec_c_new`;
create table ucec_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `ucs_c_new`;
create table ucs_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;

DROP TABLE IF EXISTS `uvm_c_new`;
create table uvm_c_new(
  `gene_id` int(11) not null auto_increment,
  `value_n_l` text ,
  `value_n_y` text ,
  `value_t_l` text ,
  `value_t_y` text ,
  primary key(`gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=4;