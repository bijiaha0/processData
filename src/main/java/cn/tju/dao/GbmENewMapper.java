package cn.tju.dao;

import cn.tju.pojo.GbmENew;

public interface GbmENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(GbmENew record);

    int insertSelective(GbmENew record);

    GbmENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(GbmENew record);

    int updateByPrimaryKey(GbmENew record);
}