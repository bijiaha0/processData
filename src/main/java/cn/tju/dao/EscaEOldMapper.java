package cn.tju.dao;

import cn.tju.pojo.EscaEOld;

public interface EscaEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(EscaEOld record);

    int insertSelective(EscaEOld record);

    EscaEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(EscaEOld record);

    int updateByPrimaryKey(EscaEOld record);
}