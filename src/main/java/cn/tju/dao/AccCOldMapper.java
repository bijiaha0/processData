package cn.tju.dao;

import cn.tju.pojo.AccCOld;

public interface AccCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(AccCOld record);

    int insertSelective(AccCOld record);

    AccCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(AccCOld record);

    int updateByPrimaryKey(AccCOld record);
}