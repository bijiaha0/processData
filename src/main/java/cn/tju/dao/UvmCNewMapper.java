package cn.tju.dao;

import cn.tju.pojo.UvmCNew;

public interface UvmCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UvmCNew record);

    int insertSelective(UvmCNew record);

    UvmCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UvmCNew record);

    int updateByPrimaryKey(UvmCNew record);
}