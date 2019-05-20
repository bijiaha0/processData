package cn.tju.dao;

import cn.tju.pojo.LihcCOld;

public interface LihcCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LihcCOld record);

    int insertSelective(LihcCOld record);

    LihcCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LihcCOld record);

    int updateByPrimaryKey(LihcCOld record);
}