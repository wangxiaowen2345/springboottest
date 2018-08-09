package com.qust.mapper;

import com.qust.model.tkb_User;

public interface tkb_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_User record);

    int insertSelective(tkb_User record);

    tkb_User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_User record);

    int updateByPrimaryKey(tkb_User record);
}