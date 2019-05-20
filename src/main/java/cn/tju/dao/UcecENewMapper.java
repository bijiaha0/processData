package cn.tju.dao;

import cn.tju.pojo.UcecENew;

public interface UcecENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcecENew record);

    int insertSelective(UcecENew record);

    UcecENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcecENew record);

    int updateByPrimaryKey(UcecENew record);
}