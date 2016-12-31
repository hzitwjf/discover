package com.hzit.core.biz;

import com.hzit.dao.entity.Problem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
public interface ProblemBiz {
    List<Problem> findAllProblemByModuleId(Serializable proModule);
}
