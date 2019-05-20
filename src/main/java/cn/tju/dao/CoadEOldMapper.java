package cn.tju.dao;

import cn.tju.pojo.CoadEOld;

public interface CoadEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CoadEOld record);

    int insertSelective(CoadEOld record);

    CoadEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CoadEOld record);

    int updateByPrimaryKey(CoadEOld record);
}