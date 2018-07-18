package com.planet.project.mapper;

import com.planet.project.entity.BatchSignUp;

public interface BatchSignUpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BatchSignUp record);

    int insertSelective(BatchSignUp record);

    BatchSignUp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BatchSignUp record);

    int updateByPrimaryKey(BatchSignUp record);
}