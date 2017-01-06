package com.hzit.core.biz;

import com.hzit.dao.entity.Comment;
import com.hzit.dao.vo.CommentVo;
import com.hzit.dao.vo.DiscussVo;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/1/4.
 */
public interface CommentBiz {
    int addComment(CommentVo commentVo) throws SQLException;
    List<Comment> searchCommentByPage(Serializable moduleName,Serializable page);
    List<Comment> searchCommentByPage(Serializable moduleName,Serializable teaName,Serializable page);
    List<DiscussVo> searchDiscussByTeaName(Serializable teaName);
    Integer getCountByModule(Serializable moduleName);
    Integer getCountByCodPeople(Serializable codPeople);
    List<Comment> findAllTeacherName(Serializable moduleName);

}
