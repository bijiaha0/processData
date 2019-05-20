package cn.tju.dao;

import cn.tju.pojo.ThymENew;

public interface ThymENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThymENew record);

    int insertSelective(ThymENew record);

    ThymENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThymENew record);

    int updateByPrimaryKey(ThymENew record);
}