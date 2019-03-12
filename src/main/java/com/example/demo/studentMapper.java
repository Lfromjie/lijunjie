package com.example.demo;

import com.example.demo.pojo.student;

import java.util.List;


public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    student selectByPrimaryKey(Integer id);

    List<student> selectAll();

    int updateByPrimaryKey(student record);
}