package testdiscover;

import com.hzit.core.biz.AnswerBiz;
import com.hzit.core.biz.ProblemBiz;
import com.hzit.core.impl.AnswerBizImpl;
import com.hzit.core.impl.ProblemBizImpl;
import com.hzit.dao.entity.Answer;
import com.hzit.dao.entity.Problem;
import org.junit.Test;
import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */
public class TestAnswerBizImpl {
    @Test
    public void findAllAnswerByProId(){
        ProblemBiz problemBiz=new ProblemBizImpl();
        AnswerBiz answerBiz=new AnswerBizImpl();
        List<Problem> problemList=problemBiz.findAllProblemByModuleId(1);
        for (Problem problem : problemList){
            List<Answer> answerList=answerBiz.findAllAnswerByProId(problem.getProId());
            System.out.println(problem.toString());
            for (Answer answer : answerList){
                System.out.println(answer.toString());
            }
        }
    }
}
