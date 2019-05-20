package cn.tju.dao;

import cn.tju.pojo.ThymCNew;

public interface ThymCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThymCNew record);

    int insertSelective(ThymCNew record);

    ThymCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThymCNew record);

    int updateByPrimaryKey(ThymCNew record);
}