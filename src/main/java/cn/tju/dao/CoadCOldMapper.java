package cn.tju.dao;

import cn.tju.pojo.CoadCOld;

public interface CoadCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CoadCOld record);

    int insertSelective(CoadCOld record);

    CoadCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CoadCOld record);

    int updateByPrimaryKey(CoadCOld record);
}