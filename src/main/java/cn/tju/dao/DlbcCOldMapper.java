package cn.tju.dao;

import cn.tju.pojo.DlbcCOld;

public interface DlbcCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(DlbcCOld record);

    int insertSelective(DlbcCOld record);

    DlbcCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(DlbcCOld record);

    int updateByPrimaryKey(DlbcCOld record);
}