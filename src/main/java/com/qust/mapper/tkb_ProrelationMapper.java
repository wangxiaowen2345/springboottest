package com.qust.mapper;

import com.qust.model.tkb_Prorelation;

public interface tkb_ProrelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Prorelation record);

    int insertSelective(tkb_Prorelation record);

    tkb_Prorelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Prorelation record);

    int updateByPrimaryKey(tkb_Prorelation record);
}