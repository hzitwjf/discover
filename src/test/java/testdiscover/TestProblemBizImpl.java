package testdiscover;


import com.hzit.core.biz.ProblemBiz;
import com.hzit.core.impl.ProblemBizImpl;
import com.hzit.dao.entity.Problem;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
public class TestProblemBizImpl {
    Problem problem=new Problem();
    ProblemBiz problemBiz=new ProblemBizImpl();
    @Test
    public void findAllProblemByModuleId(){
        List<Problem> problemList=problemBiz.findAllProblemByModuleId(1);
        /*for (Problem problem : problemList){
            System.out.println(problem.toString());
        }*/
        problemList.forEach(problem -> System.out.println(problem.toString()));
    }
}
