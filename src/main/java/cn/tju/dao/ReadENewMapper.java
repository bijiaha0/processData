package cn.tju.dao;

import cn.tju.pojo.ReadENew;

public interface ReadENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ReadENew record);

    int insertSelective(ReadENew record);

    ReadENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ReadENew record);

    int updateByPrimaryKey(ReadENew record);
}