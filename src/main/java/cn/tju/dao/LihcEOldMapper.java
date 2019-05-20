package cn.tju.dao;

import cn.tju.pojo.LihcEOld;

public interface LihcEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LihcEOld record);

    int insertSelective(LihcEOld record);

    LihcEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LihcEOld record);

    int updateByPrimaryKey(LihcEOld record);
}