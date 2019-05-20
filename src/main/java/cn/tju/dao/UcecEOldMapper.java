package cn.tju.dao;

import cn.tju.pojo.UcecEOld;

public interface UcecEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcecEOld record);

    int insertSelective(UcecEOld record);

    UcecEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcecEOld record);

    int updateByPrimaryKey(UcecEOld record);
}