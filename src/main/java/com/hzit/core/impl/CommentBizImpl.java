package com.hzit.core.impl;

import com.hzit.core.biz.CommentBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Comment;
import com.hzit.dao.entity.Discuss;
import com.hzit.dao.sql.CommentSql;
import com.hzit.dao.sql.DiscussSql;
import com.hzit.dao.vo.CommentVo;

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
            int result=qr.update(connection,commentSql.getAddComment(),commentVo.getComuuId(),commentVo.getComPeople(),commentVo.getComModule(),
                    commentVo.getComScore(),commentVo.getCodPeople(),commentVo.getComClass());
            if (result==1){
                i=1;
                discussList=commentVo.getDiscusses();
            }else {
                i=-1;
            }
            for (Discuss discuss : discussList){
                int r=qr.update(connection,discussSql.getAddDiscuss(),discuss.getComUuid(),discuss.getProId(),discuss.getDisResult(),discuss.getDisScore());
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
}
