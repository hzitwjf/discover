package com.hzit.core.biz;

import com.hzit.dao.vo.CommentVo;

import java.sql.SQLException;

/**
 * Created by Administrator on 2017/1/4.
 */
public interface CommentBiz {
    int addComment(CommentVo commentVo) throws SQLException;
}
