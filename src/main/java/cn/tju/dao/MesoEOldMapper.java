package cn.tju.dao;

import cn.tju.pojo.MesoEOld;

public interface MesoEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(MesoEOld record);

    int insertSelective(MesoEOld record);

    MesoEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(MesoEOld record);

    int updateByPrimaryKey(MesoEOld record);
}