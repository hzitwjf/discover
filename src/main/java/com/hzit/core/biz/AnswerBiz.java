package com.hzit.core.biz;

import com.hzit.dao.entity.Answer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
public interface AnswerBiz {
    List<Answer> findAllAnswerByProId(Serializable proId);
}
