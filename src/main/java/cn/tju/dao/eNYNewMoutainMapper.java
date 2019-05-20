package cn.tju.dao;

import cn.tju.pojo.eNYNewMoutain;

public interface eNYNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eNYNewMoutain record);

    int insertSelective(eNYNewMoutain record);

    eNYNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eNYNewMoutain record);

    int updateByPrimaryKey(eNYNewMoutain record);
}