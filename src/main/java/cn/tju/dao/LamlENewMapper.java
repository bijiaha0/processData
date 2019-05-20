package cn.tju.dao;

import cn.tju.pojo.LamlENew;

public interface LamlENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LamlENew record);

    int insertSelective(LamlENew record);

    LamlENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LamlENew record);

    int updateByPrimaryKey(LamlENew record);
}