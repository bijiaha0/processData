package cn.tju.dao;

import cn.tju.pojo.cNLOldMoutain;

public interface cNLOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cNLOldMoutain record);

    int insertSelective(cNLOldMoutain record);

    cNLOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cNLOldMoutain record);

    int updateByPrimaryKey(cNLOldMoutain record);
}