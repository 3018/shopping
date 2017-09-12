package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.Classes;

public interface ClassesDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
    List<Classes> getAllClasses();
}