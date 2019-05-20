package cn.tju.dao;

import cn.tju.pojo.BlcaEOld;

public interface BlcaEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BlcaEOld record);

    int insertSelective(BlcaEOld record);

    BlcaEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BlcaEOld record);

    int updateByPrimaryKey(BlcaEOld record);
}