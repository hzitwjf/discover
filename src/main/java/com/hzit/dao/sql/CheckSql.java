package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class CheckSql {
    private String addCheckSql;
    private String findCheckByCheckPwdSql;

    public String getAddCheckSql() {
        addCheckSql="INSERT INTO `check`(checkClass,checkTeacher,checkPwd,createTime,checkModule) VALUES(?,?,?,SYSDATE(),?)";
        return addCheckSql;
    }

    public String getFindCheckByCheckPwdSql() {
        findCheckByCheckPwdSql="SELECT * FROM `check` WHERE checkPwd=?";
        return findCheckByCheckPwdSql;
    }
}
