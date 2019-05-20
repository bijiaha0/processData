package cn.tju.dao;

import cn.tju.pojo.LihcCNew;

public interface LihcCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LihcCNew record);

    int insertSelective(LihcCNew record);

    LihcCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LihcCNew record);

    int updateByPrimaryKey(LihcCNew record);
}