package cn.tju.dao;

import cn.tju.pojo.ThcaEOld;

public interface ThcaEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThcaEOld record);

    int insertSelective(ThcaEOld record);

    ThcaEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThcaEOld record);

    int updateByPrimaryKey(ThcaEOld record);
}