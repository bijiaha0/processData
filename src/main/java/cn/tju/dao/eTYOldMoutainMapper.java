package cn.tju.dao;

import cn.tju.pojo.eTYOldMoutain;

public interface eTYOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(eTYOldMoutain record);

    int insertSelective(eTYOldMoutain record);

    eTYOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(eTYOldMoutain record);

    int updateByPrimaryKey(eTYOldMoutain record);
}