package cn.tju.dao;

import cn.tju.pojo.EscaCNew;

public interface EscaCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(EscaCNew record);

    int insertSelective(EscaCNew record);

    EscaCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(EscaCNew record);

    int updateByPrimaryKey(EscaCNew record);
}