package com.example.demo;

import com.example.demo.pojo.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface userMapper {
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user);

    int insert(user record);

    <userWithBLOBs> userWithBLOBs selectByPrimaryKey(@Param("host") String host, @Param("user") String user);

    List<user> selectAll();

    int updateByPrimaryKey(user record);
}