/*数据表*/
create table acc_c_new(
  `geneId` int not null auto_increment,
  `valueNL`text,
  `valueNY`text,
  `valueTL`text,
  `valueTY`text,
  primary key(`geneId`)
) engine=innodb;
create table acc_e(
  `geneId` int not null auto_increment,
  `valueNL`text,
  `valueNY`text,
  `valueTL`text,
  `valueTY`text,
  primary key(`geneId`)
) engine=innodb;
/*样本表*/
create table sample_c(
  `cancerId` int not null auto_increment,
  `cancerName` varchar(5),
  `sampleIdN` text,
  `sampleIdT` text,
  primary key(`cancerId`)
) engine=innodb;
/*geneID表*/
create table c_gene(
  `id` int not null auto_increment,
  `geneName`varchar(30) ,
  primary key(`id`)
) engine=innodb;
create table c_gene_all(
  `id` int not null auto_increment,
  `geneName`varchar(30) ,
  `chr` varchar(2),
  `start` int,
  `stop` int,
  `cyto` varchar(10),
  `arm` char(1),
  primary key(`id`)
) engine=innodb;
create table e_gene(
  `id` int not null auto_increment,
  `geneName`varchar(30) ,
  primary key(`id`)
) engine=innodb;
create table c_mean_mountain(
  `id` int not null auto_increment,
  `chr` varchar(5),
  `cancerName` varchar(10),
  `NL` text,
  `NY` text,
  `TL` text,
  `TY` text,
  primary key(`id`)
)engine=innodb;
create table c_mid_mountain(
  `id` int not null auto_increment,
  `chr` varchar(5),
  `cancerName` varchar(10),
  `NL` text,
  `NY` text,
  `TL` text,
  `TY` text,
  primary key(`id`)
)engine=innodb;
//创建索引
create index c_mid_mountain_chrIndex on c_mid_mountain(chr);
create index c_mid_mountain_cancerNameIndex on c_mid_mountain(cancerName);
create index c_mean_mountain_chrIndex on c_mean_mountain(chr);
create index c_mean_mountain_cancerNameIndex on c_mean_mountain(cancerName);