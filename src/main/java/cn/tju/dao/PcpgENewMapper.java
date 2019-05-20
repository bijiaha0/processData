package cn.tju.dao;

import cn.tju.pojo.PcpgENew;

public interface PcpgENewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PcpgENew record);

    int insertSelective(PcpgENew record);

    PcpgENew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PcpgENew record);

    int updateByPrimaryKey(PcpgENew record);
}