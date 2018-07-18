package com.planet.project.mapper;

import com.planet.project.entity.SignUP;

public interface SignUPMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SignUP record);

    int insertSelective(SignUP record);

    SignUP selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SignUP record);

    int updateByPrimaryKey(SignUP record);

    SignUP selectByAccNo(String accNo);
}