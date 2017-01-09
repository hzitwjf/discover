package testdiscover;

import com.hzit.core.biz.CheckBiz;
import com.hzit.core.impl.CheckBizImpl;
import com.hzit.dao.entity.Check;
import com.hzit.dao.vo.CheckVo;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2017/1/3.
 */
public class TestCheckBizImpl {
    private CheckBiz checkBiz;
    @Before
    public void init(){
        checkBiz=new CheckBizImpl();
    }
    @Test
    public void findCheckByCheckPwd(){
        //CheckVo checkVo=checkBiz.findCheckByCheckPwd(3866);
        //System.out.println(checkVo.toString());
    }
}
