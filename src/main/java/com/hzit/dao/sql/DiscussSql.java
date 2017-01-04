package com.hzit.dao.sql;

/**
 * Created by Administrator on 2017/1/4.
 */
public class DiscussSql {
    public DiscussSql(){
        addDiscuss="INSERT INTO `discuss`(comUuid,proId,disResult,disScore) VALUES(?,?,?,?)";
    }
    /**
     * 增加评论详情的sql语句
     */
   private String addDiscuss;
    /**
     * 增加评论详情的sql语句
     * @return addDiscuss
     */
    public String getAddDiscuss() {
        return addDiscuss;
    }
}
