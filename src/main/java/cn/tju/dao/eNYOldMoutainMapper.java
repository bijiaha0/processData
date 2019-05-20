package cn.tju.dao;

import cn.tju.pojo.eNYOldMoutain;

public interface eNYOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eNYOldMoutain record);

    int insertSelective(eNYOldMoutain record);

    eNYOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eNYOldMoutain record);

    int updateByPrimaryKey(eNYOldMoutain record);
}