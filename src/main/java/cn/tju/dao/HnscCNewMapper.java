package cn.tju.dao;

import cn.tju.pojo.HnscCNew;

public interface HnscCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(HnscCNew record);

    int insertSelective(HnscCNew record);

    HnscCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(HnscCNew record);

    int updateByPrimaryKey(HnscCNew record);
}