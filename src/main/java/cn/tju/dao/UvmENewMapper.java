package cn.tju.dao;

import cn.tju.pojo.UvmENew;

public interface UvmENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UvmENew record);

    int insertSelective(UvmENew record);

    UvmENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UvmENew record);

    int updateByPrimaryKey(UvmENew record);
}