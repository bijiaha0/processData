package cn.tju.dao;

import cn.tju.pojo.CholEOld;

public interface CholEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CholEOld record);

    int insertSelective(CholEOld record);

    CholEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CholEOld record);

    int updateByPrimaryKey(CholEOld record);
}