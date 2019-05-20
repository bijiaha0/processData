package cn.tju.dao;

import cn.tju.pojo.KircCNew;

public interface KircCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KircCNew record);

    int insertSelective(KircCNew record);

    KircCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KircCNew record);

    int updateByPrimaryKey(KircCNew record);
}