package cn.tju.dao;

import cn.tju.pojo.ThcaENew;

public interface ThcaENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThcaENew record);

    int insertSelective(ThcaENew record);

    ThcaENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThcaENew record);

    int updateByPrimaryKey(ThcaENew record);
}