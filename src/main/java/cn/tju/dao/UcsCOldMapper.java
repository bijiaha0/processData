package cn.tju.dao;

import cn.tju.pojo.UcsCOld;

public interface UcsCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UcsCOld record);

    int insertSelective(UcsCOld record);

    UcsCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UcsCOld record);

    int updateByPrimaryKey(UcsCOld record);
}