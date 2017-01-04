package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/30.
 */
public class ProblemSql {
    public ProblemSql(){
        findAllProblemByModuleIdSql = "SELECT * FROM problem WHERE proModule=? ";
    }
    /**
     * 根据模块Id来查找所有题目的sql
     */
    private String findAllProblemByModuleIdSql;

    /**
     * 根据模块Id来查找所有题目的sql
     * @return findAllProblemByModuleIdSql
     */
    public String getFindAllProblemByModuleIdSql() {

        return findAllProblemByModuleIdSql;
    }
}
