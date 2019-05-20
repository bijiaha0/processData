package cn.tju.dao;

import cn.tju.pojo.SarcEOld;

public interface SarcEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SarcEOld record);

    int insertSelective(SarcEOld record);

    SarcEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SarcEOld record);

    int updateByPrimaryKey(SarcEOld record);
}