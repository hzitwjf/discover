package com.hzit.core.biz;

/**
 * Created by Administrator on 2016/12/31.
 */
public interface Md5JiaMiBiz {
        public  String EncoderByMd5(String str);
        public  boolean checkpassword(String newpasswd, String oldpasswd);
}
