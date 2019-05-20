package cn.tju.dao;

import cn.tju.pojo.KirpEOld;

public interface KirpEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KirpEOld record);

    int insertSelective(KirpEOld record);

    KirpEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KirpEOld record);

    int updateByPrimaryKey(KirpEOld record);
}