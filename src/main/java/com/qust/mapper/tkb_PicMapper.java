package com.qust.mapper;

import com.qust.model.tkb_Pic;

public interface tkb_PicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Pic record);

    int insertSelective(tkb_Pic record);

    tkb_Pic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Pic record);

    int updateByPrimaryKey(tkb_Pic record);
}