package cn.tju.dao;

import cn.tju.pojo.ThcaCNew;

public interface ThcaCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThcaCNew record);

    int insertSelective(ThcaCNew record);

    ThcaCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThcaCNew record);

    int updateByPrimaryKey(ThcaCNew record);
}