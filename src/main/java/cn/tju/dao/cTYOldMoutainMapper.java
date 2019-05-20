package cn.tju.dao;

import cn.tju.pojo.cTYOldMoutain;

public interface cTYOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cTYOldMoutain record);

    int insertSelective(cTYOldMoutain record);

    cTYOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cTYOldMoutain record);

    int updateByPrimaryKey(cTYOldMoutain record);
}