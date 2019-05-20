package cn.tju.dao;

import cn.tju.pojo.GbmCNew;

public interface GbmCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(GbmCNew record);

    int insertSelective(GbmCNew record);

    GbmCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(GbmCNew record);

    int updateByPrimaryKey(GbmCNew record);
}