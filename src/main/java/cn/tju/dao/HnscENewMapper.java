package cn.tju.dao;

import cn.tju.pojo.HnscENew;

public interface HnscENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(HnscENew record);

    int insertSelective(HnscENew record);

    HnscENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(HnscENew record);

    int updateByPrimaryKey(HnscENew record);
}