package cn.tju.dao;

import cn.tju.pojo.StadENew;

public interface StadENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(StadENew record);

    int insertSelective(StadENew record);

    StadENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(StadENew record);

    int updateByPrimaryKey(StadENew record);
}