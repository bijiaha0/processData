package cn.tju.dao;

import cn.tju.pojo.TgctEOld;

public interface TgctEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(TgctEOld record);

    int insertSelective(TgctEOld record);

    TgctEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(TgctEOld record);

    int updateByPrimaryKey(TgctEOld record);
}