package cn.tju.dao;

import cn.tju.pojo.PaadENew;

public interface PaadENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PaadENew record);

    int insertSelective(PaadENew record);

    PaadENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PaadENew record);

    int updateByPrimaryKey(PaadENew record);
}