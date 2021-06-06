package com.gj.dao;

import com.gj.entity.User;

import java.util.List;

/**
 * ClassName:UserDao
 * Package:com.gj.dao
 * Description:
 *
 * @Date:2021/6/6 22:50
 * @Author:wx112820@163.com
 */
public interface UserDao {
    //查询所有用户
    List<User> AllUser();

//    登录验证
    boolean loginUser(String userName,String passWord);
}
