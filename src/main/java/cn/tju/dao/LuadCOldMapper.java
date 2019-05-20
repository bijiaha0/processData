package cn.tju.dao;

import cn.tju.pojo.LuadCOld;

public interface LuadCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuadCOld record);

    int insertSelective(LuadCOld record);

    LuadCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuadCOld record);

    int updateByPrimaryKey(LuadCOld record);
}