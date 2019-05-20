package cn.tju.dao;

import cn.tju.pojo.BrcaEOld;

public interface BrcaEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(BrcaEOld record);

    int insertSelective(BrcaEOld record);

    BrcaEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(BrcaEOld record);

    int updateByPrimaryKey(BrcaEOld record);
}