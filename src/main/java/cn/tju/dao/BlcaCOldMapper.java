package cn.tju.dao;

import cn.tju.pojo.BlcaCOld;

public interface BlcaCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BlcaCOld record);

    int insertSelective(BlcaCOld record);

    BlcaCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BlcaCOld record);

    int updateByPrimaryKey(BlcaCOld record);
}