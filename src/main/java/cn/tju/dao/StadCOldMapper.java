package cn.tju.dao;

import cn.tju.pojo.StadCOld;

public interface StadCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(StadCOld record);

    int insertSelective(StadCOld record);

    StadCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(StadCOld record);

    int updateByPrimaryKey(StadCOld record);
}