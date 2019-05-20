package cn.tju.dao;

import cn.tju.pojo.UcsCNew;

public interface UcsCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcsCNew record);

    int insertSelective(UcsCNew record);

    UcsCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcsCNew record);

    int updateByPrimaryKey(UcsCNew record);
}