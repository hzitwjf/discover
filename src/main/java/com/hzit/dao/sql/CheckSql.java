package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class CheckSql {
    public CheckSql(){
        addCheckSql="INSERT INTO `check`(checkClass,checkTeacher,checkPwd,createTime,checkModule) VALUES(?,?,?,SYSDATE(),?)";
        findCheckByCheckPwdSql="SELECT checkId,checkClass,checkTeacher,checkPwd,createTime," +
                "DATE_FORMAT(createTime,'%y%m%d') createNumber,checkModule FROM `check`" +
                "WHERE checkPwd=? AND DATE_FORMAT(createTime,'%y%m%d')=DATE_FORMAT(SYSDATE(),'%y%m%d')";
    }

    /**
     * 增加考核信息的sql语句
     */
    private String addCheckSql;
    /**
     * 根据考核密码查找考核信息
     */
    private String findCheckByCheckPwdSql;

    /**
     * 增加考核信息的sql语句
     * @return addCheckSql
     */
    public String getAddCheckSql() {
        return addCheckSql;
    }

    /**
     * 根据考核密码查找考核信息
     * @return findCheckByCheckPwdSql
     */
    public String getFindCheckByCheckPwdSql() {
        return findCheckByCheckPwdSql;
    }
}
