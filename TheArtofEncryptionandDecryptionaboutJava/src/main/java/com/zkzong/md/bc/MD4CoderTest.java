package com.zkzong.md.bc;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * MD4校验
 * Created by Administrator on 2017/5/15.
 */
public class MD4CoderTest {
    /**
     * 测试MD4
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void testEncodeMD4() throws NoSuchAlgorithmException {
        String str = "MD4消息摘要";
        // 获得摘要信息
        byte[] data1 = MD4Coder.encodeMD4(str.getBytes());
        byte[] data2 = MD4Coder.encodeMD4(str.getBytes());

        // 校验
        assertArrayEquals(data1, data2);
    }

    /**
     * 测试MD4Hex
     * @throws NoSuchAlgorithmException
     */
    @Test
    public final void encodeMD4Hex() throws NoSuchAlgorithmException {
        String str = "MD4消息摘要";
        // 获得摘要信息
        String data1 = MD4Coder.encodeMD4Hex(str.getBytes());
        String data2 = MD4Coder.encodeMD4Hex(str.getBytes());
        System.out.println("原文：\t" + str);
        System.out.println("MD4Hex-1：\t" + data1);
        System.out.println("MD4Hex-2：\t" + data2);

        // 校验
        assertEquals(data1, data2);
    }
}
