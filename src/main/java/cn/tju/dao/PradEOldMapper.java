package cn.tju.dao;

import cn.tju.pojo.PradEOld;

public interface PradEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PradEOld record);

    int insertSelective(PradEOld record);

    PradEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PradEOld record);

    int updateByPrimaryKey(PradEOld record);
}