package com.scaffold.ssm.dao;

import com.scaffold.ssm.entity.Boy;
import org.springframework.stereotype.Repository;

@Repository
public interface BoyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boy record);

    int insertSelective(Boy record);

    Boy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boy record);

    int updateByPrimaryKey(Boy record);
}