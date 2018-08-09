package com.qust.mapper;

import com.qust.model.tkb_Site;

public interface tkb_SiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Site record);

    int insertSelective(tkb_Site record);

    tkb_Site selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Site record);

    int updateByPrimaryKey(tkb_Site record);
}