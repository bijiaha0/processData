package cn.tju.dao;

import cn.tju.pojo.AccENew;

public interface AccENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(AccENew record);

    int insertSelective(AccENew record);

    AccENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(AccENew record);

    int updateByPrimaryKey(AccENew record);
}