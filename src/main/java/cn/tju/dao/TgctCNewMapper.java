package cn.tju.dao;

import cn.tju.pojo.TgctCNew;

public interface TgctCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(TgctCNew record);

    int insertSelective(TgctCNew record);

    TgctCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(TgctCNew record);

    int updateByPrimaryKey(TgctCNew record);
}