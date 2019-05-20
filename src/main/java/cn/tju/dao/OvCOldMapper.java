package cn.tju.dao;

import cn.tju.pojo.OvCOld;

public interface OvCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(OvCOld record);

    int insertSelective(OvCOld record);

    OvCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(OvCOld record);

    int updateByPrimaryKey(OvCOld record);
}