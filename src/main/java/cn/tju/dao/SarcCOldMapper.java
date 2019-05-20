package cn.tju.dao;

import cn.tju.pojo.SarcCOld;

public interface SarcCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SarcCOld record);

    int insertSelective(SarcCOld record);

    SarcCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SarcCOld record);

    int updateByPrimaryKey(SarcCOld record);
}