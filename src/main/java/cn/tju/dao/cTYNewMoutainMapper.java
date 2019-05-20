package cn.tju.dao;

import cn.tju.pojo.cTYNewMoutain;

public interface cTYNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cTYNewMoutain record);

    int insertSelective(cTYNewMoutain record);

    cTYNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cTYNewMoutain record);

    int updateByPrimaryKey(cTYNewMoutain record);
}