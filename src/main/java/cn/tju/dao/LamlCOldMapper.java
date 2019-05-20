package cn.tju.dao;

import cn.tju.pojo.LamlCOld;

public interface LamlCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LamlCOld record);

    int insertSelective(LamlCOld record);

    LamlCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LamlCOld record);

    int updateByPrimaryKey(LamlCOld record);
}