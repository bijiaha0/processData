package cn.tju.dao;

import cn.tju.pojo.LuadENew;

public interface LuadENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuadENew record);

    int insertSelective(LuadENew record);

    LuadENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuadENew record);

    int updateByPrimaryKey(LuadENew record);
}