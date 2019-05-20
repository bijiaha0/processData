package cn.tju.dao;

import cn.tju.pojo.ReadCNew;

public interface ReadCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ReadCNew record);

    int insertSelective(ReadCNew record);

    ReadCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ReadCNew record);

    int updateByPrimaryKey(ReadCNew record);
}