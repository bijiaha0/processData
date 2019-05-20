package cn.tju.dao;

import cn.tju.pojo.cTLOldMoutain;

public interface cTLOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cTLOldMoutain record);

    int insertSelective(cTLOldMoutain record);

    cTLOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cTLOldMoutain record);

    int updateByPrimaryKey(cTLOldMoutain record);
}