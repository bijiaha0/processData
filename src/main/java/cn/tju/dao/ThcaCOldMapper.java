package cn.tju.dao;

import cn.tju.pojo.ThcaCOld;

public interface ThcaCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ThcaCOld record);

    int insertSelective(ThcaCOld record);

    ThcaCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ThcaCOld record);

    int updateByPrimaryKey(ThcaCOld record);
}