package cn.tju.dao;

import cn.tju.pojo.OvENew;

public interface OvENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(OvENew record);

    int insertSelective(OvENew record);

    OvENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(OvENew record);

    int updateByPrimaryKey(OvENew record);
}