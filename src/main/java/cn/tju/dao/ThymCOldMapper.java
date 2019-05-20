package cn.tju.dao;

import cn.tju.pojo.ThymCOld;

public interface ThymCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThymCOld record);

    int insertSelective(ThymCOld record);

    ThymCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThymCOld record);

    int updateByPrimaryKey(ThymCOld record);
}