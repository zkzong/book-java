package com.zkzong.md.jdk;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertArrayEquals;

/**
 * MD校验
 * Created by Administrator on 2017/5/15.
 */
public class MDCoderTest {
    /**
     * 测试MD2
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void testEncodeMD2() throws NoSuchAlgorithmException {
        String str = "MD2消息摘要";
        // 获得摘要信息
        byte[] data1 = MDCoder.encodeMD2(str.getBytes());
        byte[] data2 = MDCoder.encodeMD2(str.getBytes());

        // 校验
        assertArrayEquals(data1, data2);
    }

    /**
     * 测试MD5
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void testEncodeMD5() throws NoSuchAlgorithmException {
        String str = "MD5消息摘要";
        // 获得摘要信息
        byte[] data1 = MDCoder.encodeMD5(str.getBytes());
        byte[] data2 = MDCoder.encodeMD5(str.getBytes());

        // 校验
        assertArrayEquals(data1, data2);
    }
}
