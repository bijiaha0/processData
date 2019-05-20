package cn.tju.dao;

import cn.tju.pojo.eTLOldMoutain;

public interface eTLOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eTLOldMoutain record);

    int insertSelective(eTLOldMoutain record);

    eTLOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eTLOldMoutain record);

    int updateByPrimaryKey(eTLOldMoutain record);
}