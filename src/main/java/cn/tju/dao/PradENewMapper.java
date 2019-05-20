package cn.tju.dao;

import cn.tju.pojo.PradENew;

public interface PradENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PradENew record);

    int insertSelective(PradENew record);

    PradENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PradENew record);

    int updateByPrimaryKey(PradENew record);
}