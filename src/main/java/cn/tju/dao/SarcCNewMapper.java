package cn.tju.dao;

import cn.tju.pojo.SarcCNew;

public interface SarcCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SarcCNew record);

    int insertSelective(SarcCNew record);

    SarcCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SarcCNew record);

    int updateByPrimaryKey(SarcCNew record);
}