package com.hzit.dao.sql;

/**
 * Created by Administrator on 2017/1/4.
 */
public class CommentSql {
    public CommentSql() {
        addCommentSql="INSERT INTO `comment`(comuuId,comTime,comPeople,comModule,comScore,codPeople,comClass) VALUES(?,SYSDATE(),?,?,?,?,?)";
        searchCommentByPageSql="SELECT * FROM `comment` WHERE comModule=? LIMIT ?,30";
        findCommentByModuleSql="SELECT * FROM `comment` WHERE comModule=?";
        getCountByModuleSql="SELECT COUNT(0) FROM `comment` WHERE comModule=?";
        getAllTeacherSql="select DISTINCT(codPeople) from `comment` where comModule=?";
    }
    /**
     * 增加评论的sql语句
     */
    private String addCommentSql;
    /**
     * 分页查询评论的sql语句
     */
    private String searchCommentByPageSql;
    /**
     * 根据模块Id查找该模块下所有评论信息
     */
    private String findCommentByModuleSql;
    /**
     * 根据模块Id统计该模块ID下总行数
     */
    private String getCountByModuleSql;
    /**
     * 查找所有被评论的老师名字
     */
    private String getAllTeacherSql;
    /**
     * 增加评论的sql语句
     * @return addCommentSql
     */
    public String getAddCommentSql() {
        return addCommentSql;
    }

    /**
     * 分页查询评论的sql语句
     * @return searchCommentByPageSql
     */
    public String getSearchCommentByPageSql() {
        return searchCommentByPageSql;
    }

    /**
     * 根据模块Id查找该模块下所有评论信息
     * @return findCommentByModuleSql
     */
    public String getFindCommentByModuleSql() {
        return findCommentByModuleSql;
    }

    /**
     * 根据模块Id统计该模块ID下总行数
     * @return getCountByModuleSql
     */
    public String getGetCountByModuleSql() {
        return getCountByModuleSql;
    }

    /**
     * 查找所有被评论的老师名字
     * @return getAllTeacherSql
     */
    public String getGetAllTeacherSql() {
        return getAllTeacherSql;
    }
}
