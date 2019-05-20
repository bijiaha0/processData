package cn.tju.dao;

import cn.tju.pojo.BrcaCOld;

public interface BrcaCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BrcaCOld record);

    int insertSelective(BrcaCOld record);

    BrcaCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BrcaCOld record);

    int updateByPrimaryKey(BrcaCOld record);
}