package com.hzit.core.impl;

import com.hzit.core.biz.ProblemBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Problem;
import com.hzit.dao.sql.ProblemSql;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
public class ProblemBizImpl extends GetConnection implements ProblemBiz {
    public ProblemBizImpl(){
        problemSql=new ProblemSql();
    }
    private ProblemSql problemSql;
    @Override
    public List<Problem> findAllProblemByModuleId(Serializable proModule) {
        open();
        try{
            List<Problem> problemList=qr.query(connection,problemSql.getFindAllProblemByModuleIdSql(),new BeanListHandler<Problem>(Problem.class),proModule);
            return problemList;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }finally {
            close(connection,null,null);
        }
    }
}
