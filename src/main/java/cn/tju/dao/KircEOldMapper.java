package cn.tju.dao;

import cn.tju.pojo.KircEOld;

public interface KircEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(KircEOld record);

    int insertSelective(KircEOld record);

    KircEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(KircEOld record);

    int updateByPrimaryKey(KircEOld record);
}