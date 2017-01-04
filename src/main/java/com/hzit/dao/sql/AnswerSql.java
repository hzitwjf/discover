package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class AnswerSql {
    public AnswerSql(){
        findAllAnswerByProIdSql="SELECT * FROM answer WHERE proId=?";
    }
    /**
     * 根据题目Id查找答案的sql
     */
    private String findAllAnswerByProIdSql;

    /**
     * 根据题目Id查找答案的sql
     * @return findAllAnswerByProIdSql
     */
    public String getFindAllAnswerByProIdSql() {
        return findAllAnswerByProIdSql;
    }
}
