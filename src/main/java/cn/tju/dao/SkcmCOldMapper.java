package cn.tju.dao;

import cn.tju.pojo.SkcmCOld;

public interface SkcmCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(SkcmCOld record);

    int insertSelective(SkcmCOld record);

    SkcmCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(SkcmCOld record);

    int updateByPrimaryKey(SkcmCOld record);
}