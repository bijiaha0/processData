package cn.tju.dao;

import cn.tju.pojo.HnscEOld;

public interface HnscEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(HnscEOld record);

    int insertSelective(HnscEOld record);

    HnscEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(HnscEOld record);

    int updateByPrimaryKey(HnscEOld record);
}