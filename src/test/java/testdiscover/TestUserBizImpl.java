package testdiscover;

import com.hzit.core.biz.UserBiz;
import com.hzit.core.impl.UserBizImpl;
import com.hzit.dao.entity.User;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/31.
 */
public class TestUserBizImpl {
    private UserBiz userBiz;
    @Before
    public void init() {
        userBiz = new UserBizImpl();
    }
    @Test
    public void checkLogin(){
        User user=new User();
        user.setUserName("吴佳峰");
        user.setUserPwd("admin1234");
        User u=userBiz.checkLogin(user);
        System.out.println(u.toString());
    }
}

