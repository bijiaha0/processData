package cn.tju.dao;

import cn.tju.pojo.PradCOld;

public interface PradCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PradCOld record);

    int insertSelective(PradCOld record);

    PradCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PradCOld record);

    int updateByPrimaryKey(PradCOld record);
}