package cn.tju.dao;

import cn.tju.pojo.UvmEOld;

public interface UvmEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UvmEOld record);

    int insertSelective(UvmEOld record);

    UvmEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UvmEOld record);

    int updateByPrimaryKey(UvmEOld record);
}