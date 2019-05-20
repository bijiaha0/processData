package cn.tju.dao;

import cn.tju.pojo.PcpgCNew;

public interface PcpgCNewMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PcpgCNew record);

    int insertSelective(PcpgCNew record);

    PcpgCNew selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PcpgCNew record);

    int updateByPrimaryKey(PcpgCNew record);
}