package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.po.TbNsBssUserInfoBh;
@Mapper
public interface TbNsBssUserInfoBhMapper {
    
    int deleteByPrimaryKey(String sn);

    int insert(TbNsBssUserInfoBh record);

    int insertSelective(TbNsBssUserInfoBh record);

    TbNsBssUserInfoBh selectByPrimaryKey(String sn);

    int updateByPrimaryKeySelective(TbNsBssUserInfoBh record);

    int updateByPrimaryKey(TbNsBssUserInfoBh record);
}