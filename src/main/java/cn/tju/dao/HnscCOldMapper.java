package cn.tju.dao;

import cn.tju.pojo.HnscCOld;

public interface HnscCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(HnscCOld record);

    int insertSelective(HnscCOld record);

    HnscCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(HnscCOld record);

    int updateByPrimaryKey(HnscCOld record);
}