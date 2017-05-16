package com.zkzong.md.codec;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * MD5校验
 * Created by Zong on 2017/5/15.
 */
public class MD5CoderTest {
    /**
     * 测试MD5
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void testEncodeMD5() throws NoSuchAlgorithmException {
        String str = "MD5消息摘要";
        // 获得摘要信息
        byte[] data1 = MD5Coder.encodeMD5(str);
        byte[] data2 = MD5Coder.encodeMD5(str);

        // 校验
        assertArrayEquals(data1, data2);
    }

    /**
     * 测试MD5Hex
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void encodeMD5Hex() throws NoSuchAlgorithmException {
        String str = "MD5消息摘要";
        // 获得摘要信息
        String data1 = MD5Coder.encodeMD5Hex(str);
        String data2 = MD5Coder.encodeMD5Hex(str);
        System.out.println("原文：\t" + str);
        System.out.println("MD4Hex-1：\t" + data1);
        System.out.println("MD4Hex-2：\t" + data2);

        // 校验
        assertEquals(data1, data2);
    }
}
