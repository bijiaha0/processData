package cn.tju.dao;

import cn.tju.pojo.TgctENew;

public interface TgctENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(TgctENew record);

    int insertSelective(TgctENew record);

    TgctENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(TgctENew record);

    int updateByPrimaryKey(TgctENew record);
}