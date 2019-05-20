package cn.tju.dao;

import cn.tju.pojo.LggENew;

public interface LggENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LggENew record);

    int insertSelective(LggENew record);

    LggENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LggENew record);

    int updateByPrimaryKey(LggENew record);
}