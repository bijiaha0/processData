package cn.tju.dao;

import cn.tju.pojo.LggEOld;

public interface LggEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LggEOld record);

    int insertSelective(LggEOld record);

    LggEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LggEOld record);

    int updateByPrimaryKey(LggEOld record);
}