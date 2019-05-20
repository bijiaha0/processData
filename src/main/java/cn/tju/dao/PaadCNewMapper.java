package cn.tju.dao;

import cn.tju.pojo.PaadCNew;

public interface PaadCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PaadCNew record);

    int insertSelective(PaadCNew record);

    PaadCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PaadCNew record);

    int updateByPrimaryKey(PaadCNew record);
}