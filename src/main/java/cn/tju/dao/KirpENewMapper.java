package cn.tju.dao;

import cn.tju.pojo.KirpENew;

public interface KirpENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KirpENew record);

    int insertSelective(KirpENew record);

    KirpENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KirpENew record);

    int updateByPrimaryKey(KirpENew record);
}