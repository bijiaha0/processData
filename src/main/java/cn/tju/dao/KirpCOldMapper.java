package cn.tju.dao;

import cn.tju.pojo.KirpCOld;

public interface KirpCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KirpCOld record);

    int insertSelective(KirpCOld record);

    KirpCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KirpCOld record);

    int updateByPrimaryKey(KirpCOld record);
}