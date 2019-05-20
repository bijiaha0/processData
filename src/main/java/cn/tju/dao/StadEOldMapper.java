package cn.tju.dao;

import cn.tju.pojo.StadEOld;

public interface StadEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(StadEOld record);

    int insertSelective(StadEOld record);

    StadEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(StadEOld record);

    int updateByPrimaryKey(StadEOld record);
}