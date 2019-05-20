package cn.tju.dao;

import cn.tju.pojo.EscaCOld;

public interface EscaCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(EscaCOld record);

    int insertSelective(EscaCOld record);

    EscaCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(EscaCOld record);

    int updateByPrimaryKey(EscaCOld record);
}