package cn.tju.dao;

import cn.tju.pojo.BlcaCNew;

public interface BlcaCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BlcaCNew record);

    int insertSelective(BlcaCNew record);

    BlcaCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BlcaCNew record);

    int updateByPrimaryKey(BlcaCNew record);
}