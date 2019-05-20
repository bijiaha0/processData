package cn.tju.dao;

import cn.tju.pojo.LggCNew;

public interface LggCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LggCNew record);

    int insertSelective(LggCNew record);

    LggCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LggCNew record);

    int updateByPrimaryKey(LggCNew record);
}