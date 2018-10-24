package com.example.book.service;

import com.example.book.entity.SysUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 98100 on 2018/9/27.
 */
public interface UserService {
    SysUser save(SysUser sysUser);

    //查询所有用户
    List<SysUser> getAll();

    //根据id查询用户信息
    SysUser get(Long id);

    //根据账号查询用户信息
    SysUser findByAccount(String account);

    //根据昵称关键字模糊查询用户信息
    List<SysUser> findByNicknameLike(String nickname);

    //查询昵称含有指定关键词并且按粉丝数降序排列
    List<SysUser> getUsersOrderByFans(String nickname);

    //根据粉丝数量筛选用户
    List<SysUser> findByFansBetween(Integer num1,Integer num2);


}