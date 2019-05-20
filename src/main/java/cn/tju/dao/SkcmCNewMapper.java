package cn.tju.dao;

import cn.tju.pojo.SkcmCNew;

public interface SkcmCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SkcmCNew record);

    int insertSelective(SkcmCNew record);

    SkcmCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SkcmCNew record);

    int updateByPrimaryKey(SkcmCNew record);
}