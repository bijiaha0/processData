package cn.tju.dao;

import cn.tju.pojo.CescCNew;

public interface CescCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CescCNew record);

    int insertSelective(CescCNew record);

    CescCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CescCNew record);

    int updateByPrimaryKey(CescCNew record);
}