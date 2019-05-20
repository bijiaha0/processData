package cn.tju.dao;

import cn.tju.pojo.SkcmEOld;

public interface SkcmEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SkcmEOld record);

    int insertSelective(SkcmEOld record);

    SkcmEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SkcmEOld record);

    int updateByPrimaryKey(SkcmEOld record);
}