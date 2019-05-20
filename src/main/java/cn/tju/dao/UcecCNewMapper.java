package cn.tju.dao;

import cn.tju.pojo.UcecCNew;

public interface UcecCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcecCNew record);

    int insertSelective(UcecCNew record);

    UcecCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcecCNew record);

    int updateByPrimaryKey(UcecCNew record);
}