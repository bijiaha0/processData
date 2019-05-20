package cn.tju.dao;

import cn.tju.pojo.CholCOld;

public interface CholCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CholCOld record);

    int insertSelective(CholCOld record);

    CholCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CholCOld record);

    int updateByPrimaryKey(CholCOld record);
}