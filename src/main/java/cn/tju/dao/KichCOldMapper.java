package cn.tju.dao;

import cn.tju.pojo.KichCOld;

public interface KichCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KichCOld record);

    int insertSelective(KichCOld record);

    KichCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KichCOld record);

    int updateByPrimaryKey(KichCOld record);
}