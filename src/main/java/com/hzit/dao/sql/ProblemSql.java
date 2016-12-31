package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/30.
 */
public class ProblemSql {
    /**
     * 根据模块Id来查找所有题目的sql
     */
    private String findAllProblemByModuleIdSql;

    /**
     * 根据模块Id来查找所有题目的sql
     * @return sql语句
     */
    public String getFindAllProblemByModuleIdSql() {
        findAllProblemByModuleIdSql = "SELECT * FROM problem WHERE proModule=? ";
        return findAllProblemByModuleIdSql;
    }
}
