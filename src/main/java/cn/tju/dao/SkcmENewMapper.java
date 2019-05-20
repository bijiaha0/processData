package cn.tju.dao;

import cn.tju.pojo.SkcmENew;

public interface SkcmENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SkcmENew record);

    int insertSelective(SkcmENew record);

    SkcmENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SkcmENew record);

    int updateByPrimaryKey(SkcmENew record);
}