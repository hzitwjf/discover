package testdiscover;

import com.hzit.core.biz.Md5JiaMiBiz;
import com.hzit.core.impl.Md5JiaMiBizImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/31.
 */
public class TestMd5JiaMiBizImpl {
    private Md5JiaMiBiz md5JiaMiBiz;
    @Before
    public void init(){
        md5JiaMiBiz=new Md5JiaMiBizImpl();
    }
    @Test
    public void jiaMi(){
        String old=md5JiaMiBiz.EncoderByMd5("hzit1234");
        System.out.println(old);
        String str=md5JiaMiBiz.EncoderByMd5(old);
        System.out.println(str);
    }
    @Test
    public void jieXi(){
        String old="duuuEKEMhDhqUwJ8v3LbVg==";
        String str=md5JiaMiBiz.EncoderByMd5("hzit1234");
        boolean b=md5JiaMiBiz.checkpassword(str,old);
        System.out.println(b);
    }
}
