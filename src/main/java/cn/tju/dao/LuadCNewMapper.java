package cn.tju.dao;

import cn.tju.pojo.LuadCNew;

public interface LuadCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuadCNew record);

    int insertSelective(LuadCNew record);

    LuadCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuadCNew record);

    int updateByPrimaryKey(LuadCNew record);
}