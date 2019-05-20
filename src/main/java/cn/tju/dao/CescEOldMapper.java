package cn.tju.dao;

import cn.tju.pojo.CescEOld;

public interface CescEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CescEOld record);

    int insertSelective(CescEOld record);

    CescEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CescEOld record);

    int updateByPrimaryKey(CescEOld record);
}