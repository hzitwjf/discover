package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class UserSql {
    public UserSql() {
        checkLogin="SELECT * FROM USER WHERE userName=? AND userPwd=?";
    }

    /**
     * 根据用户名和密码进行登录的sql语句
     */
    private String checkLogin;

    /**
     * 根据用户名和密码进行登录的sql语句
     * @return checkLogin
     */
    public String getCheckLogin() {

        return checkLogin;
    }
}
