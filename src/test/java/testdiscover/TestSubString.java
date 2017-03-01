package testdiscover;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/1.
 */
public class TestSubString {
    @Test
    public void testOne(){
        // subString 2个参数，一个从哪开始截取，一个截取到哪结束
        String a="hello";
        String b=a.substring(0,1);
        System.out.println(b);
    }
}
