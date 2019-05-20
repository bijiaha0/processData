package cn.tju.dao;

import cn.tju.pojo.LamlCNew;

public interface LamlCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LamlCNew record);

    int insertSelective(LamlCNew record);

    LamlCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LamlCNew record);

    int updateByPrimaryKey(LamlCNew record);
}