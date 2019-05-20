package cn.tju.dao;

import cn.tju.pojo.MesoCNew;

public interface MesoCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(MesoCNew record);

    int insertSelective(MesoCNew record);

    MesoCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(MesoCNew record);

    int updateByPrimaryKey(MesoCNew record);
}