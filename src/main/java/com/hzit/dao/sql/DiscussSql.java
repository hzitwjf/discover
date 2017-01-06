package com.hzit.dao.sql;

/**
 * Created by Administrator on 2017/1/4.
 */
public class DiscussSql {
    public DiscussSql(){
        addDiscussSql="INSERT INTO `discuss`(comUuid,proId,disResult,disScore) VALUES(?,?,?,?)";
        findDiscussByComUuidSql="SELECT `discuss`.*,`problem`.`proContent` FROM `discuss` JOIN `problem` ON `discuss`.`proId`=`problem`.`proId` WHERE comUuid=?";
        findTeacherAvgScoreSql="  SELECT * FROM " +
                "  (SELECT AVG(comScore) comScore,codPeople,DATE_FORMAT(comTime,'%c') comTime,DATE_FORMAT(comTime,'%y') comId,DATE_FORMAT(comTime,'%y%c')\n" +
                "  hehe FROM `comment` WHERE comModule=? GROUP BY codPeople,hehe) d WHERE hehe=DATE_FORMAT(?,'%y%c') ORDER BY comScore DESC";
    }
    /**
     * 增加评论详情的sql语句
     */
   private String addDiscussSql;
    /**
     * 根据评论业务Id查找评论详情
     */
    private String findDiscussByComUuidSql;
    /**
     * 查询所有老师的平均分
     */
    private String findTeacherAvgScoreSql;
    /**
     * 增加评论详情的sql语句
     * @return addDiscussSql
     */

    public String getAddDiscussSql() {
        return addDiscussSql;
    }

    /**
     * 根据评论业务Id查找评论详情
     * @return
     */
    public String getFindDiscussByComUuidSql() {
        return findDiscussByComUuidSql;
    }

    /**
     * 查询所有老师的平均分
     * @return findTeacherAvgScoreSql
     */
    public String getFindTeacherAvgScoreSql() {
        return findTeacherAvgScoreSql;
    }
}
