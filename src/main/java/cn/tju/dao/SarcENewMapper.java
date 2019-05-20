package cn.tju.dao;

import cn.tju.pojo.SarcENew;

public interface SarcENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SarcENew record);

    int insertSelective(SarcENew record);

    SarcENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SarcENew record);

    int updateByPrimaryKey(SarcENew record);
}