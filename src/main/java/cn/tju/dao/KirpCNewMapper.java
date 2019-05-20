package cn.tju.dao;

import cn.tju.pojo.KirpCNew;

public interface KirpCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KirpCNew record);

    int insertSelective(KirpCNew record);

    KirpCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KirpCNew record);

    int updateByPrimaryKey(KirpCNew record);
}