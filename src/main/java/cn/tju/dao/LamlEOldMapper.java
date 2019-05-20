package cn.tju.dao;

import cn.tju.pojo.LamlEOld;

public interface LamlEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LamlEOld record);

    int insertSelective(LamlEOld record);

    LamlEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LamlEOld record);

    int updateByPrimaryKey(LamlEOld record);
}