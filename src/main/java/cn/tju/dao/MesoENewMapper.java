package cn.tju.dao;

import cn.tju.pojo.MesoENew;

public interface MesoENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(MesoENew record);

    int insertSelective(MesoENew record);

    MesoENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(MesoENew record);

    int updateByPrimaryKey(MesoENew record);
}