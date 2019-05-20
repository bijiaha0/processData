package cn.tju.dao;

import cn.tju.pojo.MesoCOld;

public interface MesoCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(MesoCOld record);

    int insertSelective(MesoCOld record);

    MesoCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(MesoCOld record);

    int updateByPrimaryKey(MesoCOld record);
}