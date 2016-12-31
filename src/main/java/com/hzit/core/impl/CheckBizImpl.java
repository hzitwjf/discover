package com.hzit.core.impl;

import com.hzit.core.biz.CheckBiz;
import com.hzit.dao.entity.Check;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/31.
 */
public class CheckBizImpl implements CheckBiz {

    @Override
    public int addCheck(Check check) {

        return 0;
    }

    @Override
    public Check findCheckByCheckPwd(Serializable checkPwd) {
        return null;
    }
}
