package cn.tju.dao;

import cn.tju.pojo.LuadEOld;

public interface LuadEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuadEOld record);

    int insertSelective(LuadEOld record);

    LuadEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuadEOld record);

    int updateByPrimaryKey(LuadEOld record);
}