package cn.tju.dao;

import cn.tju.pojo.AccCNew;

public interface AccCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(AccCNew record);

    int insertSelective(AccCNew record);

    AccCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(AccCNew record);

    int updateByPrimaryKey(AccCNew record);
}