package com.hzit.core.biz;


import com.hzit.dao.vo.CommentVo;
import com.hzit.dao.vo.DiscussVo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
public interface DiscussBiz {
    List<DiscussVo> findDiscussByComUuid(Serializable comUuid);
    List<CommentVo> findAllTeacherScore(Serializable moduleName,Serializable time);
}
