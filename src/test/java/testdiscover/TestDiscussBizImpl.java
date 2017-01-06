package testdiscover;


import com.hzit.core.biz.DiscussBiz;
import com.hzit.core.impl.DiscussBizImpl;
import com.hzit.dao.vo.CommentVo;
import com.hzit.dao.vo.DiscussVo;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */
public class TestDiscussBizImpl {
    private DiscussBiz discussBiz;
    @Before
    public void init(){
        discussBiz=new DiscussBizImpl();
    }
    @Test
    public void findAllDiscussByComUuid(){
        List<DiscussVo> discussVoList=discussBiz.findDiscussByComUuid("ed392856-3fcd-48e8-a92a-71f6a4b4225f");
        discussVoList.forEach(discussVo -> System.out.println(discussVo.toString()));
    }
    @Test
    public void findAllTeacherAvgScore(){
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        String time=s.format(date);
        List<CommentVo> discussVoList=discussBiz.findAllTeacherScore("教员",time);
        discussVoList.forEach(commentVo -> System.out.println(commentVo.toString()));
    }
}
