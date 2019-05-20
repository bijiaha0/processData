package cn.tju.dao;

import cn.tju.pojo.PradCNew;

public interface PradCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PradCNew record);

    int insertSelective(PradCNew record);

    PradCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PradCNew record);

    int updateByPrimaryKey(PradCNew record);
}