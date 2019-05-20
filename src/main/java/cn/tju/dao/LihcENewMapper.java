package cn.tju.dao;

import cn.tju.pojo.LihcENew;

public interface LihcENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LihcENew record);

    int insertSelective(LihcENew record);

    LihcENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LihcENew record);

    int updateByPrimaryKey(LihcENew record);
}