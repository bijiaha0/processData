package cn.tju.dao;

import cn.tju.pojo.eTYNewMoutain;

public interface eTYNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eTYNewMoutain record);

    int insertSelective(eTYNewMoutain record);

    eTYNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eTYNewMoutain record);

    int updateByPrimaryKey(eTYNewMoutain record);
}