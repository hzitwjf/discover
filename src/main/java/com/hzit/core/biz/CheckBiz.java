package com.hzit.core.biz;

import com.hzit.dao.entity.Check;
import com.hzit.dao.vo.CheckVo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/31.
 */
public interface CheckBiz {
    int addCheck(Check check);
    CheckVo findCheckByCheckPwd(Serializable checkPwd);
}
