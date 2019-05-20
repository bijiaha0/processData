package cn.tju.dao;

import cn.tju.pojo.eNLOldMoutain;

public interface eNLOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eNLOldMoutain record);

    int insertSelective(eNLOldMoutain record);

    eNLOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eNLOldMoutain record);

    int updateByPrimaryKey(eNLOldMoutain record);
}