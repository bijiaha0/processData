package cn.tju.dao;

import cn.tju.pojo.ThymEOld;

public interface ThymEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThymEOld record);

    int insertSelective(ThymEOld record);

    ThymEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThymEOld record);

    int updateByPrimaryKey(ThymEOld record);
}