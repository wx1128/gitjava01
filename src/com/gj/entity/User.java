package com.gj.entity;

/**
 * ClassName:User
 * Package:com.gj.entity
 * Description:
 *
 * @Date:2021/6/6 22:49
 * @Author:wx112820@163.com
 */
public class User {
    private int id;
//    用户名
    private String userName;
//    登录账号
    private String loginName;
//    登录密码
    private String passWord;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
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
}
