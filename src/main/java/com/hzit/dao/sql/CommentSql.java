package com.hzit.dao.sql;

/**
 * Created by Administrator on 2017/1/4.
 */
public class CommentSql {
    public CommentSql() {
        addComment="INSERT INTO `comment`(comuuId,comTime,comPeople,comModule,comScore,codPeople,comClass) VALUES(?,SYSDATE(),?,?,?,?,?)";
    }
    /**
     * 增加评论的sql语句
     */
    private String addComment;
    /**
     * 增加评论的sql语句
     * @return addComment
     */
    public String getAddComment() {
        return addComment;
    }
}
