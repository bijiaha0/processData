package cn.tju.dao;

import cn.tju.pojo.ReadCOld;

public interface ReadCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(ReadCOld record);

    int insertSelective(ReadCOld record);

    ReadCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(ReadCOld record);

    int updateByPrimaryKey(ReadCOld record);
}