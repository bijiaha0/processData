package cn.tju.dao;

import cn.tju.pojo.LggCOld;

public interface LggCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LggCOld record);

    int insertSelective(LggCOld record);

    LggCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LggCOld record);

    int updateByPrimaryKey(LggCOld record);
}