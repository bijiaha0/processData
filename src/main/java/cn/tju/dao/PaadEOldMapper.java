package cn.tju.dao;

import cn.tju.pojo.PaadEOld;

public interface PaadEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PaadEOld record);

    int insertSelective(PaadEOld record);

    PaadEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PaadEOld record);

    int updateByPrimaryKey(PaadEOld record);
}