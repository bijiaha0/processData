package cn.tju.dao;

import cn.tju.pojo.LuscCOld;

public interface LuscCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(LuscCOld record);

    int insertSelective(LuscCOld record);

    LuscCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(LuscCOld record);

    int updateByPrimaryKey(LuscCOld record);
}