package com.qust.mapper;

import com.qust.model.tkb_Product;

public interface tkb_ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tkb_Product record);

    int insertSelective(tkb_Product record);

    tkb_Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tkb_Product record);

    int updateByPrimaryKeyWithBLOBs(tkb_Product record);

    int updateByPrimaryKey(tkb_Product record);
}