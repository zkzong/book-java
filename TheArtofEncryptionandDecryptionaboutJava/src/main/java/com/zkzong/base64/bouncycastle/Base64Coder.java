package com.zkzong.base64.bouncycastle;

import org.bouncycastle.util.encoders.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by zong on 2017/2/21.
 * Base64组件
 */
public abstract class Base64Coder {
    /**
     * 字符编码
     */
    public final static String ENCODING = "UTF-8";

    /**
     * Base64编码
     * @param data 将编码数据
     * @return 编码数据
     * @throws UnsupportedEncodingException
     */
    public static String encode(String data) throws UnsupportedEncodingException {
        // 执行编码
        byte[] b = Base64.encode(data.getBytes(ENCODING));
        return new String(b, ENCODING);
    }

    /**
     * Base64解码
     * @param data 待解码数据
     * @return 解码数据
     * @throws UnsupportedEncodingException
     */
    public static String decode(String data) throws UnsupportedEncodingException {
        // 执行解码
        byte[] b = Base64.decode(data.getBytes(ENCODING));
        return new String(b, ENCODING);
    }
}
