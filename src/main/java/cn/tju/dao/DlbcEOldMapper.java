package cn.tju.dao;

import cn.tju.pojo.DlbcEOld;

public interface DlbcEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(DlbcEOld record);

    int insertSelective(DlbcEOld record);

    DlbcEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(DlbcEOld record);

    int updateByPrimaryKey(DlbcEOld record);
}