package cn.tju.dao;

import cn.tju.pojo.DlbcCNew;

public interface DlbcCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(DlbcCNew record);

    int insertSelective(DlbcCNew record);

    DlbcCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(DlbcCNew record);

    int updateByPrimaryKey(DlbcCNew record);
}