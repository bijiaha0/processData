package cn.tju.dao;

import cn.tju.pojo.KichCNew;

public interface KichCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KichCNew record);

    int insertSelective(KichCNew record);

    KichCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KichCNew record);

    int updateByPrimaryKey(KichCNew record);
}