package cn.tju.dao;

import cn.tju.pojo.DlbcENew;

public interface DlbcENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(DlbcENew record);

    int insertSelective(DlbcENew record);

    DlbcENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(DlbcENew record);

    int updateByPrimaryKey(DlbcENew record);
}