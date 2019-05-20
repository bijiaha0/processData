package cn.tju.dao;

import cn.tju.pojo.eNLNewMoutain;

public interface eNLNewMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eNLNewMoutain record);

    int insertSelective(eNLNewMoutain record);

    eNLNewMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eNLNewMoutain record);

    int updateByPrimaryKey(eNLNewMoutain record);
}