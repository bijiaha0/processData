package cn.tju.dao;

import cn.tju.pojo.KircENew;

public interface KircENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KircENew record);

    int insertSelective(KircENew record);

    KircENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KircENew record);

    int updateByPrimaryKey(KircENew record);
}