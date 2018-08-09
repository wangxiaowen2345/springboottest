package com.qust.mapper;

import com.qust.model.tkb_Userrelation;

public interface tkb_UserrelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Userrelation record);

    int insertSelective(tkb_Userrelation record);

    tkb_Userrelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Userrelation record);

    int updateByPrimaryKey(tkb_Userrelation record);
}