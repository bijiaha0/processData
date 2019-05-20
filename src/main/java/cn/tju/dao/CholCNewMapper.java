package cn.tju.dao;

import cn.tju.pojo.CholCNew;

public interface CholCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CholCNew record);

    int insertSelective(CholCNew record);

    CholCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CholCNew record);

    int updateByPrimaryKey(CholCNew record);
}