package com.hzit.core.impl;

import com.hzit.core.biz.DiscussBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.sql.DiscussSql;
import com.hzit.dao.vo.CommentVo;
import com.hzit.dao.vo.DiscussVo;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
public class DiscussBizImpl extends GetConnection implements DiscussBiz{
    public DiscussBizImpl(){
        discussSql=new DiscussSql();
    }
    private DiscussSql discussSql;
    @Override
    public List<DiscussVo> findDiscussByComUuid(Serializable comUuid) {
        try{
            open();
            List<DiscussVo> discussVoList=
                    qr.query(connection, discussSql.getFindDiscussByComUuidSql(), new BeanListHandler<DiscussVo>(DiscussVo.class), comUuid);
            return discussVoList;
        }catch (Exception ex){
            ex.printStackTrace();
            return  null;
        }
    }

    @Override
    public List<CommentVo> findAllTeacherScore(Serializable moduleName, Serializable time) {
        try {
            open();
            List<CommentVo> commentVos=
                    qr.query(connection,discussSql.getFindTeacherAvgScoreSql(), new BeanListHandler<CommentVo>(CommentVo.class),moduleName,time );
            return commentVos;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }


}
