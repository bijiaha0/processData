package cn.tju.dao;

import cn.tju.pojo.cNLNewMoutain;

public interface cNLNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cNLNewMoutain record);

    int insertSelective(cNLNewMoutain record);

    cNLNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cNLNewMoutain record);

    int updateByPrimaryKey(cNLNewMoutain record);
}