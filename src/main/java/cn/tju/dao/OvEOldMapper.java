package cn.tju.dao;

import cn.tju.pojo.OvEOld;

public interface OvEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(OvEOld record);

    int insertSelective(OvEOld record);

    OvEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(OvEOld record);

    int updateByPrimaryKey(OvEOld record);
}