package com.qust.mapper;

import com.qust.model.tkb_Customer;

public interface tkb_CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Customer record);

    int insertSelective(tkb_Customer record);

    tkb_Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Customer record);

    int updateByPrimaryKeyWithBLOBs(tkb_Customer record);

    int updateByPrimaryKey(tkb_Customer record);
}