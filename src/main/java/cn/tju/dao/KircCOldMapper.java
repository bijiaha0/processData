package cn.tju.dao;

import cn.tju.pojo.KircCOld;

public interface KircCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KircCOld record);

    int insertSelective(KircCOld record);

    KircCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KircCOld record);

    int updateByPrimaryKey(KircCOld record);
}