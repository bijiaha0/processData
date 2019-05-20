package cn.tju.dao;

import cn.tju.pojo.cNYOldMoutain;

public interface cNYOldMoutainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cNYOldMoutain record);

    int insertSelective(cNYOldMoutain record);

    cNYOldMoutain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cNYOldMoutain record);

    int updateByPrimaryKey(cNYOldMoutain record);
}