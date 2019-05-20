package cn.tju.dao;

import cn.tju.pojo.ReadEOld;

public interface ReadEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ReadEOld record);

    int insertSelective(ReadEOld record);

    ReadEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ReadEOld record);

    int updateByPrimaryKey(ReadEOld record);
}