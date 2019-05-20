package cn.tju.dao;

import cn.tju.pojo.LuscCNew;

public interface LuscCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuscCNew record);

    int insertSelective(LuscCNew record);

    LuscCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuscCNew record);

    int updateByPrimaryKey(LuscCNew record);
}