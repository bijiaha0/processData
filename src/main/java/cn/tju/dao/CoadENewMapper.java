package cn.tju.dao;

import cn.tju.pojo.CoadENew;

public interface CoadENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CoadENew record);

    int insertSelective(CoadENew record);

    CoadENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CoadENew record);

    int updateByPrimaryKey(CoadENew record);
}