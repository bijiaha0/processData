package cn.tju.dao;

import cn.tju.pojo.cNYNewMoutain;

public interface cNYNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cNYNewMoutain record);

    int insertSelective(cNYNewMoutain record);

    cNYNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cNYNewMoutain record);

    int updateByPrimaryKey(cNYNewMoutain record);
}