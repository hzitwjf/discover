package com.hzit.dao.sql;

/**
 * Created by Administrator on 2016/12/31.
 */
public class AnswerSql {
    /**
     * 根据题目Id查找答案的sql
     */
    private String findAllAnswerByProIdSql;

    /**
     * 根据题目Id查找答案的sql
     * @return sql语句
     */
    public String getFindAllAnswerByProIdSql() {
        findAllAnswerByProIdSql="SELECT * FROM answer WHERE proId=?";
        return findAllAnswerByProIdSql;
    }
}
