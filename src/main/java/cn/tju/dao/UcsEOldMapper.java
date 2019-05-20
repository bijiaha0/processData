package cn.tju.dao;

import cn.tju.pojo.UcsEOld;

public interface UcsEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcsEOld record);

    int insertSelective(UcsEOld record);

    UcsEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcsEOld record);

    int updateByPrimaryKey(UcsEOld record);
}