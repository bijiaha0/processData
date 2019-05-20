package cn.tju.dao;

import cn.tju.pojo.LuscEOld;

public interface LuscEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuscEOld record);

    int insertSelective(LuscEOld record);

    LuscEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuscEOld record);

    int updateByPrimaryKey(LuscEOld record);
}