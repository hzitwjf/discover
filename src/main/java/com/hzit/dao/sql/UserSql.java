package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class UserSql {
    private String checkLogin;

    public String getCheckLogin() {
        checkLogin="SELECT * FROM USER WHERE userName=? AND userPwd=?";
        return checkLogin;
    }
}
