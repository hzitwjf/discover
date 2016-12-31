package com.hzit.core.impl;

import com.hzit.core.biz.Md5JiaMiBiz;
import com.hzit.core.biz.UserBiz;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.User;
import com.hzit.dao.sql.UserSql;
import org.apache.commons.dbutils.handlers.BeanHandler;


/**
 * Created by Administrator on 2016/12/31.
 */
public class UserBizImpl extends GetConnection implements UserBiz {
    private UserSql userSql=new UserSql();
    private Md5JiaMiBiz md5JiaMiBiz=new Md5JiaMiBizImpl();
    @Override
    public User checkLogin(User user) {
        try {
            open();
            String str= user.getUserPwd();
            String oldPwd=md5JiaMiBiz.EncoderByMd5(str);
            String newPwd=md5JiaMiBiz.EncoderByMd5(oldPwd);
            user.setUserPwd(newPwd);
            User use=qr.query(connection,userSql.getCheckLogin(),new BeanHandler<User>(User.class),user.getUserName(),user.getUserPwd());
            return use;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }finally {
            close(connection,null,null);
        }
    }
}
