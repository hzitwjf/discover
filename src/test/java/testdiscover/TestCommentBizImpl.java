package testdiscover;

import com.hzit.core.biz.CommentBiz;
import com.hzit.core.impl.CommentBizImpl;
import com.hzit.dao.GetConnection;
import com.hzit.dao.entity.Comment;
import com.hzit.dao.entity.Discuss;
import com.hzit.dao.vo.CommentVo;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/1/4.
 */
public class TestCommentBizImpl{
    private CommentBiz commentBiz;
    @Before
    public void init(){
        commentBiz=new CommentBizImpl();
    }
    @Test
    public void addCommentAndDiscuss(){
        CommentVo commentVo=new CommentVo();
        commentVo.setCodPeople("LOL");
        commentVo.setComPeople("盖伦");
        commentVo.setComuuId(UUID.randomUUID().toString());
        commentVo.setComClass("BJ1601");
        commentVo.setComModule("1");
        commentVo.setComId(100);
        Discuss discuss=new Discuss();
        discuss.setComUuid(commentVo.getComuuId());
        discuss.setProId(1);
        discuss.setDisResult("德玛西亚");
        discuss.setDisScore("50");
        Discuss discuss1=new Discuss();
        discuss1.setComUuid(commentVo.getComuuId());
        discuss1.setProId(2);
        discuss1.setDisResult("诺克萨斯");
        discuss1.setDisScore("50");
        List<Discuss> discussList=new ArrayList<>();
        discussList.add(discuss);
        discussList.add(discuss1);
        commentVo.setDiscusses(discussList);
        try {
            int i=commentBiz.addComment(commentVo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void searchCommentByPage(){
        List<Comment> comments=commentBiz.searchCommentByPage("教员", 0);
        List<Comment> commentList=commentBiz.searchCommentByPage("教务");
        Integer i=commentBiz.getCountByModule("教务");
        System.out.println(i);
        comments.forEach(comment -> System.out.println(comment.toString()));
        commentList.forEach(comment -> System.out.println(comment.toString()));

    }
    @Test
    public void findAllTeacher(){
        List<Comment> commentList=commentBiz.findAllTeacherName("教员");
        commentList.forEach(comment -> System.out.println(comment.getCodPeople()));
    }
}
