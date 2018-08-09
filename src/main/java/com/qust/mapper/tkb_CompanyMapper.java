package com.qust.mapper;

import com.qust.model.tkb_Company;

public interface tkb_CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Company record);

    int insertSelective(tkb_Company record);

    tkb_Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Company record);

    int updateByPrimaryKeyWithBLOBs(tkb_Company record);

    int updateByPrimaryKey(tkb_Company record);
}