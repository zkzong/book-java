package com.zkzong.base64.jdk;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
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
     * @param data
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String encode(String data) throws UnsupportedEncodingException {
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] b = data.getBytes(ENCODING);
        return encoder.encodeBuffer(b);
    }

    /**
     * Base64解码
     * @param data
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String decode(String data) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] b = decoder.decodeBuffer(data);
        return new String(b, ENCODING);
    }
}
