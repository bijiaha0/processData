package cn.tju.dao;

import cn.tju.pojo.UcsENew;

public interface UcsENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcsENew record);

    int insertSelective(UcsENew record);

    UcsENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcsENew record);

    int updateByPrimaryKey(UcsENew record);
}