package com.qust.mapper;

import com.qust.model.tkb_Cusrelation;

public interface tkb_CusrelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Cusrelation record);

    int insertSelective(tkb_Cusrelation record);

    tkb_Cusrelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Cusrelation record);

    int updateByPrimaryKey(tkb_Cusrelation record);
}