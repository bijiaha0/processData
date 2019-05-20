package cn.tju.dao;

import cn.tju.pojo.UcecCOld;

public interface UcecCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcecCOld record);

    int insertSelective(UcecCOld record);

    UcecCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcecCOld record);

    int updateByPrimaryKey(UcecCOld record);
}