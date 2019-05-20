package cn.tju.dao;

import cn.tju.pojo.KichENew;

public interface KichENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KichENew record);

    int insertSelective(KichENew record);

    KichENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KichENew record);

    int updateByPrimaryKey(KichENew record);
}