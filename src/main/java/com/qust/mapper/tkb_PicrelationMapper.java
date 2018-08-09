package com.qust.mapper;

import com.qust.model.tkb_Picrelation;

public interface tkb_PicrelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Picrelation record);

    int insertSelective(tkb_Picrelation record);

    tkb_Picrelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Picrelation record);

    int updateByPrimaryKey(tkb_Picrelation record);
}