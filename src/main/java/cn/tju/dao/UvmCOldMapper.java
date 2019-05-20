package cn.tju.dao;

import cn.tju.pojo.UvmCOld;

public interface UvmCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(UvmCOld record);

    int insertSelective(UvmCOld record);

    UvmCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(UvmCOld record);

    int updateByPrimaryKey(UvmCOld record);
}