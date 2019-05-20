package cn.tju.dao;

import cn.tju.pojo.PcpgCOld;

public interface PcpgCOldMapper {
    int deleteByPrimaryKey(Integer geneId);

    int insert(PcpgCOld record);

    int insertSelective(PcpgCOld record);

    PcpgCOld selectByPrimaryKey(Integer geneId);

    int updateByPrimaryKeySelective(PcpgCOld record);

    int updateByPrimaryKey(PcpgCOld record);
}