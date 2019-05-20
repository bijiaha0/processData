package cn.tju.dao;

import cn.tju.pojo.LuscENew;

public interface LuscENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuscENew record);

    int insertSelective(LuscENew record);

    LuscENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuscENew record);

    int updateByPrimaryKey(LuscENew record);
}