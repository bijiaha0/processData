package cn.tju.dao;

import cn.tju.pojo.BlcaENew;

public interface BlcaENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BlcaENew record);

    int insertSelective(BlcaENew record);

    BlcaENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BlcaENew record);

    int updateByPrimaryKey(BlcaENew record);
}