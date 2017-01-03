package com.hzit.core.impl;

import com.hzit.core.biz.CheckBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Check;
import com.hzit.dao.sql.CheckSql;
import com.hzit.dao.vo.CheckVo;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.swing.text.GapContent;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/31.
 */
public class CheckBizImpl extends GetConnection implements CheckBiz {
    private CheckSql checkSql=new CheckSql();
    @Override
    public int addCheck(Check check) {
            try{
                open();
                int i=qr.update(connection,checkSql.getAddCheckSql(),
                        check.getCheckClass(),check.getCheckTeacher(),check.getCheckPwd(),check.getCheckModule());
                if (i==1){
                    connection.commit();
                }else {
                    connection.rollback();
                }
                return i;
            }catch (Exception ex) {
                ex.printStackTrace();
                return -1;
            }
    }

    @Override
    public CheckVo findCheckByCheckPwd(Serializable checkPwd) {
        try{
         open();
           CheckVo checkVo=qr.query(connection, checkSql.getFindCheckByCheckPwdSql(),new  BeanHandler <CheckVo> (CheckVo.class),checkPwd);
            return checkVo;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
