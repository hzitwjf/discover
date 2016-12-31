package com.hzit.core.impl;

import com.hzit.core.biz.Md5JiaMiBiz;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/12/31.
 */
public class Md5JiaMiBizImpl implements Md5JiaMiBiz {

    @Override
    public String EncoderByMd5(String str) {
        //确定计算方法
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            String newstr = null;
            newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
            return newstr;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return  null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean checkpassword(String newpasswd, String oldpasswd) {
        if(EncoderByMd5(newpasswd).equals(oldpasswd)) {
            return true;
        } else {
            return false;
        }
    }
}
