package cn.tju.dao;

import cn.tju.pojo.TgctCOld;

public interface TgctCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(TgctCOld record);

    int insertSelective(TgctCOld record);

    TgctCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(TgctCOld record);

    int updateByPrimaryKey(TgctCOld record);
}