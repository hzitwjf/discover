package com.hzit.core.biz;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/12/31.
 */
public interface UserBiz {
    User checkLogin(User user);
}
