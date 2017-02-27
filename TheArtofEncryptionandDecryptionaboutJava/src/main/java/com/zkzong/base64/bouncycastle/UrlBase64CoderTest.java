package com.zkzong.base64.bouncycastle;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by zong on 2017/2/21.
 * Base64编码与解码测试类
 */
public class UrlBase64CoderTest {
    /**
     * 测试Base64编码与解码
     */
    @Test
    public final void test() throws IOException {
        String inputStr = "Java加密与解密的艺术";

        System.err.println("原文:\n\t" + inputStr);

        // 进行Base64编码
        String code = UrlBase64Coder.encode(inputStr);

        System.err.println("Base64编码后:\n\t" + code);

        // 进行Base64解码
        String outputStr = UrlBase64Coder.decode(code);
        System.err.println("Base64解码后:\n\t" + outputStr);

        // 使用apache commons的Base64解码
        outputStr = new String(Base64.decodeBase64(code));
        System.out.println("apache commons Base64解码后:\n\t" + outputStr);

        // 验证Base64编码解码一致性
        assertEquals(inputStr, outputStr);
    }

}
