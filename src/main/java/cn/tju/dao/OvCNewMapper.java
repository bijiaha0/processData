package cn.tju.dao;

import cn.tju.pojo.OvCNew;

public interface OvCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(OvCNew record);

    int insertSelective(OvCNew record);

    OvCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(OvCNew record);

    int updateByPrimaryKey(OvCNew record);
}