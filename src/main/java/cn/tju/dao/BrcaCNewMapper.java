package cn.tju.dao;

import cn.tju.pojo.BrcaCNew;

public interface BrcaCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BrcaCNew record);

    int insertSelective(BrcaCNew record);

    BrcaCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BrcaCNew record);

    int updateByPrimaryKey(BrcaCNew record);
}