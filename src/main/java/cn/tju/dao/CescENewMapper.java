package cn.tju.dao;

import cn.tju.pojo.CescENew;

public interface CescENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CescENew record);

    int insertSelective(CescENew record);

    CescENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CescENew record);

    int updateByPrimaryKey(CescENew record);
}