package cn.tju.dao;

import cn.tju.pojo.CholENew;

public interface CholENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CholENew record);

    int insertSelective(CholENew record);

    CholENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CholENew record);

    int updateByPrimaryKey(CholENew record);
}