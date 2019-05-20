package cn.tju.dao;

import cn.tju.pojo.CescCOld;

public interface CescCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CescCOld record);

    int insertSelective(CescCOld record);

    CescCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CescCOld record);

    int updateByPrimaryKey(CescCOld record);
}