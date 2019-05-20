package cn.tju.dao;

import cn.tju.pojo.KichEOld;

public interface KichEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KichEOld record);

    int insertSelective(KichEOld record);

    KichEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KichEOld record);

    int updateByPrimaryKey(KichEOld record);
}