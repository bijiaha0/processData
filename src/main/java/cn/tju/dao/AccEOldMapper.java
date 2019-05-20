package cn.tju.dao;

import cn.tju.pojo.AccEOld;

public interface AccEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(AccEOld record);

    int insertSelective(AccEOld record);

    AccEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(AccEOld record);

    int updateByPrimaryKey(AccEOld record);
}