package com.hzit.core.impl;

import com.hzit.core.biz.AnswerBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Answer;
import com.hzit.dao.sql.AnswerSql;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */
public class AnswerBizImpl extends GetConnection implements AnswerBiz {
    public AnswerBizImpl() {
        answerSql=new AnswerSql();
    }

    private AnswerSql answerSql;
    @Override
    public List<Answer> findAllAnswerByProId(Serializable proId) {
        try {
            open();
            List<Answer> answerList=qr.query(connection,answerSql.getFindAllAnswerByProIdSql(),new BeanListHandler<Answer>(Answer.class),proId);
            return answerList;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }finally {
            close(connection,null,null);
        }
    }
}
