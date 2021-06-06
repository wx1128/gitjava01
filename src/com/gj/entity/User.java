package com.gj.entity;

/**
 * ClassName:User
 * Package:com.gj.entity
 * Description:
 *
 * @Date:2021/6/6 22:28
 * @Author:wx112820@163.com
 */
public class User {
    private int id;
//    用户名
    private String userName;
//    登录名
    private  String loginName;
//    登录密码
    private String passWord;
//    手机号码
    private String phone;
//    邮箱
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
