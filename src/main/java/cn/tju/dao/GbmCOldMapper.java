package cn.tju.dao;

import cn.tju.pojo.GbmCOld;

public interface GbmCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(GbmCOld record);

    int insertSelective(GbmCOld record);

    GbmCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(GbmCOld record);

    int updateByPrimaryKey(GbmCOld record);
}