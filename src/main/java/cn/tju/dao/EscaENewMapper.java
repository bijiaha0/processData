package cn.tju.dao;

import cn.tju.pojo.EscaENew;

public interface EscaENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(EscaENew record);

    int insertSelective(EscaENew record);

    EscaENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(EscaENew record);

    int updateByPrimaryKey(EscaENew record);
}