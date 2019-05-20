package cn.tju.dao;

import cn.tju.pojo.cTLNewMoutain;

public interface cTLNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cTLNewMoutain record);

    int insertSelective(cTLNewMoutain record);

    cTLNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cTLNewMoutain record);

    int updateByPrimaryKey(cTLNewMoutain record);
}