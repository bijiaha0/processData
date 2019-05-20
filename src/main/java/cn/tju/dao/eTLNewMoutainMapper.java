package cn.tju.dao;

import cn.tju.pojo.eTLNewMoutain;

public interface eTLNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eTLNewMoutain record);

    int insertSelective(eTLNewMoutain record);

    eTLNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eTLNewMoutain record);

    int updateByPrimaryKey(eTLNewMoutain record);
}