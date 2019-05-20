package cn.tju.dao;

import cn.tju.pojo.PaadCOld;

public interface PaadCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PaadCOld record);

    int insertSelective(PaadCOld record);

    PaadCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PaadCOld record);

    int updateByPrimaryKey(PaadCOld record);
}