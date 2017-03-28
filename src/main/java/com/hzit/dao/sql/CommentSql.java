package com.hzit.dao.sql;

/**
 * Created by Administrator on 2017/1/4.
 */
public class CommentSql {
    public CommentSql() {
        addCommentSql="INSERT INTO `comment`(comuuId,comTime,comPeople,comModule,comScore,codPeople,comClass) VALUES(?,SYSDATE(),?,?,?,?,?)";
        searchCommentByPageSql="SELECT * FROM `comment` WHERE comModule=? ORDER BY codPeople LIMIT ?,30";
        findCommentByModuleSql="SELECT * FROM " +
                "(SELECT c.codPeople,c.comTime,p.proContent,d.* FROM `comment` c JOIN `discuss` d ON  c.comuuId=d.comuuId " +
                "JOIN `problem` p ON d.proId=p.proId WHERE d.proId=35 ) r WHERE codPeople=? AND DATE_FORMAT(comTime,'%Y%m')=DATE_FORMAT(SYSDATE(),'%Y%m')";
        getCountByModuleSql="SELECT COUNT(0) FROM `comment` WHERE comModule=? AND DATE_FORMAT(comTime,'%Y%m')=DATE_FORMAT(SYSDATE(),'%Y%m')" ;
        getAllTeacherSql="select DISTINCT(codPeople) from `comment` where comModule=?";
        searchCommentByTeaNameAndPageSql="SELECT * FROM `comment` WHERE comModule=? AND codPeople LIKE CONCAT('%',?,'%') AND DATE_FORMAT(comTime,'%Y%m')=DATE_FORMAT(SYSDATE(),'%Y%m') LIMIT ?,30";
        getCountByCodPeopleSql="SELECT COUNT(0) FROM `comment` WHERE codPeople LIKE  CONCAT('%',?,'%') AND DATE_FORMAT(comTime,'%Y%m')=DATE_FORMAT(SYSDATE(),'%Y%m')  ";
        getCodPeopleComModule="select distinct(comModule) from `comment` where codPeople like CONCAT('%',?,'%')";
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
     * 根据教师名字查询评论信息
     */
    private String searchCommentByTeaNameAndPageSql;
    /**
     * 根据教师名字查询总行数
     */
    private String getCountByCodPeopleSql;
    /**
     * 根据名字查询当前人的模块Id
     */
    public String getCodPeopleComModule;
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

    /**
     * 根据教师名字查询评论信息
     * @return searchCommentByTeaNameAndPageSql
     */
    public String getSearchCommentByTeaNameAndPageSql() {
        return searchCommentByTeaNameAndPageSql;
    }

    /**
     * 根据教师名字查询总行数
     * @return getCountByCodPeopleSql
     */
    public String getGetCountByCodPeopleSql() {
        return getCountByCodPeopleSql;
    }

    /**
     * 根据名字查询当前人的模块Id
     * @return 模块Id
     */
    public String getGetCodPeopleComModule() {
        return getCodPeopleComModule;
    }
}
