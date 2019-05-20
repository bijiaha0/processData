package cn.tju.dao;

import cn.tju.pojo.GbmEOld;

public interface GbmEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(GbmEOld record);

    int insertSelective(GbmEOld record);

    GbmEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(GbmEOld record);

    int updateByPrimaryKey(GbmEOld record);
}