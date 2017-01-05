package com.hzit.core.impl;

import com.hzit.core.biz.CommentBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Comment;
import com.hzit.dao.entity.Discuss;
import com.hzit.dao.sql.CommentSql;
import com.hzit.dao.sql.DiscussSql;
import com.hzit.dao.vo.CommentVo;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/1/4.
 */
public class CommentBizImpl extends GetConnection implements CommentBiz {
    public CommentBizImpl() {
        commentSql=new CommentSql();
        discussSql=new DiscussSql();
    }

    private CommentSql commentSql;
    private DiscussSql discussSql;
    @Override
    public int addComment(CommentVo commentVo) {
        try{
            open();
            int i=0;
            List<Discuss> discussList=null;
            int result=qr.update(connection,commentSql.getAddCommentSql(),commentVo.getComuuId(),commentVo.getComPeople(),commentVo.getComModule(),
                    commentVo.getComScore(),commentVo.getCodPeople(),commentVo.getComClass());
            if (result==1){
                i=1;
                discussList=commentVo.getDiscusses();
            }else {
                i=-1;
            }
            for (Discuss discuss : discussList){
                int r=qr.update(connection,discussSql.getAddDiscussSql(),discuss.getComUuid(),discuss.getProId(),discuss.getDisResult(),discuss.getDisScore());
                if (r==1){
                    i=1;
                }else {
                    i=-1;
                }
            }
            if (i==1){
                connection.commit();
            }else {
                connection.rollback();
            }
        }catch (Exception ex){
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Comment> searchCommentByPage(Serializable moduleName,Serializable page) {
        try {
            open();
            List<Comment> commentList=
                    qr.query(connection, commentSql.getSearchCommentByPageSql(), new BeanListHandler<Comment>(Comment.class), moduleName,page);
            return commentList;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Comment> searchCommentByPage(Serializable moduleName) {
        try {
            open();
            List<Comment> commentList=
                    qr.query(connection, commentSql.getFindCommentByModuleSql(), new BeanListHandler<Comment>(Comment.class), moduleName);
            return commentList;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer getCountByModule(Serializable moduleName) {
        try {
            open();
            long aLong=
                    qr.query(connection, commentSql.getGetCountByModuleSql(),new ScalarHandler<Long>(),moduleName);
            int allCount=(int)aLong;
            return allCount;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
