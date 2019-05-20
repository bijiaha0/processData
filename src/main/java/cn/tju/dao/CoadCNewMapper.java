package cn.tju.dao;

import cn.tju.pojo.CoadCNew;

public interface CoadCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(CoadCNew record);

    int insertSelective(CoadCNew record);

    CoadCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(CoadCNew record);

    int updateByPrimaryKey(CoadCNew record);
}