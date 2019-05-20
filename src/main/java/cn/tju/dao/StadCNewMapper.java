package cn.tju.dao;

import cn.tju.pojo.StadCNew;

public interface StadCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(StadCNew record);

    int insertSelective(StadCNew record);

    StadCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(StadCNew record);

    int updateByPrimaryKey(StadCNew record);
}