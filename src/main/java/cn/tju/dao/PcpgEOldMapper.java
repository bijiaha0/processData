package cn.tju.dao;

import cn.tju.pojo.PcpgEOld;

public interface PcpgEOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PcpgEOld record);

    int insertSelective(PcpgEOld record);

    PcpgEOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PcpgEOld record);

    int updateByPrimaryKey(PcpgEOld record);
}