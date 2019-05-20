package cn.tju.dao;

import cn.tju.pojo.BrcaENew;

public interface BrcaENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BrcaENew record);

    int insertSelective(BrcaENew record);

    BrcaENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BrcaENew record);

    int updateByPrimaryKey(BrcaENew record);
}